package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,12,10,23,45,2,6,0);

        Optional<Integer> max = list.stream().max(Comparator.comparing(a -> a));
        System.out.print(max.get());

    }
}
