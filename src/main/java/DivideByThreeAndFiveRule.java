public class DivideByThreeAndFiveRule implements DivideRule {

    static final String FIZZ_BUZZ = "FizzBuzz";

    @Override
    public boolean isSatisfied(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 5 == 0 && number % 3 == 0;
    }
}
