package less12.Employee;

/**
 Создать класс Employee, у которого есть переменные класса - fullname, salary.
 Создать массив содержащий несколько объектов этого типа. Создать класс Report,
 который будет содержать статический метод generateReport, в котором выводится информация о зарплате всех сотрудников.
 Используйте форматировании строк. Пусть salary будет выровнено по правому краю,
 десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 */
public class Employee {
    String fullName;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullName = fullname;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
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
