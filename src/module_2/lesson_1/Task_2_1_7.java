package module_2.lesson_1;

public class Task_2_1_7 {
}

class Solution_2_1_7 {
    public enum Day {
        MONDAY(false, "Понедельник"),
        TUESDAY(false, "Вторник"),
        WEDNESDAY(false, "Среда"),
        THURSDAY(false, "Четверг"),
        FRIDAY(false, "Пятница"),

        SATURDAY(true, "Суббота"),
        SUNDAY(true, "Воскресенье");

        private final boolean isWeekEnd;
        private final String ruName;

        Day(boolean isWeekEnd, String ruName) {
            this.isWeekEnd = isWeekEnd;
            this.ruName = ruName;
        }

        public boolean isWeekend() {
            return isWeekEnd;
        }

        public String getRusName() {
            return ruName;
        }
    }
}
