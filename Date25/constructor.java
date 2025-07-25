class A{
    A(){
        System.out.println("Default A");
    }
    public A(Integer num){
        System.out.println("From A value is "+num);
    }
    public void display(){
        System.out.println("From A");
    }
}
class B extends A{
    B(Integer num1){
        super(num1);//override the default
        System.out.println("From B value is "+num1);
    }
}
public class constructor{
    public static void main(String args[]){
        B b1=new B(2);
        b1.display();
    }
}