package inheritanceOOPS;

class companyEmployee{
    protected String empName;
    private String empId;
    private double salary;

    companyEmployee(String empName, String empId, double salary){
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }

    public String getEmpName(){
        return this.empName;
    }

    public String getEmpId(){
        return this.empId;
    }

    public double getSalary() {
        return this.salary;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else if (obj == null){
            return false;
        }
        else if(this.getClass() != obj.getClass()){
            return false;
        }
        companyEmployee e = (companyEmployee) obj;
        return this.empName.equals(e.empName) && this.salary == e.salary && this.empId == e.empId;
    }

}

class companyManager extends companyEmployee{
    private double bonus;
    companyManager(String empName, String empId, double salary, double bonus){
        super(empName, empId, salary);
        this.bonus = bonus;
    }

    public double getSalary(){

        return super.getSalary() + this.bonus;
    }

}

class companydhu extends companyManager{
    private double cashback;
    companydhu(String empName, String empId, double salary, double bonus, double cashback){
        super(empName, empId, salary, bonus);
        this.cashback = cashback;
    }

    public double getSalary(){
        return super.getSalary() + this.cashback;
    }
}

public class InheritanceDemo2 {

    public static void main(String[] args) {
        companyEmployee e1 = new companyEmployee("Ram", "E101", 35000);
        System.out.println(e1.getSalary());
        companyManager m1 = new companyManager("Ramesh", "M101", 50000, 20000);
        System.out.println(m1.getSalary());

        companyEmployee e2 = new companyManager("Gopal", "M102", 60000, 10000);

        System.out.println(e2.getSalary());

        companydhu d1 = new companydhu("Varun", "DHU101", 80000, 10000, 1000);
        System.out.println(d1.getSalary());

        System.out.println(e1.equals(e2));

    }
}
