package edu.lab03;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        CPerson osoba = new CPerson("janusz","cebula",1920,990123244);
        CEmployee pracownik = new CEmployee("dariusz","banan",1234642412,240,5000);
        CStudent student = new CStudent("Marcin","Gruszka",1222153532,"Informatyka",3);
        CLecturer wykladowca = new CLecturer(osoba,300,6000,240);
        CDriver kierowca = new CDriver(pracownik,"A,B",2025);

        System.out.println(osoba.info());
        System.out.println(pracownik.employeeReport());
        System.out.println( student.info());
        System.out.println(wykladowca.employeeReport());
        System.out.println(  kierowca.employeeReport());

        //CEmployee pracownik2 = new CEmployee("mariusz","banan",010000000,240,5000);
        //System.out.println(  pracownik2.employeeReport());

        //CPerson osoba2 = new CPerson("Marek","cebula",1800,990123244);
        //System.out.println(  osoba2.info());

        CPerson[] people = new CPerson[5];
        people[0] = new CPerson("janusz","cebula",1920,990123244);
        people[1] = new CEmployee("dariusz","banan",1234642412,240,5000);
        people[2] = new CStudent("Marcin","Gruszka",1222153532,"Informatyka",3);
        people[3] = new CLecturer(osoba,300,6000,240);
        people[4] = new CDriver(pracownik,"A,B",2025);



    }
}