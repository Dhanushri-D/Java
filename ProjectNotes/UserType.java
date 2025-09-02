public class UserType{
    Integer id;
    String type;

    public UserType(Integer id,String type){
        this.id = id;
        this.type = type;
    }

    public Integer getId(){
        return this.id;
    }

    public String getType(){
        return this.type;
    }

}