package leetcode.string.easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = " ";
        boolean isPalindrome = mySolution(str);
        System.out.println(isPalindrome);
    }

    private static boolean mySolution(String str) {
        if(str.isBlank()){
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String newStr = sb.toString();
        int left = 0;
        int right = newStr.length() - 1;
        while (left < right){
            if(newStr.charAt(left) != newStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
