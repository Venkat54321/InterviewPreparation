package designpattern.structure.singleton;

public class SingletonNonLazy {
    private static volatile SingletonNonLazy instance = new SingletonNonLazy();

    public static SingletonNonLazy getInstance(){
        return instance;
    }

    private SingletonNonLazy(){

    }

}
