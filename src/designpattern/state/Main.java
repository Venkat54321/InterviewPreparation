package designpattern.state;

public class Main {

    public static void main(String[] args) {
        TVContext tvContext = new TVContext();

        TVStartState tvStartState = new TVStartState();
        TVStopState tvStopState = new TVStopState();

        tvContext.setTvState(tvStartState);
        tvContext.doAction();

        tvContext.setTvState(tvStopState);
        tvContext.doAction();


    }
}
