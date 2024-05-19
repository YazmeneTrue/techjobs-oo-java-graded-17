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
   Job demoJob = new Job("Product tester", new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

   assertEquals("Product tester", demoJob.getName());
   assertEquals("ACME", demoJob.getEmployer().getValue());
   assertEquals("Desert", demoJob.getLocation().getValue());
   assertEquals("Quality control", demoJob.getPositionType().getValue());
   assertEquals("Persistence", demoJob.getCoreCompetency().getValue());

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
}
