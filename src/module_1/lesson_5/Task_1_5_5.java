package module_1.lesson_5;

public class Task_1_5_5 {
}

class Solution_1_5_5 {
    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int[] result = new int[numbers.length % 2 == 0 ? 2 : 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[(numbers.length + 1) / 2 - 1 + i];
        }
        return result;
    }
}
