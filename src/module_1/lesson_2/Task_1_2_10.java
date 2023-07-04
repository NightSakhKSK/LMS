package module_1.lesson_2;

public class Task_1_2_10 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
    }
}

class Solution_1_2_10 {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 1E-4;
    }
}
