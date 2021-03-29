package decagon.tolulope;

public class NonAcademicStaff extends Staff{
    public NonAcademicStaff(String firstName, String lastName, char gender, String staffID) {
        super(firstName, lastName, gender, staffID);
    }

    public void paySalaries(){
        System.out.println("Your salaries have been paid");
    }
}
