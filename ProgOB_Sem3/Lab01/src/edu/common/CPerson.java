package edu.common;

import java.util.Objects;

public class CPerson {
    private String name;
    private String surname;
    private int birthYear;

    public CPerson(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public CPerson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPerson cPerson = (CPerson) o;
        return birthYear == cPerson.birthYear && Objects.equals(name, cPerson.name) && Objects.equals(surname, cPerson.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear);
    }

    @Override
    public String toString() {
        return "CPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int length() {
        return name.length();
    }
}
