package module_1.lesson_2;

public class Task_1_2_6 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[] x = {29, 15, 288, 15, 1040};
        int[] y = {3, 2, 12, 6, 11};
        int[] answers = {2, 1, 0, 3, 6};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            int result = Solution_1_2_6.countMonitors(x[i], y[i]);
            if (result != answers[i]) {
                System.out.println("Test#" + (i + 1) + " failed! Expected " + answers[i] + " but was " + result);
                return;
            }
            sb.append("Test#" + (i + 1) + " passed" + "\n");
        }
        System.out.println(sb);
    }
}

class Solution_1_2_6 {
    public static int countMonitors(int monitors, int programmers) {
        return monitors % programmers;
    }
}