package thread.executor;

import java.util.concurrent.*;
import java.util.function.Function;

public class ExecutorExample1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = new Callable<String>(){
            public String call() throws Exception{
                return "This is my callable example";
            }
        };

        Future<String> future =  executorService.submit(callable);

        System.out.println(future.get());

        executorService.shutdown();



    }
}

class ExecutorThread implements Callable {

    @Override
    public String call(){
        System.out.println("This is my Thread.");
        return "This is Executor Framework example future object";
    }
}