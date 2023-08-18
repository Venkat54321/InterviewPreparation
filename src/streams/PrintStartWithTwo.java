package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintStartWithTwo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,24,5,6,23);
        List<String> list1 =  list.stream()
                .map(s -> String.valueOf(s))
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());
        list1.forEach(System.out::println);



    }
}
