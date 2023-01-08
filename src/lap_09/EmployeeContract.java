package lap_09;

public class EmployeeContract extends Employee {
    private double SALARY_CONTRACT = 40000;

    @Override
    public double getSalary() {
        return SALARY_CONTRACT;
    }
}
