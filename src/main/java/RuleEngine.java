class RuleEngine {

    //This class is dependent on following rules. Any changes to the rules will affect this class.
    private final DivideRule divideByFiveRule;
    private final DivideRule divideByThreeRule;
    private final DivideRule divideByThreeAndFiveRule;

    RuleEngine() {
        divideByFiveRule = new DivideByFiveRule();
        divideByThreeRule = new DivideByThreeRule();
        divideByThreeAndFiveRule = new DivideByThreeAndFiveRule();
    }

    String evaluate(int number) {
        if (divideByThreeAndFiveRule.isSatisfied(number)) {
            return DivideByThreeAndFiveRule.FIZZ_BUZZ;
        } else if (divideByThreeRule.isSatisfied(number)) {
            return DivideByThreeRule.FIZZ;
        } else if (divideByFiveRule.isSatisfied(number)) {
            return DivideByFiveRule.BUZZ;
        } else {
            return String.valueOf(number);
        }
    }
}
