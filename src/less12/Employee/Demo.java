package less12.Employee;

import java.util.Date;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John B.", 3500, new Date()),
                new Employee("Mike S.", 4000, new Date()),
                new Employee("Sarah C.", 4150, new Date()),
                new Employee("David B.", 3200, new Date()),
        };
        FullReport.generateFullReport(Locale.UK, employees);
    }
}
