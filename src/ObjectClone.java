class Department implements Cloneable{
    int deptId;
    String deptName;

    Department(int deptId, String deptName){
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void deptDetails(){
        System.out.println("Dept ID: " + this.deptId);
        System.out.println("Dept Name: " + this.deptName);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class DeptStudent implements Cloneable{
    int studentId;
    String studentName;
    Department department;

    DeptStudent(int studentId, String studentName, Department dept){
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = dept;
    }

    public void displayStudent(){
        System.out.println("===============Student Details==============");
        System.out.println("Student Details");
        System.out.println("Student Name: " + this.studentName + "\nStudent ID: " + this.studentId + "\n---------------------------------------------" );
        this.department.deptDetails();
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeptStudent s = (DeptStudent) super.clone();
        s.department = (Department) this.department.clone();

        return s;

    }
}

public class ObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department d1 = new Department(1, "Physics");
        DeptStudent s1 = new DeptStudent(101, "Ram", d1);
        DeptStudent s2 = (DeptStudent) s1.clone();


        d1.deptName = "Maths";

        s1.displayStudent();
        s2.displayStudent();

    }
}
