import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("123","Venkat",10.2);
        Employee e2 = new Employee("123","Venkat",10.2);
        Employee e3 = new Employee("125","ram",8.1);
        Employee e4 = new Employee("126","sam",10.2);
        Employee e5 = new Employee("126","ajay",11.2);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);

        HashMap<Employee,Integer> map  = new HashMap<>();
        map.put(e1,1);
        map.put(e2,2);
        map.put(e3,3);

        System.out.println(map);


    }

}
