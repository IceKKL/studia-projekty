package edu.lab02;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        CProfile K50 = new CProfile("K50x50x5",50,50,5,7,3.5);
        CProfile K120 = new CProfile("K120x50x12",120,120,12,13,6.5);
        CProfile K90x60 = new CProfile("K90x60x8",90,60,8,9,4);

        System.out.println(K50.getResult());
        System.out.println(K50.getResult(1));

        System.out.println(K120.getResult());
        System.out.println(K120.getResult(2));

        System.out.println(K90x60.getResult());
        System.out.println(K90x60.getResult(3));

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj nazwę obiektu: ");
        String objName = keyboard.nextLine();
        System.out.print("Podaj krawędź A obiektu: ");
        double objA = keyboard.nextDouble();
        System.out.print("Podaj krawędź B obiektu: ");
        double objB = keyboard.nextDouble();
        System.out.print("Podaj krawędź G obiektu: ");
        double objG = keyboard.nextDouble();
        System.out.print("Podaj krawędź R obiektu: ");
        double objR = keyboard.nextDouble();
        System.out.print("Podaj krawędź R1 obiektu: ");
        double objR1 = keyboard.nextDouble();
        //System.out.println(objName + objA + objB + objG + objR + objR1); // a b g r r1
        CProfile pog = new CProfile(objName, objA, objB, objG, objR, objR1);
    }
}