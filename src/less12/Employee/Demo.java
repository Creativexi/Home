package less12.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John B", 3500),
                new Employee("Mike S.", 4000),
                new Employee("Sarah C.", 4150),
                new Employee("David B.", 3200),
        };

        Report.reportView(employees);

    }
}
