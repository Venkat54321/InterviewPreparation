package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class SortPositiveNegativeNumbers {

    public static void main(String[] args) {
       // List<Integer> input = asList(2, 1, 0, -2, -5);

        Integer[] ary = {2,1,0,-2,-5};
        Arrays.sort(ary, (Integer i1, Integer i2) -> Math.abs(i2) - Math.abs(i1));
        System.out.println(Arrays.toString(ary));


       // System.out.println(output);
    }
}
