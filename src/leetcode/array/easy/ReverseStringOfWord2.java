package leetcode.array.easy;

public class ReverseStringOfWord2 {

    public static void main(String[] args) {
        String str = "  hello world  ";
        String newStr = reverseStr(str);
        System.out.println(newStr);
    }

    private static String reverseStr(String str) {
        StringBuilder sb = new StringBuilder();
        String[] artArray = str.split(" ");
        for(int i = artArray.length - 1;i >=0 ;i--){
            if(!artArray[i].isEmpty()) {
                sb.append(artArray[i].trim()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
