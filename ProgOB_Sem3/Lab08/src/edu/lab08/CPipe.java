package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CPipe extends CCylinder{
    protected int r;

    public CPipe(int r, int m, int r1) {
        super(r, m);
        this.r = r1;
    }

    @Override
    double momentOfIntertia() {
        return 0.5 * Mass * ((R*R)*(r*r));
    }

    @Override
    void getData(JTable table1) {
        Mass = Integer.parseInt(table1.getValueAt(0, 1).toString());
        R = Integer.parseInt(table1.getValueAt(1, 1).toString());
        r = Integer.parseInt(table1.getValueAt(2, 1).toString());

    }

    @Override
    void showData(JTable table1, DefaultTableModel model1) {
        model1.setRowCount(3);
        table1.setValueAt("Mass",0,0);
        table1.setValueAt(Mass,0,1);
        table1.setValueAt("Średnica zewnętrzna",1,0);
        table1.setValueAt(R,1,1);
        table1.setValueAt("Średnica wewnętrzna",2,0);
        table1.setValueAt(r,2,1);
    }
}
