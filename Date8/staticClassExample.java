class B{
    B(){
        System.out.println("constructor B");
    }
    //when class comes into existence static is executed
    public static void display(){//static function  it will work because declared as static so no need to create object
        System.out.println("from display B");
    }
}
class A{
    static Integer num1=10;//for static variable memory created before object is created
    Integer num2=30;//for non static variable memory is created when object is created
    public A(){
        System.out.println("from A");
    }
    static{//static block this will be executed first
        System.out.println("hai from static block");
    }
    public static void method1(){
        System.out.println("from method1 : "+ num1++);
        //System.out.println("from method1 : "+ num2); error: non-static variable num2 cannot be referenced from a static context
    }
    public void method2(){
        System.out.println("from method2 : "+num1);
        System.out.println("from method2 : "+ num2);
    }
}
public class staticClassExample{
    public static void main(String[] args){
        A.method1();
        System.out.println("creating object");
        A a=new A();
        a.method2();//non static method so called with oubject
        B.display();//without creating object class comes into existence
        // B b=new B();
        // b.display();
    }
}