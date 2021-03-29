package decagon.tolulope;

public class Main {
    private static Class myclass = new Class("SS1");
    private static Course course = new Course("Mathematics", 2);
    private static Student student = new Student("Ayo", "Salami", 'M', "ST101", myclass, course );

    public static void main(String[] args) {
        System.out.println(student.myClass().getMyClass());
        System.out.println(student.course().getCourseTitle());

//        student.addCourse("English",);
    }
}
