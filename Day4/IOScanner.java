import java.util.Scanner;
public class IOScanner{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        char b;
        float c;
        char d;
        a=sc.nextInt();
        sc.nextLine();//to get new line
        b=sc.nextLine().charAt(0);
        c=Float.parseFloat(sc.nextLine());
        d=sc.nextLine().charAt(0);
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}