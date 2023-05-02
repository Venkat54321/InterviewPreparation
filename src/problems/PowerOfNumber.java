package problems;

public class PowerOfNumber {

    public static void main(String[] args) {
        int number = 5;
        int power = 5;
        int finalResult = findPower(number,power);
        System.out.println(finalResult);
    }

    public static int findPower(int number,int power){
        if(power == 0){
            return 1;
        }
        return findPower(number,power -1);
    }
}
