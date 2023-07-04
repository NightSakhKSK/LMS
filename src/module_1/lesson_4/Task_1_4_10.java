package module_1.lesson_4;

public class Task_1_4_10 {
}

class Solution_1_4_10 {
    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday":
            case "Sunday": return true;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            default: return false;
        }
    }
}
