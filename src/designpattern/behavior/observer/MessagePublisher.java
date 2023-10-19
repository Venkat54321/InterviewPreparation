package designpattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher extends Subject{

    List<Observer> observerList = new ArrayList<>();
    @Override
    public void attach(Observer o) {
        observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
           observerList.remove(o);
    }

    @Override
    public void notifyMessage(Message m) {
        for (Observer o: observerList) {
            o.update(m);
        }
    }
}
