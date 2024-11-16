package edu.lab03;

public class CLecturer extends CEmployee{
    protected int pensum;
    private static String kind = "WYKLADOWCA";

    public static String getKind(){
        return kind;
    }

    @Override
    public String toString() {
        return "CLecturer{" +
                "pensum=" + pensum +
                ", empRate=" + empRate +
                ", salary=" + salary +
                ", birthYear=" + birthYear +
                ", familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", pesel=" + pesel +
                '}';
    }

    public String info(){
        return name + " " + familyName + " " + birthYear + " " + pesel +
                "\n" + kind + "wymiar etatu: " + empRate + " pensja " + salary +
                "\n" + "Wykładowca z pensum " + pensum + " godzin";
    }

    public String employeeReport(){
        return name + " " + familyName + " " + empRate + " " + salary + " " + pensum + " " + kind;
    }

    public CLecturer(CEmployee employee, int pensum) {
        super(employee);
        this.pensum = pensum;
    }

    public CLecturer(CPerson person, double empRate, double salary, int pensum) {
        super(person, empRate, salary);
        this.pensum = pensum;
    }


}
