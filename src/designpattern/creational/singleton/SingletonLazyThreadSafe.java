package designpattern.creational.singleton;

public class SingletonLazyThreadSafe {

    private static SingletonLazyThreadSafe instance = null;

    public static SingletonLazyThreadSafe getInstance(){
        synchronized (SingletonLazyThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonLazyThreadSafe();
            }
        }
        return instance;
    }

    private SingletonLazyThreadSafe(){

    }
}
