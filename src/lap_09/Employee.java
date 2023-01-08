package lap_09;

public abstract class Employee {
    private double salary;

    public Employee() {
    }

    public abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
