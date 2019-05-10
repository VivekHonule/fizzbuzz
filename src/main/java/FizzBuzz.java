public class FizzBuzz {

    private final int start;
    private final int end;
    private final RuleEngine ruleEngine;

    public FizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
        ruleEngine = new RuleEngine();
    }

    public String printNumbers() {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            builder.append(ruleEngine.evaluateRules(i));
            builder.append(System.lineSeparator());
        }
        return builder.toString().trim();
    }
}
