package decagon.tolulope;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    //creating course object
    Course course = new Course("Mathematics", 2);

    //creating person object
    Person teacher = new Person("Opeyemi", "Tomi", 'M', "Teacher", "RD1232", course);

    //creating non-teaching staff object
    Person nonTeachingStaff = new Person("Ope", "Samuel", 'F', "Non-Teaching", "ES321");


    //test takeCourse method
    @Test
    void takeCourse() {
        assertEquals("You have been assigned to teach this course", teacher.takeCourse(teacher.getDesignation()));
    }//test takeCourse method

    @Test
    void takeCourseNonTeachingStaff() {
        assertEquals("You cannot teach a course", nonTeachingStaff.takeCourse(nonTeachingStaff.getDesignation()));
    }

    //get teacher firstName
    @Test
    void getFirstName() {
        assertEquals("Opeyemi", teacher.getFirstName());
    }

    //get course title
    @Test
    void getCourseTitle() {
        assertEquals("Mathematics", teacher.course().getCourseTitle());
    }

    //get course duration
    @Test
    void getCourseDuration() {
        assertEquals("2hrs.", teacher.course().getCourseDuration());
    }
}