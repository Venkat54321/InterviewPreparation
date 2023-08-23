package java8;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharInGivenString {
    public static void main(String[] args) {
        String str  = "zabcyabcxabca";
        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> collect1 = collect.entrySet().stream().filter(s -> s.getValue() > 2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
