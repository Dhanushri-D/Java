import java.io.*;
import java.util.*;
public class CardIssuer {
    public static void issueCard(Scanner sc) {
        try {
            File kycFile = new File("kyc_status.txt");
            if (!kycFile.exists()) {
                System.out.println("KYC status file not found.");
                return;
            }
            File issuedFile = new File("cards_issued.txt");
            if (!issuedFile.exists()) {
                issuedFile.createNewFile();
            }
            Set<String> issued = new HashSet<>();
            try (BufferedReader issuedReader = new BufferedReader(new FileReader(issuedFile))) {
                String issuedLine;
                while ((issuedLine = issuedReader.readLine()) != null) {
                    String[] parts = issuedLine.split("\\|");
                    if (parts.length >= 2) {
                        issued.add(parts[0]);
                    }
                }
            }
            boolean found = false;
            try (BufferedReader br = new BufferedReader(new FileReader(kycFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    if (parts.length >= 3 && parts[1].equalsIgnoreCase("Approved") && !issued.contains(parts[0])) {
                        found = true;
                        String cardNumber = generateCardNumber();
                        try (FileWriter fw = new FileWriter(issuedFile, true)) {
                            fw.write(parts[0] + "|" + cardNumber + "\n");
                        }
                        System.out.println("\nATM Card issued for Application ID: " + parts[0]);
                        System.out.println("Card Number: " + cardNumber);
                    }
                }
            }
            if (!found) {
                System.out.println("No new approved KYC applications found for card issuance.");
            }
        } catch (IOException e) {
            System.out.println("Error in issuing card: " + e.getMessage());
        }
    }
    private static String generateCardNumber() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int block = 1000 + rand.nextInt(9000); // ensures 4-digit block
            sb.append(block);
            if (i < 3) sb.append(" ");
        }
        return sb.toString();
    }
}