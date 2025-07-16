import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FloatIO{
    public static void main(String agrs[])throws IOException{
        float f;
        Float fnum;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        f=Float.parseFloat(br.readLine());
        fnum=Float.parseFloat(br.readLine());
        System.out.println(f + " " +fnum);//takes only the string
        System.out.printf("%.2f %.2f\n",f,fnum);
        System.out.printf("%4f %4f\n",f,fnum);
    }
}