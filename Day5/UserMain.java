import java.util.Scanner;
import java.util.Arrays;
class UserMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        size=Integer.parseInt(sc.nextLine());
        User [] arr=new User[size];
        String id,name,add,ph;
        User s;//reference which create student object
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+" User data:");
            System.out.print("Id : ");
            id = sc.nextLine();
            System.out.print("Name : ");
            name = sc.nextLine();
            System.out.print("Address : ");
            add = sc.nextLine();
            System.out.print("Phone number : ");
            ph = sc.nextLine();
            s=new User(id,name,add,ph);
            arr[i]=s;
        }
        for(User i : arr){
            System.out.println(i);
        }
    }
}