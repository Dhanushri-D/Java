import java.util.Scanner;
import java.io.*;
public class FileWrite{
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("input.txt",true);//open add data and close,create file obj// if change to true it is append mode//if it is in false it will flush all data in file and recreate it
            BufferedWriter bw = new BufferedWriter(fw);//not help in writing many line;
            PrintWriter pw = new PrintWriter(bw);//write multiple lines;to write pw objiect
            pw.nextLine();
            //only when we close bufferedreader and writter then only data would be written in file
            pw.close();//if we change order it may throw error
            bw.close();
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}