package collection;


import java.util.HashMap;
import java.util.Map;

final class Student{
    private final int rollNum;
    private final String name;

    private final Map<String,Integer> marks;

    public Student(int rollNum,String name,Map<String,Integer> marks){
        this.rollNum = rollNum;
        this.name = name;
        Map<String,Integer> tempMap = new HashMap<>();
        for(Map.Entry<String,Integer> map : marks.entrySet()){
            tempMap.put(map.getKey(),map.getValue());
        }
        this.marks = tempMap;
    }

    public int getRollNum() {
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }
}


public class ImmutableClass {

    public static void main(String[] args) {
        //S1 marks
        Map<String,Integer> s1Marks = new HashMap<>();
        s1Marks.put("Maths",1);
        Student s1 = new Student(123,"Venkat",s1Marks);

    }
}
