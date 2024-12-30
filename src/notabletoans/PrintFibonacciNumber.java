package notabletoans;

import java.util.stream.Stream;

public class PrintFibonacciNumber {
    public static void main(String[] args) {
        Stream.iterate(new int[] {0,1},fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(10)
                .mapToInt( fib -> fib[0])
                .boxed()
                .forEach(System.out::println);
    }
}
