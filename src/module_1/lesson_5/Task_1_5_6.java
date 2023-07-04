package module_1.lesson_5;

public class Task_1_5_6 {
}

class Solution_1_5_6 {
    public static int[] inverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int buf = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = buf;
        }
        return numbers;
    }
}
