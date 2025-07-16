import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DoubleIO{
    public static void main(String args[])throws IOException{
        double d;
        Double D;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        d=Double.parseDouble(br.readLine());
        D=Double.parseDouble(br.readLine());
        System.out.println(d+" "+D);
    }
}