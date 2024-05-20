package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertTrue;

public class JobTest {
    //TODO: Create your unit tests here
@Test
    public void testSettingJobId(){
    Job demoJob1 = new Job();
    Job demoJob2 = new Job();

    assertNotEquals(demoJob1.getId(), demoJob2.getId());
}
@Test
    public void testJobConstructorSetsAllFields(){
   Job demoJob = new Job("demo name", new Employer("demo employer"),
            new Location("demo location"), new PositionType("demo positionType"),
            new CoreCompetency("demo coreCompetency"));

   assertEquals("demo name", demoJob.getName());
   assertEquals("demo employer", demoJob.getEmployer().getValue());
   assertEquals("demo location", demoJob.getLocation().getValue());
   assertEquals("demo positionType", demoJob.getPositionType().getValue());
   assertEquals("demo coreCompetency", demoJob.getCoreCompetency().getValue());

   assertTrue(demoJob.getEmployer() instanceof Employer);
   assertTrue(demoJob.getLocation() instanceof Location);
   assertTrue(demoJob.getPositionType() instanceof PositionType);
   assertTrue(demoJob.getCoreCompetency() instanceof CoreCompetency);
}

    @Test
    public void testJobsForEquality() {
    Job demoJob1 = new Job("demoName",
            new Employer("demoEmployer"),
            new Location("demoLocation"),
            new PositionType("demoPositionType"),
            new CoreCompetency("demoCoreCompetency"));
    Job demoJob2 = new Job("demoName",
            new Employer("demoEmployer"),
            new Location("demoLocation"),
            new PositionType("demoPositionType"),
            new CoreCompetency("demoCoreCompetency"));

   assertNotEquals(demoJob1,demoJob2);
//     assertFalse(demoJob1.equals(demoJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job demoJob = new Job("demoName",
                new Employer("demoEmployer"),
                new Location("demoLocation"),
                new PositionType("demoPositionType"),
                new CoreCompetency("demoCoreCompetency"));
        String jobString = demoJob.toString();
//        assertTrue(jobString.startsWith(System.lineSeparator()));
//        assertTrue(jobString.endsWith(System.lineSeparator()));
        assertEquals('\n', jobString.charAt(0));
        assertEquals('\n', jobString.charAt(jobString.length() - 1));

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        // Create a Job instance with specific field values
        Job demoJob = new Job("Test name", new Employer("Test employer"),
                new Location("Test location"), new PositionType("Test position type"),
                new CoreCompetency("Test core competency"));

        // Define the expected string with correct labels and data
        String expectedString = System.lineSeparator() +
                "ID: " + demoJob.getId() + System.lineSeparator() +
                "Name: Test name" + System.lineSeparator() +
                "Employer: Test employer" + System.lineSeparator() +
                "Location: Test location" + System.lineSeparator() +
                "Position Type: Test position type" + System.lineSeparator() +
                "Core Competency: Test core competency" + System.lineSeparator();

        // Compare the expected string with the actual output of the toString() method
        assertEquals(expectedString, demoJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job demoJob = new Job("", new Employer(""),
                new Location(""), new PositionType(""),
                new CoreCompetency(""));

        String expectedString = System.lineSeparator() +
                "ID: " + demoJob.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();
        assertEquals(expectedString, demoJob.toString());
    }


}
