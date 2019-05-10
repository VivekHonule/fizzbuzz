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
