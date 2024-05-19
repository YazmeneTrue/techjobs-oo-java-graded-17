package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

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


}

    }
