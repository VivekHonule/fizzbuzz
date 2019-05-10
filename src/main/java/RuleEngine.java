public class RuleEngine {

    private final DivideRule threeRule;
    private final DivideRule fiveRule;

    public RuleEngine() {
        fiveRule = new DivideByFiveRule();
        threeRule = new DivideByThreeRule();
    }

    public String evaluateRules(int number) {
        StringBuilder sb = new StringBuilder();
        if (threeRule.isSatisfied(number) && fiveRule.isSatisfied(number)) {
            sb.append(DivideByThreeRule.FIZZ).append(DivideByFiveRule.BUZZ);
        } else if (fiveRule.isSatisfied(number)) {
            sb.append(DivideByFiveRule.BUZZ);
        } else if (threeRule.isSatisfied(number)) {
            sb.append(DivideByThreeRule.FIZZ);
        } else {
            sb.append(number);
        }
        return sb.toString();
    }
}
