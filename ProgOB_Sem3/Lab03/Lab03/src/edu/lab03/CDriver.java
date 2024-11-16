package edu.lab03;

public class CDriver extends CEmployee{
    protected int licenseUntil;
    protected String category;
    private static String kind = "KIEROWCA";

    public String employeeReport(){
        return name + " " + familyName + " " + empRate + " " + salary + " kierowca kat  " + category + " prawo jazdy ważne do " + licenseUntil;
    }

    @Override
    public String toString() {
        return "CDriver{" +
                "category='" + category + '\'' +
                ", licenseUntil=" + licenseUntil +
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
                "\n" + "prawo jazdy ważne do " + licenseUntil + " ketegoria prawa jazdy " + category;

    }

    public static String getKind(){
        return kind;
    }

    public CDriver(CEmployee employee, String category, int licenseUntil) {
        super(employee);
        this.category = category;
        this.licenseUntil = licenseUntil;
    }
}
