package lap_09;

import java.util.ArrayList;
import java.util.List;

public class CalculateSalaryController {

    public static void main(String[] args) {
        Employee employeeFullTime = new EmployeeFullTime();
        Employee employeeContract = new EmployeeContract();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employeeFullTime);
        employeeList.add(employeeFullTime);
        employeeList.add(employeeFullTime);
        employeeList.add(employeeContract);
        employeeList.add(employeeContract);

        double totalSalary = calculateSalary(employeeList);
        System.out.println("Total salary:" + totalSalary);
    }

    public static double calculateSalary(List<Employee> employeeList) {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
