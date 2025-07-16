import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class charIO{
    public static void main(String agrs[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer i;
        Float f;
        Character ch,c;
        String str;
        i=Integer.parseInt(br.readLine());//read until reach newline
        ch=(char)br.read();
        br.readLine();//to skip the character
        f=Float.parseFloat(br.readLine());
        c=br.readLine().charAt(0);
        str=br.readLine();
        System.out.println(i+" "+ch+" "+f+" "+c+" "+str);
        br.close();//to close the input stream from any system
    }
}