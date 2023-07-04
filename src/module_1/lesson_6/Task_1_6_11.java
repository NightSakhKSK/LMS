package module_1.lesson_6;

import java.util.regex.Pattern;

public class Task_1_6_11 {
}

class Solution_1_6_11 {
    public static boolean isGmailOrOutlook(String email) {
        String regex = "[\\d|\\w]+@(outlook|gmail).com";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }
}
