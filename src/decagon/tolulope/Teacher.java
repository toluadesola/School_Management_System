package decagon.tolulope;

public class Teacher extends Staff{
    private Course course;

    public Teacher(String firstName, String lastName, char gender, String staffID, Course course) {
        super(firstName, lastName, gender, staffID);
        this.course = course;
    }

    public Course course(){
        return course;
    }






}
