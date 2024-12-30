package leetcode.array.easy;

import java.util.Arrays;

public class ReverseStringOfWord {

    public static void main(String[] args) {
        String words = "Welcome the";
        char[] charArray = words.toCharArray();
        int start = 0;
        for (int i = 0; i <= charArray.length - 1; i++) {
            if (charArray[i] == ' ') {
                reverse(charArray, start, i - 1);
                start = i + 1;
            }
            if (i == charArray.length - 1) {
                reverse(charArray, start, i);
                start = i + 1;
            }
        }
        System.out.println(new String(charArray));
    }

    private static void reverse(char[] array, int start, int end) {
        while (start <= end) {
            char tmp = (char) array[end];
            array[end] = (char) array[start];
            array[start] = tmp;
            start++;
            end--;
        }
    }
}
