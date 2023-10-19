package designpattern.behavior.strategy;

public class AddOperation implements Strategy{
    @Override
    public void doOperation(int num1, int num2) {
        System.out.println( "Addition of two number is : " + num1 + num2);
    }
}
