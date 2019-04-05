public class FizzBuzz {

    private final DivideRule threeRule;
    private final DivideRule fiveRule;
    private final int start;
    private final int end;

    public FizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
        fiveRule = new DivideByFiveRule();
        threeRule = new DivideByThreeRule();
    }

    public String printNumbers() {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            builder.append(evaluateRules(i));
            builder.append(System.lineSeparator());
        }
        return builder.toString().trim();
    }

    private String evaluateRules(int number) {
        if (threeRule.isSatisfied(number)) {
            return DivideByThreeRule.FIZZ;
        } else if (fiveRule.isSatisfied(number)) {
            return DivideByFiveRule.BUZZ;
        } else {
            return String.valueOf(number);
        }
    }
}
