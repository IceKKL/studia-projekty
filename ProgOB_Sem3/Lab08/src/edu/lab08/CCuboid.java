package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CCuboid extends CSolid {
    protected int a;
    protected int b;

    public CCuboid(int m,int a, int b) {
        this.Mass = m;
        this.a = a;
        this.b = b;
    }

    @Override
    double momentOfIntertia() {
        return 0.083 * Mass * ((a*a)*(b*b));
    }

    @Override
    void getData(JTable table1) {
        Mass = Integer.parseInt(table1.getValueAt(0, 1).toString());
        a = Integer.parseInt(table1.getValueAt(1, 1).toString());
        b = Integer.parseInt(table1.getValueAt(2, 1).toString());
    }

    @Override
    void showData(JTable table1, DefaultTableModel model1) {
        model1.setRowCount(3);
        table1.setValueAt("Masa",0,0);
        table1.setValueAt(Mass,0,1);
        table1.setValueAt("bok a",1,0);
        table1.setValueAt(a,1,1);
        table1.setValueAt("bok b",2,0);
        table1.setValueAt(b,2,1);
    }
}
