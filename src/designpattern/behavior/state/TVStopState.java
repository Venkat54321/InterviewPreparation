package designpattern.behavior.state;

public class TVStopState implements State{
    @Override
    public void doAction() {
        System.out.println("TV Stop");
    }
}
