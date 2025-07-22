import java.util.*;
class StudentMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Integer n;
        n=Integer.parseInt(sc.nextLine());
        student [] sarr=new student[n];
        student s;
        for(int i=0;i<n;i++){
            String ip=sc.nextLine();
            String [] arr=ip.split(" ");
            sarr[i]= new student(Integer.parseInt(arr[0]),arr[1],(Integer.parseInt(arr[2])+Integer.parseInt(arr[3])+Integer.parseInt(arr[4])));
        }
        Arrays.sort(sarr);
        int rank=1;
        for(int i= n - 1;i>=0;i--){
            System.out.println(sarr[i]+" "+rank);
            rank++;
        }
    }
}

class student implements Comparable<student>{
    String name;
    Integer roll_no;
    Integer total;
    public student(Integer no,String name,Integer tot){
        this.roll_no=no;
        this.name=name;
        this.total=tot;
    }
    public String toString(){
        return roll_no+" "+name;
    }
    public int compareTo(student s){
        return this.total.compareTo(s.total);
    }
}