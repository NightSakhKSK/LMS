package module_1.lesson_5;

import java.util.Arrays;

public class Task_1_5_10 {
}

class Solution_1_5_10 {
    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }
        int resultLength = numbers.length % 2 == 0 ? 2 : 1;
        int startIndex = (numbers.length + 1) / 2 - 1;
        return Arrays.copyOfRange(numbers, startIndex, startIndex + resultLength);
    }
}
