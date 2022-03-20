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
}