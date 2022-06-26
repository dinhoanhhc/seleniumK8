package lab_08_01;

import java.util.Arrays;
import java.util.List;

public class TotalSalaryTest {

    public static void main(String[] args) {

        FullTime fullTime1 = new FullTime();
        FullTime fullTime2 = new FullTime();
        FullTime fullTime3 = new FullTime();
        Contract contractor1 = new Contract();
        Contract contractor2 = new Contract();

        double totalSalary = new TotalSalaryTest().totalSalary(Arrays.asList(fullTime1, fullTime2, fullTime3, contractor1, contractor2));
        System.out.println("Total Salary is: " + totalSalary);

    }

    public double totalSalary(List<Employee> employeeList) {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;

    }

}