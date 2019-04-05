import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DivideByFiveRuleTest {

    private DivideRule rule;

    @Before
    public void setUp() {
        rule = new DivideByFiveRule();
    }

    @Test
    public void testNumberSatisfiesTheRuleIfDivisibleByFive() {
        boolean satisfied = rule.isSatisfied(5);

        assertTrue(satisfied);
    }

    @Test
    public void testNumberDoesNotSatisfiesTheRuleIfNotDivisibleByFive() {
        boolean isSatisfied = rule.isSatisfied(3);

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
