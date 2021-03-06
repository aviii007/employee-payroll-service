import org.junit.*;
import java.util.*;

public class EmployeePayRollTest {
    @Test
    public void given3EmployeesStoreToFileShouldPassTest() {
        ArrayList<EmployeePayRoll> empPayRoll = new ArrayList<EmployeePayRoll>();
        empPayRoll.add(new EmployeePayRoll(1, "Avi", 1000000));
        empPayRoll.add(new EmployeePayRoll(2, "Ashvini", 500000));
        EmployeePayRollService empPayRollService = new EmployeePayRollService(empPayRoll);
        empPayRollService.writeData("File");
        empPayRollService.printData("File");
        int entries = empPayRollService.noOfEntries("File");
        boolean result = entries == 2 ? true : false;
        Assert.assertTrue(result);
    }

    @Test
    public void readingFromFileNoOfEntriesShouldMatchActual() {
        EmployeePayRollService empPayRollService = new EmployeePayRollService();
        int entries = empPayRollService.readData("File");
        boolean result = entries == 2 ? true : false;
        Assert.assertTrue(result);
    }

}
