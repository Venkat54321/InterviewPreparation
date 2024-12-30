package leetcode.array.easy;

public class MultiplyTwoStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String mul = MulTwoStringMethod2(num1,num2);
        System.out.println(mul);
    }

    private static String MulTwoStringMethod2(String num1, String num2) {
        if(num1.length() == 1 && num1.charAt(0) == 0){
            return "0";
        }
        if(num2.length() == 1 && num2.charAt(0) == 0){
            return "0";
        }
        int[] array = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i>=0;i--){
            for(int j = num2.length() - 1; j>=0;j--){
                int p1 = i + j;
                int p2 = i + j + 1;
                int mul = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
                int sum = mul + array[p2];
                array[p1] = array[p1] + (sum / 10);
                array[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : array){
            if(!(sb.length() == 0 &&  i == 0)) {
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString() ;
    }


    private static String method1(String num1, String num2) {
        if(num1.length() ==1 && num2.length() == 1 && num1.charAt(0) != 0 && num2.charAt(0) != 0){
            return String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
        }
        String sumOfTwoNums = "";
        int i = num1.length() - 1;
        int counter = num1.length() - 1;
        int j = num2.length() - 1;
        while (j >= 0){
            int carry = 0;
            int k = i;
            StringBuilder sb = new StringBuilder();
            while (k >= 0){
                int mul = Character.getNumericValue(num2.charAt(j)) * Character.getNumericValue(num1.charAt(k)) + carry;
                int digit = mul % 10;
                carry = mul / 10;
                sb.append(digit);
                k--;
            }
            sb.reverse();
            if(counter - j > 0){
                int m = counter - j;
                while (m > 0){
                    sb.append(0);
                    m--;
                }
            }
            j--;
            System.out.println(sb);
            sumOfTwoNums = AddTwoStrings.method2(sumOfTwoNums, sb.toString());
        }
        return sumOfTwoNums;
    }
}
