package inheritanceOOPS;

import java.util.ArrayList;

class Employee{
    private String empName;
    private double salary;

    Employee(String empName, double salary){
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {return this.empName;}
    public double getSalary() { return this.salary; }

    public void raiseSalary(int percentage){
         this.salary = this.salary + this.salary * (percentage / 100.0);
    }

}

class Manager extends Employee{

    private double bonus;

    Manager(String empName, double salary, double bonus){
        super(empName, salary);
        this.bonus = bonus;
    }

    public double getSalary(){
        return super.getSalary() + this.bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }


}

public class InheritanceDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 35000);

        // System.out.println(e1.getEmpName());

        e1.raiseSalary(25);
        System.out.println(e1.getSalary());

        Manager m1 = new Manager("Bala", 75000, 0);
        m1.setBonus(15000);

        System.out.println(m1.getSalary());

        Employee e2 = new Manager("Kumaran", 60000, 10000);

        Manager m2 = (Manager) e2;


        System.out.println(e2.getEmpName() + "\'s Salary is " + e2.getSalary() + " per Month.");

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(e1);
        employees.add(e2);
        employees.add(m1);

        for(Employee e: employees){
            System.out.println(e.getEmpName() + "\'s Salary is " + e.getSalary());
        }

    }
}