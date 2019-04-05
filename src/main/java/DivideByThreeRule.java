public class DivideByThreeRule implements DivideRule {

    static final String FIZZ = "Fizz";

    @Override
    public boolean isSatisfied(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 3 == 0;
    }
}
