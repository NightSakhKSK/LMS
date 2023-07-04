package module_1.lesson_6;

public class Task_1_6_12 {
}

class Solution_1_6_12 {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder answer = new StringBuilder();
        for (String role : roles) {
            answer.append(role).append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    answer.append(i + 1).append(")").append(textLines[i].substring(role.length() + 1)).append("\n");
                }
            }
            answer.append("\n");
        }
        return answer.toString();
    }

}
