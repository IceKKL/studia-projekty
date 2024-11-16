package edu.lab03;

public class CEmployee extends CPerson{
    protected double empRate;
    protected double salary;
    private static String kind = "PRACOWNIK";

    public String employeeReport(){
        return name + " " + familyName + " " + empRate + " " + salary;
    }

    public String info(){
        return name + " " + familyName + " " + birthYear + " " + pesel +
                "\n" + kind + "wymiar etatu: " + empRate + " pensja " + salary;
    }

    @Override
    public String toString() {
        return "CEmployee{" +
                "empRate=" + empRate +
                ", salary=" + salary +
                ", pesel=" + pesel +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static String getKind(){
        return kind;
    }

    public CEmployee(CPerson person, double empRate, double salary) {
        super(person);
        this.empRate = empRate;
        this.salary = salary;
    }

    public CEmployee(String name, String familyName, long pesel, double empRate, double salary) {
        super(name, familyName, pesel);
        this.empRate = empRate;
        this.salary = salary;
    }

    public CEmployee(CEmployee employee){
        this.empRate = employee.empRate;
        this.salary = employee.salary;
    }
}
