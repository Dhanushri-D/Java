public class student{
    Integer id;
    String name;
    static String collegeName;//shared memory 
    public student(){//default constructor

    }
    public student(Integer id,String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println("Student details");
        System.out.println("ID = "+this.id);
        System.out.println("Name = "+this.name);
        System.out.println("College Name = "+this.collegeName);
    }
}