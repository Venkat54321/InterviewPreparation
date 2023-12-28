package leetcode.string.easy;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String str = "aba";
        boolean isValid = mySolution(str);
        System.out.println(isValid);

    }

    private static boolean mySolution(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else {
                return isPalindrome(str,left + 1,right) || isPalindrome(str,left,right - 1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String str,int left,int right){
        while (left<right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }

        }
        return true;
    }
}
