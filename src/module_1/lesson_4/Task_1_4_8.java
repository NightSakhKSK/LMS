package module_1.lesson_4;

import java.math.BigInteger;

public class Task_1_4_8 {
}

class Solution_1_4_8 {
    public static BigInteger factorial(int value) {
        if (value == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorial(--value));
    }
}
