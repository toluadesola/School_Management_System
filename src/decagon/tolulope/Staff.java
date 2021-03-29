package decagon.tolulope;

public class Staff extends Person{
    private String staffID;
    private int gradeLevel;

    public Staff(String firstName, String lastName, char gender, String staffID) {
        super(firstName, lastName, gender);
        this.staffID = staffID;
        this.gradeLevel = 0;
    }

    public String getStaffID() {
        return staffID;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
