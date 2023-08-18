import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("123","Venkat",10.2);
        Employee e2 = new Employee("124","ajay",9.0);
        Employee e3 = new Employee("125","ram",8.1);
        Employee e4 = new Employee("126","sam",10.2);
        Employee e5 = new Employee("126","ajay",11.2);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);

        /*Stream<Employee> sorted = employeeList.stream().sorted(Comparator.comparing((e7,e8) -> {

        }));*/
       // sorted.forEach(e -> System.out.println(e.getName()));

    }

}
