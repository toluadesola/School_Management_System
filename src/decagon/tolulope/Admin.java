package decagon.tolulope;

public class Admin implements IPersonInterface  {


    //method to assign the teacher to take a course
    public String takeCourse(String designation) {
        if(designation.equals("Teacher")){
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

    //pay Salaries
    public String paySalaries(String designation){
        if(designation.equals("Non-Teaching")){
            return "Your Salaries will be paid in less than 12hours.";
        }else{
            return "You do not have permission to do this";
        }
    }

}
