package java8;

import java.util.*;
import java.util.stream.Collectors;
public class SortMap {
    public static void main(String[] args) {

        Map<String,Employee> employeeMap = new HashMap<>();
        Employee e1 = new Employee("zee","12",2.3);
        Employee e2 = new Employee("abc","12",2.3);
        Employee e3 = new Employee("xml","12",2.3);
        Employee e4 = new Employee("hdfc","12",2.3);
        Employee e5 = new Employee("axis","12",2.3);

        employeeMap.put("wss",e1);
        employeeMap.put("abc",e2);
        employeeMap.put("mdd",e3);
        employeeMap.put("shf",e4);
        employeeMap.put("zya",e5);

        employeeMap.entrySet().stream()
               // .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::).reversed()))
                        .forEach(System.out::println);
    }
}
