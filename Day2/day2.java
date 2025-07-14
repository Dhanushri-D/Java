class one{
    public void display(){
        System.out.println("hi from one");
    }
}
class two{
    public void display(){
        System.out.println("hi from two");
    }
}
class Main{
    public static void main(String args[]){
        one o=new one();
        two t=new two();
        o.display();
        t.display();
        System.out.println("Command line arguments");//used to give input before processing
        System.out.println("String "+args[0]);
        System.out.println("Integer "+Integer.parseInt(args[1]));
    } 
}