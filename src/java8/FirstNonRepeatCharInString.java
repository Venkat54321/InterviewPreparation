package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharInString {

    public static void main(String[] args) {
        String str = "abxcabcdfghj";
       String nonRepeat =  Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(s -> s.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println(nonRepeat);



    }
}
