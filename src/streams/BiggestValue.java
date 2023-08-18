package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;


public class BiggestValue {

    public static void main(String[] args) {
        //int[] array = {3,8,2,3,3,2};
        int[] array = {5,5,5,5,5};
        Map<String, Long> result =  Arrays.stream(array).mapToObj(s -> String.valueOf(s)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Optional<Map.Entry<String, Long>> max =result.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(Integer.valueOf(Math.toIntExact(max.get().getValue())));
    }
}
