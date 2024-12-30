package notabletoans;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameWorkExample {
    public static void main(String[] args) {
       ExecutorService executor =  Executors.newFixedThreadPool(5);
       for(int i =0;i <= 5;i++) {
           Runnable t1 = new MyThread(i);
            executor.execute(t1);
       }
       if(executor.isShutdown()){
           executor.shutdown();
           System.out.println("Stopped");
       }
    }
}
