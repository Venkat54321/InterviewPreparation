package notabletoans;

public class MyThread implements Runnable{

    int value;
    public MyThread(int value){
        this.value = value;
    }
    @Override
    public void run() {
        System.out.println("Hello thread :" + Thread.currentThread().getName() + "  " + value);
    }
}
