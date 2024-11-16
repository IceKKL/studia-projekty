package edu.lab03;

import java.time.LocalDate;
import java.time.Year;

public class CPerson {
    protected String name;
    protected String familyName;
    protected int birthYear;
    protected long pesel;
    public static String nationality = "PL";
    private static String kind = "OSOBA";

    @Override
    public String toString() {
        return "CPerson{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", birthYear=" + birthYear +
                ", pesel=" + pesel +
                '}';
    }

    public String info(){
        return name + " " + familyName + " " + birthYear + " " + pesel;
    }

    public static String getKind(){
        return kind;
    }

    public CPerson() {
    }

    public final void setBirthYear(int birthYear) {
        if((birthYear < 1900) || (birthYear > Year.now().getValue()))
            throw new IllegalArgumentException("Niepoprawny rok urodzenia");
        this.birthYear = birthYear;
    }

    public final void setPesel(int pesel) {
        if((pesel < 210000000L) || (pesel > 99999999999L))
            throw new IllegalArgumentException("Niepoprawny pesel");
        this.pesel = pesel;
    }

    public CPerson(String name, String familyName, int birthYear, long pesel) {
        this.name = name;
        this.familyName = familyName;
        this.birthYear = birthYear;
        this.pesel = pesel;
    }

    public CPerson(String name, String familyName, long pesel) {
        this.name = name;
        this.familyName = familyName;
        this.pesel = pesel;

        int year = Math.toIntExact(pesel/1000000000L);
        year += ((Math.toIntExact((pesel % 1000000000L)/10000000L)<13) ? 1900 : 2000);
        setBirthYear(year);
    }

    public CPerson(CPerson person) {
        this.name = person.name;
        this.familyName = person.familyName;
        this.birthYear = person.birthYear;
        this.pesel = person.pesel;
    }
}
