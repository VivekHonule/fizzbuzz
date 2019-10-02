import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RuleEngineTest {

    @Test
    public void testEvaluateForDivideByFiveRule() {
        RuleEngine ruleEngine = new RuleEngine();

        String result = ruleEngine.evaluate(5);

        assertEquals(DivideByFiveRule.BUZZ, result);
    }

    @Test
    public void testEvaluateForDivideByThreeRule() {
        RuleEngine ruleEngine = new RuleEngine();

        String result = ruleEngine.evaluate(3);

        assertEquals(DivideByThreeRule.FIZZ, result);
    }

    @Test
    public void testEvaluateForOtherNumber() {
        RuleEngine ruleEngine = new RuleEngine();

        String result = ruleEngine.evaluate(2);

        assertEquals("2", result);
    }

    @Test
    public void testEvaluateForDivideByThreeAndFiveRule() {
        RuleEngine ruleEngine = new RuleEngine();

        String result = ruleEngine.evaluate(15);

        assertEquals(DivideByThreeAndFiveRule.FIZZ_BUZZ, result);
    }
}
