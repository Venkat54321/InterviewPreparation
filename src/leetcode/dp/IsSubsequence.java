package leetcode.dp;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "b";
        String t = "abc";

        boolean isSubsequence = isSubsequence(s,t);
        System.out.println(isSubsequence);

    }

    private static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }
        if(s.isEmpty() && !t.isEmpty()){
            return true;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        int si = 0;
        int tj = 0;
        while (tj < tt.length && si < ss.length){
            if(ss[si] == tt[tj]){
                si++;
            }
            tj++;
        }
        if(si == ss.length){
            return true;
        }
        return false;
    }
}
