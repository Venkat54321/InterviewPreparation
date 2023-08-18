package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Double> collect = list.stream().map(e -> Math.sqrt(e)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
