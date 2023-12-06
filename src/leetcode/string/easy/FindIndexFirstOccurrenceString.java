package leetcode.string.easy;

public class FindIndexFirstOccurrenceString {
    public static void main(String[] args) {
       String haystack = "abc";
       String needle = "c";
       Integer result = mySolution(haystack,needle);
        System.out.println(result);
    }

    private static Integer mySolution(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        }
        int length = needle.length();
        Character c = needle.charAt(0);
        for(int i = 0;i <= haystack.length() - needle.length();i++){
            Character c1 = haystack.charAt(i);
            if(c == c1){
                String subStr = haystack.substring(i,length + i);
                if(needle.equals(subStr)){
                    return i;
                }
            }
        }
        return -1;
    }
}
