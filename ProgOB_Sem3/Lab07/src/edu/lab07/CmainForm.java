package edu.lab07;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class CmainForm extends javax.swing.JFrame{
    private JPanel mainPanel;
    private JTextField numberTextField;
    private JTextField precisionTextField;
    private JRadioButton p2sRadioButton;
    private JRadioButton p3sRadioButton;
    private JCheckBox logCheckBox;
    private JButton saveParamsButton;
    private JButton readParamsButton;
    private JTextArea textArea1;
    private JButton saveReportButton;
    private JButton OBLICZButton;

    public CmainForm(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        OBLICZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1Click();
            }
        });
        saveParamsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3Click();
            }
        });
        readParamsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2Click();
            }
        });
        saveReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4Click();
            }
        });
    }

    private void button1Click() {
        double N, E;
        try {
            N = Double.parseDouble(
                    numberTextField.getText().replaceAll(",", "."));
            E = Double.parseDouble(
                    precisionTextField.getText().replaceAll(",", "."));
        } catch (NumberFormatException ee) {
            JOptionPane.showMessageDialog(this, "Błędna wartość parametru !\nKomunikat: " + ee.getMessage());
            return;
        }
        CRoot root = null;
        double libRes = 0.0;
        if (p2sRadioButton.isSelected()) {
            if (logCheckBox.isSelected())
                root = new CSquareRoot(N, E, textArea1);
            else root = new CSquareRoot(N, E, null);
            libRes = Math.sqrt(N);
            textArea1.append(String.format(Locale.US,
                    "\nPierwiastek kwadratowy z %f\n", N));
        } else if (p3sRadioButton.isSelected()) {
            if (logCheckBox.isSelected())
                root = new CCubicRoot(N, E, textArea1);
            else root = new CCubicRoot(N, E, null);
            libRes = Math.cbrt(N);
            textArea1.append(String.format(Locale.US,
                    "\nPierwiastek sześcienny z %f\n", N));
        }
        if(root != null){
            textArea1.append(String.format(Locale.US,
                    "Wymagana dokładność: %.15f\n",E));
            double result = root.calculate();
            textArea1.append(String.format(Locale.US,
                    "WYNIK OBLICZONY:   %.15f\n",result));
            textArea1.append(String.format(Locale.US,
                    "WYNIK (klasa MATH): %.15f\n",libRes));
        }
    }
    private void button2Click(){
        String fName = new File(".").getAbsolutePath();
        fName = fName.substring(0, fName.length()-1) + "params.dat";
        try (Scanner fileScanner = new Scanner(new File(fName))) {
            String L;
            numberTextField.setText(fileScanner.nextLine());
            precisionTextField.setText(fileScanner.nextLine());
            L = fileScanner.nextLine();
            p2sRadioButton.setSelected(true);
            if (L.compareTo("3") == 0) p3sRadioButton.setSelected(true);
            L = fileScanner.nextLine();
            logCheckBox.setSelected(L.compareTo("1") == 0);
            JOptionPane.showMessageDialog(this,
                    "Parametry wczytano z pliku\n" + fName);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this,
                    "Nieudany odczyt parametrów z pliku\n" + fName);
            e.printStackTrace();
        }
    }

    private void button3Click(){
        String fName = new File(".").getAbsolutePath();
        fName = fName.substring(0, fName.length()-1) + "params.dat";
        File aFile = new File(fName);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(aFile))) {
            bw.write(numberTextField.getText() + '\n');
            bw.write(precisionTextField.getText() + '\n');
            if (p2sRadioButton.isSelected()) bw.write("2\n");
            else bw.write("3\n");
            if (logCheckBox.isSelected()) bw.write("1\n");
            else bw.write("0\n");
            JOptionPane.showMessageDialog(this,
                    "Parametry zapisano do pliku\n" + fName);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Nieudany zapis parametrów do pliku\n" + fName);
            e.printStackTrace();
        }
    }

    private void button4Click() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooser.setDialogTitle("Nazwa pliku raportu");
        fileChooser.setFileFilter(
                new FileNameExtensionFilter("Plik testowy","txt"));
        int answer = fileChooser.showSaveDialog(null);
        if(answer == JFileChooser.APPROVE_OPTION){
            String fname = fileChooser.getSelectedFile().toString();
            if(!fname.endsWith(".txt")) fname += ".txt";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fname)))){
                textArea1.write(bw);
                JOptionPane.showMessageDialog(this,
                        "Zapisano plik raportu:\n" + fname);
            } catch(IOException e){
                JOptionPane.showMessageDialog(this,
                        "Nieudany zapis pluku raportu:\n" + fname);
            }
        }
    }
}
