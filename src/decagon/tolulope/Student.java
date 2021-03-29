package decagon.tolulope;

import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private Class myClass;
    private Course course;
    private ArrayList<Course> courseList;

    public Student(String firstName, String lastName, char gender, String studentID, Class myClass, Course course) {
        super(firstName, lastName, gender);
        this.studentID = studentID;
        this.myClass = myClass;
        this.course = course;
        this.courseList = new ArrayList<Course>();
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public void getCourseList(){
        for (Course course: courseList){
            System.out.println(course);
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public Class getMyClass() {
        return myClass;
    }

    public Class myClass(){
        return myClass;
    }

    public Course course(){
        return course;
    }

}
