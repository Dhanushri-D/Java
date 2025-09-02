import java.io.*;
import java.util.*;
public class Applicant {
    public static void apply(Scanner sc) {
        try {
            System.out.print("Enter full name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt(); sc.nextLine();
            System.out.print("Enter address: ");
            String address = sc.nextLine();
            System.out.print("Enter ID Proof Type (e.g., Aadhar): ");
            String idType = sc.nextLine();
            System.out.print("Enter ID Number: ");
            String idNumber = sc.nextLine();
            String id = "ID" + (1000 + new Random().nextInt(9000));
            String data = id + "|" + name + "|" + age + "|" + address + "|" + idType + "|" + idNumber;
            FileWriter fw = new FileWriter("applicants.txt", true);
            fw.write(data + "\n");
            fw.close();
            System.out.println("Application submitted! Your Application ID: " + id);
        } catch (Exception e) {
            System.out.println("Error while applying: " + e.getMessage());
        }
    }
}