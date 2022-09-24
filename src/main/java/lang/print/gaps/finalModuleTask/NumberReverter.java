package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String result = "";
        while (true) {
            int num = number % 10;
            result += num;
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        int finalResult = Integer.parseInt(result);
        System.out.println(finalResult);
    }
}
