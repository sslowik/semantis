package utils;

public class Accountant {
    public int countPeriodsToDoubleInitialValue(double initialSum, double percentage) throws IllegalArgumentException {
        if (percentage <= 0) throw new IllegalArgumentException("Percentage is not positive.");
        int periodsToDouble = 0;
        double currentSum = initialSum;
        while (currentSum < initialSum * 2) {
            currentSum += currentSum * percentage;
//            System.out.println("currentSum = " + currentSum);
            periodsToDouble++;
        }
        double excess = currentSum % initialSum;
        System.out.println("Value: " + initialSum + " with percentage: " + percentage + " will be doubled after: " + periodsToDouble + " periods with final total amount: " + currentSum + ". Excess: " + excess);
        return periodsToDouble;
    }
}
