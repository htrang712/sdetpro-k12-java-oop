package lap_07_1;

import java.util.ArrayList;
import java.util.List;

public class SalaryController {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        double totalSalary = 0;

        Employee employeeFullTime = new EmployeeFullTime();
        Employee employeeContract = new EmployeeContract();

        employeeList.add(employeeFullTime);
        employeeList.add(employeeFullTime);
        employeeList.add(employeeFullTime);
        employeeList.add(employeeContract);
        employeeList.add(employeeContract);

        totalSalary = totalSalary(employeeList);
        System.out.println("Total salary: " + totalSalary);

    }

    public static double totalSalary(List<Employee> employeeList) {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }
}
