package designpattern.behavior.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        context.execute(1,2);

        context = new Context(new SubtractOperation());
        context.execute(3,1);

        context = new Context(new MultipleOperation());
        context.execute(1,3);

    }
}
