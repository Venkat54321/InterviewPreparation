package java8;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    public String name;
    public String Id;
    public Double salary;

    public Employee(String name, String id, Double salary) {
        this.name = name;
        Id = id;
        this.salary = salary;
    }
}

public class SortListOfEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("zee","12",2.5);
        Employee e2 = new Employee("abc","12",10.3);
        Employee e3 = new Employee("xml","12",2.0);
        Employee e4 = new Employee("hdfc","12",2.3);
        Employee e5 = new Employee("axis","12",5.3);
        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);

        Map<String, Employee> collect = employeeList.stream().collect(Collectors.toMap(e -> e.name, e -> e));
        System.out.println(collect);

        // max salary


    }
}
