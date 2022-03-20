import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();
    @Test
    public void emptyStringTest() throws Exception {
        assertEquals(0,calculator.emptyString(""));
    }

    @Test
    public void sumTwoNumbersByComaOrEnter() throws Exception{
        assertEquals(7,calculator.sumTwoNumbersByComaOrEnter("2,5"));
        assertEquals(7,calculator.sumTwoNumbersByComaOrEnter("2\n5"));
    }

    @Test
    public void checkNumberOver1000() throws Exception{
        assertEquals(0, calculator.checkNumberOver1000("1001"));
        assertEquals(400,calculator.checkNumberOver1000("400"));
    }

    @Test
    public void negativeNumberCheck() throws  Exception{
        assertEquals(0,calculator.negativeNumberCheck("0"));
        Exception thrown = assertThrows(Exception.class, () ->
                calculator.negativeNumberCheck("-1"));
        assertEquals("El numero debe ser positvo", thrown.getMessage());
    }
}