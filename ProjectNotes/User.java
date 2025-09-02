public class User {
    Integer id;
    String name;
    String rollNo;
    UserType usertype;

    public User(Integer id,String name,String rollNo, UserType userType){
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.usertype = userType;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getRollNo(){
        return this.rollNo;
    }

    public String getUserTypeName(){
        return this.userType.getType();
    }
}