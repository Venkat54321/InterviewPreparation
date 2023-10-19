package designpattern.behavior.observer;

public class Message {
    private String message;
    public Message(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}