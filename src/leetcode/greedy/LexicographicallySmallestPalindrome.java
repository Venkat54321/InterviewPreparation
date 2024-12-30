package leetcode.greedy;

public class LexicographicallySmallestPalindrome {

    public static void main(String[] args) {
        String str = "seven";
        String finalStr = lexicographicallySmallestPalindrome(str);
        System.out.println(finalStr);
    }

    private static String lexicographicallySmallestPalindrome(String str) {
        if(str.length() == 0){
            return "";
        }
        if(str.length() == 1){
            return str;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = charArray.length -1;
        while (i <= j){
            if(charArray[i] < charArray[j]){
               charArray[j] = charArray[i];
            }else{
                charArray[i] = charArray[j];
            }
            i++;
            j--;
        }

        return new String(charArray);
    }
}
