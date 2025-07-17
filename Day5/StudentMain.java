import java.util.Scanner;
import java.util.Arrays;
class StudentMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        size=Integer.parseInt(sc.nextLine());
        Student [] arr=new Student[size];
        Integer id;
        String name;
        Student s;//reference which create student object
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+" Student data:");
            System.out.println("id:");
            id=Integer.parseInt(sc.nextLine());
            System.out.println("Name:");
            name=sc.nextLine();
            s=new Student(id,name);
            arr[i]=s;
        }
        for(Student i : arr){
            System.out.println(i);
        }
    }
}