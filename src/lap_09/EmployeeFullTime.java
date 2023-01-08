package lap_09;

public class EmployeeFullTime extends Employee {
    private double SALARY_FULL_TIME = 50000;

    @Override
    public double getSalary() {
        return SALARY_FULL_TIME;
    }
}
