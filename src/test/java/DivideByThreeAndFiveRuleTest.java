import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DivideByThreeAndFiveRuleTest {

    private DivideByThreeAndFiveRule threeAndFiveRule;

    @Before
    public void setUp() {
        threeAndFiveRule = new DivideByThreeAndFiveRule();
    }

    @Test
    public void testIsSatisfiedWithNumberDivisibleByThree() {
        boolean satisfied = threeAndFiveRule.isSatisfied(3);

        assertFalse(satisfied);
    }

    @Test
    public void testIsSatisfiedWithNumberDivisibleByFive() {
        boolean satisfied = threeAndFiveRule.isSatisfied(5);

        assertFalse(satisfied);
    }

    @Test
    public void testIsSatisfiedWithNumberDivisibleByBothFiveAndThree() {
        boolean satisfied = threeAndFiveRule.isSatisfied(15);

        assertTrue(satisfied);
    }

    @Test
    public void testIsSatisfiedWithNegativeNumber() {
        boolean satisfied = threeAndFiveRule.isSatisfied(-5);

        assertFalse(satisfied);
    }
}