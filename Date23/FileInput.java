import java.io.*;
import java.util.Scanner;
public class FileInput{
    public static void main(String args[]){
        File file = new File("Sample.txt");//same folder not need full path
        try{
            Scanner sc = new Scanner(file);//scanner only able to read not write
            Integer lc=0;
            Integer wc=0;
            Integer cc=0;
            while(sc.hasNextLine()){//check next line or  line is present in file
                lc=lc+1;
                String str=sc.nextLine();
                String [] arr=str.split(" ");
                wc=wc+arr.length;//like size of length it is literal give size of array
                for(String w: arr){
                    cc=cc+w.length();//it is string method
                }
                System.out.println(str);
            }
            System.out.println(lc);
            System.out.println(wc);
            System.out.println(cc);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}