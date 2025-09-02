import java.io.*;
import java.util.*;
public class ViewData {
    public static void viewById(Scanner sc) {
        try {
            System.out.print("Enter Application ID: ");
            String searchId = sc.nextLine();
            String[] applicant = getApplicant(searchId);
            String[] kyc = getKYC(searchId);
            String card = getCard(searchId);
            if (applicant == null) {
                System.out.println("No applicant found with ID: " + searchId);
                return;
            }
            System.out.println("\n=== Applicant Full Details ===");
            System.out.println("Application ID : " + applicant[0]);
            System.out.println("Name           : " + applicant[1]);
            System.out.println("Age            : " + applicant[2]);
            System.out.println("Address        : " + applicant[3]);
            System.out.println("ID Proof       : " + applicant[4] + " - " + applicant[5]);
            System.out.println("\n--- KYC Information ---");
            if (kyc != null) {
                System.out.println("Status         : " + kyc[1]);
                System.out.println("Uploaded File  : " + kyc[2]);
                if (kyc.length >= 4) {
                    System.out.println("Reviewed By    : " + kyc[3]);
                }
            } else {
                System.out.println("KYC            : Not Uploaded");
            }
            System.out.println("\n--- ATM Card Issuance ---");
            if (card != null) {
                System.out.println("Card Status    : ISSUED");
                System.out.println("Card Number    : " + card);
            } else {
                System.out.println("Card Status    : NOT ISSUED");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void viewAll() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("applicants.txt"));
            String line;
            System.out.println("\n=== All Applicants Summary ===");
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                String appId = data[0];
                String[] kyc = getKYC(appId);
                String card = getCard(appId);
                System.out.println("------------------------------");
                System.out.println("Application ID: " + appId);
                System.out.println("Name          : " + data[1]);
                System.out.println("Age           : " + data[2]);
                System.out.println("Address       : " + data[3]);
                System.out.println("ID Proof      : " + data[4] + " - " + data[5]);
                if (kyc != null) {
                    System.out.println("KYC Status    : " + kyc[1]);
                    if (kyc.length >= 4) {
                        System.out.println("Reviewed By   : " + kyc[3]);
                    }
                } else {
                    System.out.println("KYC Status    : Not Uploaded");
                }
                if (card != null) {
                    System.out.println("Card Status   : ISSUED");
                    System.out.println("Card Number   : " + card);
                } else {
                    System.out.println("Card Status   : NOT ISSUED");
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
    private static String[] getApplicant(String id) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("applicants.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.startsWith(id + "|")) {
                br.close();
                return line.split("\\|");
            }
        }
        br.close();
        return null;
    }
    private static String[] getKYC(String id) throws IOException {
        File file = new File("kyc_status.txt");
        if (!file.exists()) return null;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts[0].equals(id)) {
                br.close();
                return parts;
            }
        }
        br.close();
        return null;
    }
    private static String getCard(String id) throws IOException {
        File file = new File("cards_issued.txt");
        if (!file.exists()) return null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts[0].equals(id)) {
                br.close();
                return parts[1];
            }
        }
        br.close();
        return null;
    }
}