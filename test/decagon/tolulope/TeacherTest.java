package decagon.tolulope;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
        Course course1 = new Course("Mathematics", 2);

        Teacher teacher = new Teacher("Tayo", "Samson", 'M', "RS1031", course1);

    @Test
    void takeCourse() {
        assertEquals("You have been assigned to teach this course", teacher.course().takeCourse());
    }

    @Test
    void getFirstName() {
        assertEquals("Tayo", teacher.getFirstName());
    }

    @Test
    void getCourseTitle() {
        assertEquals("Mathematics", teacher.course().getCourseTitle());
    }

    @Test
    void getCourseDuration() {
        assertEquals("2hrs.", teacher.course().getCourseDuration());
    }
}