package leetcode.string.medium;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "-23a45 567 v";
        Integer finalInteger = myAtoi(str);
        System.out.println(finalInteger);
    }

    private static Integer myAtoi(String str) {
        int value = 0;
        str = str.trim();
        boolean isNegative = str.charAt(0) == '-';
        for(int i = 0; i<=str.length() - 1;i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                value = (value * 10) + (c - '0');
            }else{
                return value;
            }
        }
        if(isNegative){
            value = -value;
        }
        return value;
    }
}
