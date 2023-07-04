package module_1.lesson_4;

import java.math.BigInteger;

public class Task_1_4_7 {
}

class Solution_1_4_7 {
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
