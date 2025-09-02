public class Attendance {
    Integer id;
    User student;
    User faculty;
    AttendanceType status;

    public Attendance(Integer id,User student,User faculty,AttendanceType status){
        this.id = id;
        this.student = student;
        this.faculty = faculty;
        this.status = status;
    }
}