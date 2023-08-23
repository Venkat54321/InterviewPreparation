package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] array = {2,34,56,1,7,89,4};
        Integer integer = Arrays.stream(array).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(integer);

    }
}
