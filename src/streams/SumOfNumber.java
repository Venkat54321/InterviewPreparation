package streams;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> reduce = list.stream().reduce((a1, a2) -> a1 * a2);
        System.out.println(reduce.get());


    }
}
