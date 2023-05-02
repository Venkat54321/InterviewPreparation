package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> newList =  list.stream().map(e -> multipleTwo(e)).collect(Collectors.toList());
        for(Integer e : newList){
            System.out.println(e);
        }
    }

    private static Integer multipleTwo(Integer e) {
        return e * 2;
    }
}
