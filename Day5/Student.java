public class Student{
    Integer id;
    String name;
    public Student(){
        //defaut constructor , if i create parameterised constructor it will override the default
        //if i create pc jvm cannot create default
    }
    public Student(Integer id,String name){
        this.id=id;
        this.name=name;
    }
    public Integer getID(){
        return id;
    }
    public void setId(){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String toString(){
        return "Student [ id = " + id + " , Name = " +name+"]";
    }
}