package decagon.tolulope;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    //creating applicant object
    Person applicant1 = new Person("Olaoluwa", "Paul", 'M', 23);
    Person applicant2 = new Person("Philip", "Justin", 'F', 14);

    //creating principal object
    Person principal = new Person("Ajayi", "Adedapo", 'M', "Principal", "ER123");

    //test expel student
    @Test
    void expelStudent() {
        assertEquals("Hello, you have been expelled from this school", principal.expelStudent());
    }

    //test admission method
    @Test
    void applicant1() {
        assertEquals("Admission Successful.", principal.checkAdmission(applicant1.getAge()));
    }

    @Test
    void applicant2() {
        assertEquals("Admission not successful.", principal.checkAdmission(applicant2.getAge()));
    }

    //get principal ID
    @Test
    void getPrincipal1ID() {
        assertEquals("ER123", principal.getStaffID());
    }

    //get applicants age
    @Test
    void getApplicants1Age() {
        assertEquals(23, applicant1.getAge());
    }
}