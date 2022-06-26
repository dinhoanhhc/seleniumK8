package lab_08_01;

public class FullTime extends Employee {

    private final double FULLTIME_SALATY = 50000;

    @Override
    public double getSalary() {
        return FULLTIME_SALATY;
    }
}

