package decagon.tolulope;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    //creating course object
    Course course = new Course("English Language", 3);

    //creating myClass object
    Class myClass = new Class("S.S.1");

    //creating person object
    Person student = new Person("Olakunle", "Fola", 'M', "ST091", course, myClass);


    //get registered course
    @Test
    void registerCourse() {
        assertEquals("You have been registered to take this course", student.course().registerCourse());
    }

    //test to get students course title
    @Test
    void getCourseTitle() {
        assertEquals("English Language", student.course().getCourseTitle());
    }

    //test for student class
    @Test
    void getStudentClass() {
        assertEquals("S.S.1", student.getMyClass().getMyClass());
    }

    //test for student name
    @Test
    void getStudentName() {
        assertEquals("Olakunle", student.getFirstName());
    }
}