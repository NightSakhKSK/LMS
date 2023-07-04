package module_1.lesson_2;

public class Task_1_2_7 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        double[] x = {3.5, 15.8, 2.1, 5.4, 10.1};
        int[] y = {3, 2, 12, 6, 11};
        double[] answers = {10.5, 31.6, 25.200000000000003, 32.400000000000006, 111.1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            double result = Solution_1_2_7.priceCalculation(x[i], y[i]);
            if (result != answers[i]) {
                System.out.println("Test#" + (i + 1) + " failed! Expected " + answers[i] + " but was " + result);
                return;
            }
            sb.append("Test#" + (i + 1) + " passed" + "\n");
        }
        System.out.println(sb);
    }
}

class Solution_1_2_7 {
    public static double priceCalculation(double price, int count) {
        return price * count;
    }
}
