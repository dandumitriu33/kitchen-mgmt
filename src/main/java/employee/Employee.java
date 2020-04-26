package employee;

abstract public class Employee {
    String name;
    int birthday;
    int salary;
    double taxRate = 0.99; // can be made final/constant

    public Employee() {
        super();
    }

    public double createTaxReport() {
        return salary*taxRate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
