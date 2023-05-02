package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamExample {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Renuka",5.5),
                new Employee("Alekhya",5.2),
                new Employee("Venkat",6.2),
                new Employee("Bhanu",1.2));
        List<Employee> newSalary =  employeeList.stream().filter(emp -> {
                    System.out.println("Filter Employee ");
                    return emp.getSalary() > 5.0;
                  })
                .map(emp -> {
                    System.out.println("Map Employee");
                   return new Employee(emp.getName(),emp.getSalary() * 5.0);
                })
                .sorted()
                .collect(Collectors.toList());

        //
        Optional<Employee> e =  newSalary.stream().findFirst();
        System.out.println(e.get().getName());

        //
        newSalary.forEach(e1 -> System.out.println(e1.getName()));

        //
        Employee[] empArray = employeeList.stream().toArray(Employee[]::new);

        //
    }
}
