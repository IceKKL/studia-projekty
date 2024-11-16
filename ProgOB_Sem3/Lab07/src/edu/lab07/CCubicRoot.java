package edu.lab07;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class CCubicRoot extends CRoot{

    public CCubicRoot(double number, double precision, JTextArea textArea) {
        super(number, precision, textArea);
        }

    public double calculate(){
        double start = 0;
        double end = number;
        double mid = 0.5 * number;
        int step = 0;

        while(Math.abs(number - Math.pow(mid,3)) > precision){
            if(number < Math.pow(mid,3)) {
                end = mid;
            } else {
                start = mid;
            }
            mid = (start + end)/2;

            step += 1;

            if(log){
                textArea.append(String.format(Locale.US,
                        "Step: " + step + " value: " + mid + "\n"));
            }
        }
        return mid;
    }
}
