import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {

    @Test
    public void testEvaluateRulesForNumberDivisibleByThree() {
        RuleEngine ruleEngine = new RuleEngine();

        String result = ruleEngine.evaluateRules(3);

        assertEquals("Fizz", result);
    }

    @Test
    public void testEvaluateRulesForNumberDivisibleByFive() {
        RuleEngine ruleEngine = new RuleEngine();

        String result = ruleEngine.evaluateRules(5);

        assertEquals("Buzz", result);
    }

    @Test
    public void testEvaluateRulesForNumberDivisibleByFiveAndThree() {
        RuleEngine ruleEngine = new RuleEngine();

        String result = ruleEngine.evaluateRules(15);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testEvaluateRulesForNumberNotDivisibleByFiveAndThree() {
        RuleEngine ruleEngine = new RuleEngine();

        String result = ruleEngine.evaluateRules(2);

        assertEquals("2", result);
    }
}
