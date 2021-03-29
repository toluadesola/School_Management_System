package decagon.tolulope;

public class Principal extends Staff{
    private Applicants applicant;

    private int admissionAge = 16; //Age limit for admission

    public Principal(String firstName, String lastName, char gender, String staffID, Applicants applicant) {
        super(firstName, lastName, gender, staffID);
        this.applicant = applicant;
    }

    //method to expel Student
    public String expelStudent(){
        return "Hello, you have been expelled from this school";
    }

    public Applicants applicant(){
        return applicant;
    }

    //method to check admission based on age criteria
    public String admissionsCheck(int applicantAge){
        if(applicantAge >= admissionAge){
            return "Admission Successful.";
        }else {
            return "Admission not successful.";
        }
    }
}
