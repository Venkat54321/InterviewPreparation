package leetcode.string.easy;

public class ScoreOfString {
    public static void main(String[] args) {
        String str = "zaz";
        int absoluteDiffSum = getAbsoluteDiffSum(str);
        System.out.println(absoluteDiffSum);
    }

    private static int getAbsoluteDiffSum(String str) {
        int sum = 0;
        for(int i = 0; i <= str.length() -2;i ++){
            int s1 = str.charAt(i);
            int s2 = str.charAt(i+1);
            int diff = Math.abs(s1 - s2);
            sum = sum + diff;
        }
        return sum;
    }
}
