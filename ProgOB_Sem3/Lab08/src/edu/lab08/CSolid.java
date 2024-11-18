package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

abstract class CSolid {
    protected int Mass;

    abstract double momentOfIntertia();

    abstract void getData(JTable table1);

    abstract void showData(JTable table1, DefaultTableModel model1);
}
