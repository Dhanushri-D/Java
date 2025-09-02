import java.io.*;
import java.util.*;
public class BankOfficer {
    public static void review(Scanner sc) {
        try {
            List<String> lines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("kyc_status.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            List<String> updatedLines = new ArrayList<>();
            for (String entry : lines) {
                String[] parts = entry.split("\\|");
                if (parts.length >= 3 && parts[1].equals("Pending")) {
                    System.out.println("\nApplication ID: " + parts[0]);
                    System.out.println("Document Path: " + parts[2]);
                    System.out.print("Approve (A) or Reject (R)? ");
                    String decision = sc.nextLine();
                    if (decision.equalsIgnoreCase("A")) {
                        entry = parts[0] + "|Approved|" + parts[2];
                    } else {
                        entry = parts[0] + "|Rejected|" + parts[2];
                    }
                }
                updatedLines.add(entry);
            }
            FileWriter fw = new FileWriter("kyc_status.txt", false);
            for (String updated : updatedLines) {
                fw.write(updated + "\n");
            }
            fw.close();
            System.out.println("KYC Review completed.");
        } catch (Exception e) {
            System.out.println("Error in reviewing KYC: " + e.getMessage());
        }
    }
}