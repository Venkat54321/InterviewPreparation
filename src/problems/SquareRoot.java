package problems;

public class SquareRoot {

    public static void main(String[] args) {
        int number = 250;
        int i = 1;
        while (i * i <= number){
            i = i+1;
        }
        System.out.println(i-1);
    }
}
