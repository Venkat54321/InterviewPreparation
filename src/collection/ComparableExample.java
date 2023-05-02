package collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{

    private int empNum;
    private String name;

    public int getEmpNum() {
        return empNum;
    }

    public String getName() {
        return name;
    }

    public Employee(int empNum, String name) {
        this.empNum = empNum;
        this.name = name;
    }

    @Override
    public int compareTo(Employee emp) {
        if(empNum==emp.empNum)
            return 0;
        else if(empNum>emp.empNum)
            return 1;
        else
            return -1;
    }
}


public class ComparableExample {

    public static void main(String[] args) {
        Employee e1 = new Employee(2,"Venkat");
        Employee e2 = new Employee(4,"Alekhya");
        Employee e3 = new Employee(1,"Alekhya1");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Collections.sort(employeeList);

        for(Employee emp:employeeList){
            System.out.println(emp.getEmpNum()+" "+emp.getName());
        }


    }
}
