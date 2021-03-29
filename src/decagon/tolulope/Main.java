package decagon.tolulope;

public class Main {
    public static void main(String[] args) {

        //creating course object
        Course course = new Course("Mathematics", 2);

        //creating myClass object
        Class myClass = new Class("SS1");

        //creating applicant1 and applicant2 object
        Person applicant1 = new Person("Olaoluwa", "Paul", 'M', 23);
        Person applicant2 = new Person("Philip", "Justin", 'F', 14);

        //creating principal object
        Person principal = new Person("Ajayi", "Adedapo", 'M', "Principal", "ER123");

        //creating teacher object
        Person teacher = new Person("Opeyemi", "Tomi", 'M', "Teacher", "RD1232", course);

        //creating student object
        Person student = new Person("Olakunle", "Fola", 'M', "ST091", course, myClass);

        //Assign teacher to a course
        System.out.println(teacher.takeCourse());

        //Test expel student function
        System.out.println(principal.expelStudent());

        //Check students admission
        System.out.println(principal.checkAdmission(applicant1.getAge()));
        System.out.println(principal.checkAdmission(applicant2.getAge()));

        //Get Students Class
        System.out.println("Your class is " + student.getMyClass().getMyClass());

        //Get students course
        System.out.println("The title of your course is " + student.course().getCourseTitle());
    }
}
