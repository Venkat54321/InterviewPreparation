package designpattern.structure.adapter;

public class SchoolStudentAdapter implements Student{
    private SchoolStudent schoolStudent;

   public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }

    public String getName() {
        return schoolStudent.getName();
    }

    public String getEmailAddress() {
        return schoolStudent.getEmailAddress();
    }

    public String lastName() {
        return schoolStudent.lastName();
    }
}
