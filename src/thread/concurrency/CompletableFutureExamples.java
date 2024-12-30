package thread.concurrency;

import java.util.concurrent.*;

public class CompletableFutureExamples {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,5l,
                TimeUnit.HOURS,new ArrayBlockingQueue<>(10));

            CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
                return "Task Execution";
            }, executor);

        System.out.println(completableFuture.get());
    }
}
