import java.io.*;
import java.util.*;
public class KYC {
    public static void upload(Scanner sc) {
        try {
            System.out.print("Enter your Application ID: ");
            String id = sc.nextLine();
            System.out.print("Enter path to KYC document: ");
            String filePath = sc.nextLine();
            String data = id + "|Pending|" + filePath;
            FileWriter fw = new FileWriter("kyc_status.txt", true);
            fw.write(data + "\n");
            fw.close();
            System.out.println("KYC uploaded and status is pending.");
        } catch (Exception e) {
            System.out.println("Error uploading KYC: " + e.getMessage());
        }
    }
}
