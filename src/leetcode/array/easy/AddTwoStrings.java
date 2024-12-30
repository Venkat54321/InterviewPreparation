package leetcode.array.easy;

public class AddTwoStrings {
    public static void main(String[] args) {
        String num1 = "99";
        String num2 = "9999999";
        System.out.println(99 % 5);
        String sum = method2(num1,num2);
        System.out.println(sum);
    }

    public static String method2(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >=0 || carry !=0){
            int digit1 = i>=0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j>=0 ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }

    private static String method1(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry= 0;
        while (i >=0 && j >= 0){
            int sum = num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry;
            int num = sum % 10;
            carry = sum / 10;
            sb.append(num);
            i--;
            j--;
        }
        while (i >=0){
            int sum = num1.charAt(i) - '0' + carry;
            int num = sum % 10;
            carry = sum / 10;
            sb.append(num);
            i--;
        }
        while (j >=0){
            int sum = num2.charAt(j) - '0' + carry;
            int num = sum % 10;
            carry = sum / 10;
            sb.append(num);
            j--;
        }
        if(i < 0 && j < 0 && carry !=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
