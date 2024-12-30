package leetcode.string.medium;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "ccc";
        String longestPalindromeStr = lps(str);
        System.out.println(longestPalindromeStr);
    }

    private static String lps(String str) {
        if(str.length() == 1){
            return str;
        }
        if(str.length() == 2){
            if(str.charAt(0) == str.charAt(1)){
                return "bb";
            }else{
                return new String(String.valueOf(str.charAt(0)));
            }
        }
        String lps = "";
        for(int i = 1; i<=str.length() - 1; i++){
            // odd length
            int low = i;
            int high = i;
            while (str.charAt(low) == str.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == str.length()){
                    break;
                }
                String palindrome = str.substring(low+1,high);
                if(palindrome.length() >= lps.length()){
                    lps = palindrome;
                }
            }

            //even length
            low = i-1;
            high = i;
            while (str.charAt(low) == str.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == str.length()){
                    break;
                }
                String palindrome = str.substring(low+1,high);
                if(palindrome.length() >= lps.length()){
                    lps = palindrome;
                }
            }

        }

        return lps;
    }
}
