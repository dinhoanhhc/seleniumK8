package lab_08_01;

public class Contract extends Employee {

    private final double CONTRACTOR_SALARY = 40000;

    @Override
    public double getSalary() {
        return CONTRACTOR_SALARY;
    }
}
