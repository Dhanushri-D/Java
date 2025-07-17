import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter size :");
        size=sc.nextInt();
        int[] arr=new int[size];
        int [] arr1 =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Values in array");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.print();
        arr1=Arrays.copyOf(arr,size);
        System.out.println("Copied array");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}