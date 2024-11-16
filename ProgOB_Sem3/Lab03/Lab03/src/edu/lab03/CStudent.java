package edu.lab03;

public class CStudent extends CPerson {
    protected String field;
    protected Integer semester;
    private static String kind = "STUDENT";

    public String studentReport(){
        return name + " " + familyName + " " + birthYear + " " + pesel + " " + field + " " + semester;
    }

    @Override
    public String toString() {
        return "CStudent{" +
                "field='" + field + '\'' +
                ", semester=" + semester +
                ", pesel=" + pesel +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public String info(){
        return name + " " + familyName + " " + birthYear + " " + pesel +
                "\n" + kind + "kierunek: " + field + " semestr " + semester;
    }

    public static String getKind(){
        return kind;
    }

    public CStudent(String field, Integer semester) {
        this.field = field;
        this.semester = semester;
    }

    public CStudent(String name, String familyName, long pesel, String field, Integer semester) {
        super(name, familyName, pesel);
        this.field = field;
        this.semester = semester;
    }
}
