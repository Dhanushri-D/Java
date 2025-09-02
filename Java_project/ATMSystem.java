import java.util.Scanner;
public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== ATM Card Issuance & KYC System ===");
            System.out.println("1. Apply for ATM Card");
            System.out.println("2. Upload KYC Document");
            System.out.println("3. Bank Officer Approval");
            System.out.println("4. Issue ATM Card");
            System.out.println("5. View Particular Applicant Details");
            System.out.println("6. View All Applicants");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Applicant.apply(sc);
                    break;
                case 2:
                    KYC.upload(sc);
                    break;
                case 3:
                    BankOfficer.review(sc);
                    break;
                case 4:
                    CardIssuer.issueCard(sc);
                    break;
                case 5:
                    ViewData.viewById(sc);
                    break;
                case 6:
                    ViewData.viewAll();
                    break;
                case 7:
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);
        sc.close();
    }
}