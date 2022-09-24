package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result = 0;
        while (true) {
            int num = number % 10;
            result += num;
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        System.out.println(result);
    }
}
