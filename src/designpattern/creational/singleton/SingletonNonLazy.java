package designpattern.creational.singleton;

public class SingletonNonLazy {
    private static volatile SingletonNonLazy instance = new SingletonNonLazy();

    public static SingletonNonLazy getInstance(){
        return instance;
    }

    private SingletonNonLazy(){

    }

}
