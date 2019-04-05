import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DivideByThreeRuleTest {

    private DivideRule rule;

    @Before
    public void setUp() {
        rule = new DivideByThreeRule();
    }

    @Test
    public void testNumberSatisfiesTheRuleIfDivisibleByThree() {
        boolean satisfied = rule.isSatisfied(3);

        assertTrue(satisfied);
    }

    @Test
    public void testNumberDoesNotSatisfiesTheRuleIfNotDivisibleByThree() {
        boolean isSatisfied = rule.isSatisfied(5);

        assertFalse(isSatisfied);
    }

    @Test
    public void testNumberDoesNotSatisfiesTheRuleIfZero() {
        boolean isSatisfied = rule.isSatisfied(0);

        assertFalse(isSatisfied);
    }

    @Test
    public void testNumberDoesNotSatisfiesTheRuleIfNegative() {
        boolean isSatisfied = rule.isSatisfied(-3);

        assertFalse(isSatisfied);
    }
}
