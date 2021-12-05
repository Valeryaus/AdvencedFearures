package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testAddTwoNumbers() {
        //given
        int firstNumber = 12;
        int secondNumber = 3;

        //when
        int actualAddResult = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(15, actualAddResult); //JUNIT assertEquals
        assertThat(actualAddResult).isEqualTo(15); //Tas pats su ASSERTJ biblioteka

    }

    @Test
    void testAddMultipleNumbers() {
        //given
        int[] numbertsToTest = {5, 2, 6, 1};

        //when
        int actualResults = calculator.addMultipleNumbers(numbertsToTest);

        //then
        assertEquals(14, actualResults); // pvz dviem variantais
        assertThat(actualResults).isEqualTo(14); // pvz dviem variantais, tai naudojam ta kuris labiau patinka
    }

    @Test
    void testSubtractTwoNumbers() {
        //given
        int thirdNumber = 12;
        int fourthNumber = 3;

        //when
        int actualSubtractResult = calculator.subtractTwoNumbers(thirdNumber, fourthNumber);

        //then
        assertEquals(9, actualSubtractResult); //JUNIT assertEquals
        assertThat(actualSubtractResult).isEqualTo(9); //Tas pats su ASSERTJ biblioteka
    }

    @Test
    void subtractMultipleNumbers() {
        //given
        int[] numbertsToTest = {5, 2, 6, 1};

        //when
        int actualResults = calculator.subtractingMultipleNumbers(numbertsToTest);

        //then
        assertEquals(-4, actualResults); // pvz dviem variantais
        assertThat(actualResults).isEqualTo(-4); // pvz dviem variantais, tai naudojam ta kuris labiau patinka
    }

    @Test
    void multiplyingTwoNumbers() {
        //given
        int firstNumber = 8, secondNumber = 8;
        //when
        int actualResult = calculator.multiply(firstNumber, secondNumber);
        //then
        assertThat(actualResult).isEqualTo(64);

    }

    @Test
    void divideTwoNumbers() {
        int thirdNumber = 4, fourthNumber = 2;

        double actualResult = calculator.divide(thirdNumber, fourthNumber);

        assertThat(actualResult).isEqualTo(2);

    }

    @Test
    void testDivideTwoNumbersWhereResultIsNotInteger() {
        int thirdNumber = 9, fourthNumber = 2;

        double actualResult = calculator.divide(thirdNumber, fourthNumber);

        assertThat(actualResult).isEqualTo(4.5);
    }

//    @Test
//    void testDivideNumberByZero() {
//        //given
//        ArithmeticException exception = assertThrows(
//                ArithmeticException.class,
//                () -> calculator.divide(5, 0)
//        );
//
//        assertTrue(exception.getMessage().contains("by zero"));
    }

