package designpattern.behavior.observer;

public class PublishMessageThree implements Observer{
    @Override
    public void update(Message message) {
        System.out.println(message.getMessage() + " " + Thread.currentThread().getName());
    }
}
