import java.io.BufferedReader;//to get any type of input
import java.io.IOException;//to handle exception by jvm
import java.io.InputStreamReader;//to choose that given input is byte or character
public class IntegerIO{
    public static void main(String args[]) throws IOException{
        int a;
        Integer b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        System.out.println(a + " " + b);//+ using in string means concatenate
    }
}