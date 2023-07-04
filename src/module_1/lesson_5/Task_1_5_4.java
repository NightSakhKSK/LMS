package module_1.lesson_5;

public class Task_1_5_4 {
}

class Solution_1_5_4 {
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int startIndex = -1;
        int resultLength = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((start <= numbers[i]) && (numbers[i] <= end)) {
                resultLength++;
                if (startIndex == -1) {
                    startIndex = i;
                }
            }
        }
        int[] result = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = numbers[i + startIndex];
        }
        return result;
    }
}