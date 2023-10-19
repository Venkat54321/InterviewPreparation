package designpattern.behavior.observer;

public class Main {

    public static void main(String[] args) {
        PublishMessageOne one = new PublishMessageOne();
        PublishMessageTwo two = new PublishMessageTwo();
        PublishMessageThree three = new PublishMessageThree();

        MessagePublisher publisher = new MessagePublisher();

        publisher.attach(one);
        publisher.attach(two);
        publisher.attach(three);

        publisher.notifyMessage(new Message("Hello World !"));

        publisher.detach(two);

        publisher.notifyMessage(new Message("This is second message"));
    }
}
