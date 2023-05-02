package thread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("My Thread");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}
