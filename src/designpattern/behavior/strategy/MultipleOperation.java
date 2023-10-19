package designpattern.behavior.strategy;

public class MultipleOperation implements Strategy {

    @Override
    public void doOperation(int num1, int num2) {
        System.out.println("Multiplication of two numbers is : " + num1 * num2);
    }
}
