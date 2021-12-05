package testingRecap;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public int add(int firstNumber, int secondNumber) {
        LOGGER.info("Adding two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber + secondNumber;
    }

    public int addMultipleNumbers(int[] numbers) {
        LOGGER.info("Adding numbers" + Arrays.toString(numbers));
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }

    public int subtractTwoNumbers(int thirdNumber, int forthNumber) {
        LOGGER.info("Subtracting two numbers " + thirdNumber + " and " + forthNumber);
        return thirdNumber - forthNumber;
    }

    public int subtractingMultipleNumbers(int[] numbers) {
        LOGGER.info("Subtracting" + Arrays.toString(numbers));
        int totalSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            totalSum -= numbers[i];
        }
        return totalSum;

    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double thirdNumber, double fourthNumber) {
        return thirdNumber / fourthNumber;
    }
}
