package designpattern.behavior.observer;

public abstract class Subject {
     abstract void  attach(Observer o);
    abstract void detach(Observer o);

    abstract void notifyMessage(Message m);
}
