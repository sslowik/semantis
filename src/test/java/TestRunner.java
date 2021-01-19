import utils.Accountant;

public class TestRunner {
    static Accountant calc = new Accountant();

    public static void main(String[] args) {
        calc.countPeriodsToDoubleInitialValue(123, 0.01);
    }
}
