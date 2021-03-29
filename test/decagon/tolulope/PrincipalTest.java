package decagon.tolulope;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    Applicants applicant1 = new Applicants("Idris", "Ola", 'M', 23);
    Applicants applicant2 = new Applicants("Philip", "Will", 'F', 14);

    Principal principal1 = new Principal("Olalekan", "Apollo", 'M', "RS101", applicant1);
    Principal principal2 = new Principal("Balogun", "Ajayi", 'F', "ED2278", applicant2);

    @Test
    void expelStudent() {
        assertEquals("Hello, you have been expelled from this school", principal1.expelStudent());
    }

    @Test
    void applicant1() {
        assertEquals("Admission Successful.", principal1.admissionsCheck(principal1.applicant().getAge()));
    }

    @Test
    void applicant2() {
        assertEquals("Admission not successful.", principal2.admissionsCheck(principal2.applicant().getAge()));
    }

    @Test
    void getPrincipal1ID() {
        assertEquals("RS101", principal1.getStaffID());
    }

    @Test
    void getApplicants1Age() {
        assertEquals(23, applicant1.getAge());
    }
}