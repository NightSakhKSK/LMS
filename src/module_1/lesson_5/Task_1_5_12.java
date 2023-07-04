package module_1.lesson_5;

public class Task_1_5_12 {
}

class Solution {
    public static void printOddNumbers(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        StringBuilder comma = new StringBuilder();
        for (int i : arr) {
            if (i % 2 != 0) {
                comma.append(i).append(",");
            }
        }
        if (comma.length() > 0) {
            System.out.println(comma.deleteCharAt(comma.length() - 1));
        }
    }
}
