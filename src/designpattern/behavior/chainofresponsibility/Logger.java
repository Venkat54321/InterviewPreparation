package designpattern.behavior.chainofresponsibility;

public interface Logger {
    void setNextLogger(Logger nextLogger);

    void logMessage(String message);
}
