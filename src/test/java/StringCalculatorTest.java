import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    public void emptyStringTest() {
        assertEquals(0, calculator.emptyString(""));
    }

    @Test
    public void sumTwoNumbersByComaOrEnter() {
        assertEquals(7, calculator.sumTwoNumbersByComaOrEnter("2,5"));
        assertEquals(7, calculator.sumTwoNumbersByComaOrEnter("2\n5"));
    }

    @Test
    public void checkNumberOver1000() {
        assertEquals(0, calculator.checkNumberOver1000("1001"));
        assertEquals(400, calculator.checkNumberOver1000("400"));
    }

    @Test
    public void negativeNumberCheck() {
        assertEquals(0, calculator.negativeNumberCheck("0"));
        Exception thrown = assertThrows(Exception.class, () ->
                calculator.negativeNumberCheck("-1"));
        assertEquals("El numero debe ser positvo", thrown.getMessage());
    }

    @Test
    public void manyDelimeters() throws Exception{

        assertEquals(4, calculator.differentDelimiter("1-h1-h2","-h"));

    }

    @Test
    public void differentDelimiterTest() throws Exception {

        assertEquals(4, calculator.differentDelimiter("1h1h2","h"));


    }


}