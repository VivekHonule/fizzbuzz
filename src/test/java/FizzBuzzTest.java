import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testPrintNumbersFromOneToFiveWithFizzAndBuzz() {
        String ls = System.lineSeparator();
        String expected = "1" + ls + "2" + ls + "Fizz" + ls + "4" + ls + "Buzz";
        FizzBuzz game = new FizzBuzz(1, 5);

        String result = game.printNumbers();

        assertEquals(expected, result);
    }
}
