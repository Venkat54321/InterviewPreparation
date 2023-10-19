package designpattern.behavior.strategy;

public class Context {
    public Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(int num1,int num2){
        strategy.doOperation(num1,num2);
    }
}
