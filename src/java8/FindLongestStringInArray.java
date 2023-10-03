package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class FindLongestStringInArray {

    public static void main(String[] args) {
        String[] array = {"ad","ab","abc123","x"};
        String str =  Arrays.stream(array).reduce((w1,w2) -> w1.length() > w2.length()?w1:w2).get();
        System.out.println(str);

    }
}
