package module_1.lesson_4;

public class Task_1_4_9 {
}

class Solution_1_4_9 {
    public static int determineGroup(int age) {
        if (age >= 7 && age <= 13) {
            return 1;
        } else if (age >= 14 && age <= 17) {
            return 2;
        } else if (age >= 18 && age <= 65) {
            return 3;
        } else {
            return -1;
        }
    }
}
