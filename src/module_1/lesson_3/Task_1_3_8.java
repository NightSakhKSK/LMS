package module_1.lesson_3;

public class Task_1_3_8 {
}

class Solution_1_3_8 {
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
