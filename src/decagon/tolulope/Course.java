package decagon.tolulope;

public class Course {
    private String courseTitle;
    private int courseDuration;

    //constructors with field courseTitle & courseDuration
    public Course(String courseTitle, int courseDuration) {
        this.courseTitle = courseTitle;
        this.courseDuration = courseDuration;
    }

    //method to assign the teacher to take a course
    public String takeCourse() {
        return "You have been assigned to teach this course";
    }

    //method to register a student for a course
    public String registerCourse() {
        return "You have been registered to take this course";
    }

    //method to get a course' title
    public String getCourseTitle() {
        return this.courseTitle;
    }

    //method to get the duration of a course
    public String getCourseDuration() {
        return this.courseDuration + "hrs.";
    }
}
