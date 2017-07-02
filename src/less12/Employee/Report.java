package less12.Employee;

import java.util.Locale;

public class Report {
    public static void reportView(Employee[] employees) {
        System.out.printf("%-20s       %s\n", "Employee Fullname",  "Salary");
        for (Employee employee : employees) {
            System.out.printf("%-25s    %.2f\n", employee.getFullName(), employee.getSalary());
        }

        }
    }
