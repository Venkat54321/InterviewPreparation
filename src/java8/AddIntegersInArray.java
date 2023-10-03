package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddIntegersInArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int i = Arrays.stream(array).boxed().reduce(0, Integer::sum);
        //System.out.println(i);

        String s1 = new String("java");
        String s2 = new String("java");

        if(s1 == s2){
            System.out.println("true");
        }

        if(s1.endsWith(s2)){
            System.out.println("true1");
        }
    System.out.println(1 * 2 + 3 ^ 4/5);
        String str = "alive is awesome be in present manchester united is also know as reddevil";
        Map<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        

    }
}
