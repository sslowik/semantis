import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int periods = getPeriodsToDoubleSum(100, -0.1);
        System.out.println("periods = " + periods);
    }

    static int getPeriodsToDoubleSum(double initialSum, double percentage) {
        if (percentage <= 0) throw new IllegalArgumentException("Percentage is not positive.");
        int periodsToDouble = 0;
        double currentSum = initialSum;
        while (currentSum < initialSum * 2) {
            currentSum += currentSum * percentage;
            System.out.println("currentSum = " + currentSum);
            periodsToDouble++;
        }
        double excess = currentSum % initialSum;
        System.out.println("excess = " + excess);
        return periodsToDouble;
    }
}
