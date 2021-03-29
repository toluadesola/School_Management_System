package decagon.tolulope;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Course course = new Course("English Language", 3);
    Class myClass = new Class("S.S.1");

    Student student = new Student("Paul", "Smith", 'M', "SRS1234", myClass, course );


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
        assertEquals("S.S.1", student.myClass().getMyClass());
    }

    //test for student name
    @Test
    void getStudentName() {
        assertEquals("Paul", student.getFirstName());
    }
}