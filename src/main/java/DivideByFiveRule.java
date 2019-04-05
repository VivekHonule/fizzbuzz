public class DivideByFiveRule implements DivideRule {

    static final String BUZZ = "Buzz";

    @Override
    public boolean isSatisfied(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 5 == 0;
    }
}
