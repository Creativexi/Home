package less12.Employee;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FullReport {

    public static void generateFullReport(Locale locale, Employee[] employees) {



        printEmployeeInfo(getNumberFormat(locale), getDateFormat(locale), employees);
        System.out.println();
    }

    private static void printEmployeeInfo(NumberFormat nf, DateFormat df, Employee[] employees) {
        System.out.printf("%-25s %-15s %10s\n", "Employee Fullname",  "Salary", "Salary Date");
        for (Employee employee : employees) {
            System.out.printf(Locale.UK, "%-25s %-15s %s %n",
                    employee.getFullName(), nf.format(employee.getSalary()),
                    df.format(employee.getSalaryDate()));

        }
    }
    private static NumberFormat getNumberFormat(Locale locale) {
        NumberFormat nf = NumberFormat.getInstance(locale);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf;
    }

    private static DateFormat getDateFormat(Locale locale) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        return df;
    }

}
