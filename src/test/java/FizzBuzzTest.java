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

    @Test
    public void testPrintFizzBuzzSeriesWhenNumberIsDivisibleByThreeAndFive() {
        String ls = System.lineSeparator();
        String expected = "Fizz" + ls + "13" + ls + "14" + ls + "FizzBuzz";
        FizzBuzz game = new FizzBuzz(12, 15);

        String result = game.printNumbers();

        assertEquals(expected, result);
    }
}
