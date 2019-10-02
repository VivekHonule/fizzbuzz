class FizzBuzz {

    //This class is dependent on rule engine. Any changes to rule engine will affect this class.
    private final RuleEngine ruleEngine;
    private final int start;
    private final int end;

    FizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
        ruleEngine = new RuleEngine();
    }

    String printNumbers() {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            builder.append(ruleEngine.evaluate(i));
            builder.append(System.lineSeparator());
        }
        return builder.toString().trim();
    }
}
