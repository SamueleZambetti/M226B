public class CalculatorService {

    private final Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int addAndMultiplyByTwo(int a, int b) {
        int sum = calculator.add(a, b);
        return sum * 2;
    }
}
