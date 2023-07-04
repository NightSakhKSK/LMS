package module_1.lesson_4;

public class Task_1_4_12 {
}

class Solution {
    public static String checkWeekend(String weekday) {
        return "Saturday".equalsIgnoreCase(weekday) || "Sunday".equalsIgnoreCase(weekday)
                ? "Ура, выходной!"
                : "Надо еще поработать";
    }
}
