package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CSphere extends CSolid{
    protected int R;

    public CSphere(int r, int m) {
        R = r;
        Mass = m;
    }

    @Override
    double momentOfIntertia() {
        return 0.4*Mass*R*R;
    }

    @Override
    void getData(JTable table1) {
        Mass = Integer.parseInt(table1.getValueAt(0, 1).toString());
        R = Integer.parseInt(table1.getValueAt(1, 1).toString());
    }

    @Override
    void showData(JTable table1, DefaultTableModel model1) {
        model1.setRowCount(2);
        table1.setValueAt("Masa",0,0);
        table1.setValueAt(Mass,0,1);
        table1.setValueAt("Promień",1,0);
        table1.setValueAt(R,1,1);
    }
}
