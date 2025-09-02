public class AttendanceType {
    Integer id;
    String type;

    public AttendanceType(Integer id,String type){
        this.id = id;
        this.type=type;
    }

    public Integer getId(){
        return this.id;
    }

    public String getType(){
        return this.type; 
    }
}