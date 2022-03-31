
package JavaException2;

import java.util.ArrayList;
import java.util.List;

public class AITClass 
{
    private String name;
    private String code;
    private Integer maxStudents;
    private List<Student> students = new ArrayList<>();

    public AITClass() {
    }

    public AITClass(String name, String code, Integer maxStudents) {
        this.name = name;
        this.code = code;
        this.maxStudents = maxStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(Integer maxStudents) {
        this.maxStudents = maxStudents;
    }

    public void addStudent(Student student) throws TooManyStudentsException
    {
        if(this.students.size() < this.maxStudents)
        {
            students.add(student);
            //System.out.println("Student added");
        }
        else
            {
                throw new TooManyStudentsException("Reached the maximum number of student: " + this.maxStudents + " "
                        + student.getFirstName() + " " + student.getLastName() + this.name);
            }
    }
    
    public void removeStudent(Student student)
    {
        this.students.remove(student);
    }
    
    //Use the below list without the try and catch above
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    @Override
    public String toString() {
        return "AITClass{" + "name=" + name + ", code=" + code + ", maxStudents=" + maxStudents + ", students=" + students + '}';
    }
}
