public class User{
    String User_id;
    String User_name;
    String User_add;
    String User_ph;
    public User(){
    }
    public User(String id,String name,String add,String ph){
        this.User_id=id;
        this.User_name=name;
        this.User_add=add;
        this.User_ph=ph;
    }
    public String getId(){
        return User_id;
    }
    public void setId(){
        this.User_id=User_id;
    }
    public String getName(){
        return User_name;
    }
    public void setName(){
        this.User_name=User_name;
    }
    public String getAdd(){
        return User_add;
    }
    public void setAdd(){
        this.User_add=User_add;
    }
    public String getPh(){
        return User_ph;
    }
    public void setPh(){
        this.User_ph=User_ph;
    }
    public String toString(){
        return "User [ id = " + User_id + " , Name = " +User_name+" , Address = "+User_add+" , Phone Number = "+User_ph+"]";
    }
}