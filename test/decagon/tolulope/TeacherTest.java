package decagon.tolulope;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    //creating course object
    Course course = new Course("Mathematics", 2);

    //creating person object
    Person teacher = new Person("Opeyemi", "Tomi", 'M', "Teacher", "RD1232", course);

    //test takeCourse method
    @Test
    void takeCourse() {
        assertEquals("You have been assigned to teach this course", teacher.takeCourse());
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