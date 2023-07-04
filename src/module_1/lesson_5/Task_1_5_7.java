package module_1.lesson_5;

public class Task_1_5_7 {
}

class Solution_1_5_7 {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = i < firstArray.length ? firstArray[i] : secondArray[i - firstArray.length];
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    isSorted = false;
                    buf = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = buf;
                }
            }
        }
        return result;
    }
}
