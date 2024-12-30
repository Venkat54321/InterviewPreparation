package leetcode.array.medium;

public class StringCompression {
    public static void main(String[] args) {
        char[] array = {'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(count(array));
    }

    private static int count(char[] array) {
        if(array.length == 1){
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i <= array.length - 1){
            int count = 0;
            char c = (char) array[i];
            sb.append(array[i]);
            int j = i;
            while (j <= array.length -1 && array[j] == c){
                count++;
                j++;
            }
            if(count > 0) {
                sb.append(count);
            }
            i = j;
        }
        System.out.println(sb);
        return sb.length();
    }
}
