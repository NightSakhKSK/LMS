package module_1.lesson_6;

public class Task_1_6_9 {
}

class Solution_1_6_9 {
    public static boolean isPalindrome(String text) {
        String newText = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(newText).reverse().toString();

        return reversed.equalsIgnoreCase(newText);
    }

}