package module_2.lesson_5;

import java.util.Arrays;

public class Task_2_5_6 {
}

class Solution_2_5_6 {
    static class AsciiCharSequence implements CharSequence {
        private byte[] array;

        public AsciiCharSequence(byte[] array) {
            this.array = array;
        }

        @Override
        public String toString() {
            return new String(array);
        }

        @Override
        public int length() {
            return array.length;
        }

        @Override
        public char charAt(int index) {
            return (char) array[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(array, start, end));
        }
    }
}
