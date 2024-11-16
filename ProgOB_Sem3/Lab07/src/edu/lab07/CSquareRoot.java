package edu.lab07;

import javax.swing.*;
import java.util.Locale;

public class CSquareRoot extends  CRoot{
    public CSquareRoot(double number, double precision, JTextArea textArea) {
        super(number, precision, textArea);
    }

    public double calculate(){
        double x = number/2;
        double y = 1;
        int step = 0;
        double approx;
        while (Math.abs(x-y) < precision){
            approx = (x+y)/2;
            y = number/2;
            step += 1;
        }
        if (log){
            textArea.append(String.format(Locale.US,
                    "step: " + step + " value: " + x + "\n" ));
        }
        return x;
    }
}
