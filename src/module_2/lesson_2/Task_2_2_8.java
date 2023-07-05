package module_2.lesson_2;

public class Task_2_2_8 {
}

class Solution_2_2_8 {
    public static boolean isWeekend(String dayName) {
        return "Saturday".equalsIgnoreCase(dayName) || "Sunday".equalsIgnoreCase(dayName);
    }

    public static int weekendCount(String[] days) {
        int result = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                result++;
            }
        }
        return result;
    }

    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }
}
