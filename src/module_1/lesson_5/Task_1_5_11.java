package module_1.lesson_5;

import java.util.Arrays;

public class Task_1_5_11 {
}

class Solution_1_5_11 {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
        Arrays.sort(result);
        return result;
    }
}
