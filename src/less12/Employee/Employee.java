package less12.Employee;

import java.util.Date;

public class Employee {
    String fullName;
    double salary;
    Date salaryDate ;

    public Employee(String fullname, double salary, Date salaryDate) {
        this.fullName = fullname;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setFullName(String fullname) {
        this.fullName = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
