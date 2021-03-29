package decagon.tolulope;

public class Person implements PersonInterface {
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private String designation;
    private String staffID;
    private String studentID;
    private Course course;
    private Class myClass;

    //constructor for Principal and Non-Teaching staff
    public Person(String firstName, String lastName, char gender, String designation, String staffID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.designation = designation;
        this.staffID = staffID;
    }

    //constructor for Teaching class
    public Person(String firstName, String lastName, char gender, String designation, String staffID, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.designation = designation;
        this.staffID = staffID;
        this.course = course; //the course to be taught by the teacher
    }

    //constructor for student
    public Person(String firstName, String lastName, char gender, String studentID, Course course, Class myClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.studentID = studentID;
        this.course = course;
        this.myClass = myClass;
    }

    //constructor for applicant
    public Person(String firstName, String lastName, char gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    //method to assign the teacher to take a course
    public String takeCourse() {
        if(this.designation.equals("Teacher")){
            return "You have been assigned to teach this course";
        }else {
            return "You cannot teach a course";
        }
    }

    //method to expel Student
    public String expelStudent(){
        return "Hello, you have been expelled from this school";
    }

    //method to check admission based on age criteria
    public String checkAdmission(int age){
        if(age >= 16){
            return "Admission Successful.";
        }else {
            return "Admission not successful.";
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getStudentID() {
        return studentID;
    }

    //return Course class
    public Course course() {
        return course;
    }

    //return Class class
    public Class getMyClass() {
        return myClass;
    }
}
