package designpattern.structure.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent();
        SchoolStudent schoolStudent = new SchoolStudent();

        studentList.add(collegeStudent);
        studentList.add(new SchoolStudentAdapter(schoolStudent));
        System.out.println(studentList);
    }
}
