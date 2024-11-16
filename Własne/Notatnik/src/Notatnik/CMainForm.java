package Notatnik;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;


public class CMainForm extends javax.swing.JFrame{
    private JTextArea noteField;
    private JButton saveButton;
    private JButton deleteButton;
    private JButton readButton;
    private JPanel mainPanel;

    public CMainForm(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);

        // set actions for button presses
        saveButton.addActionListener(e -> saveButtonClick());
        readButton.addActionListener(e -> readButtonClick());
        deleteButton.addActionListener(e -> deleteButtonClick());
    }

    private void saveButtonClick(){
        // set up fileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooser.setDialogTitle("Nazwa notatki");
        fileChooser.setFileFilter(
                new FileNameExtensionFilter("Plik tekstowy", "txt"));
        int answer = fileChooser.showSaveDialog(null);
        if (answer == JFileChooser.APPROVE_OPTION){
            String fName = fileChooser.getSelectedFile().toString();
            if(!fName.endsWith(".txt")) fName += ".txt";
            // check for exceptions
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(fName))){
                noteField.write(bw);
                JOptionPane.showMessageDialog(this,"Zapisano notatkę \n" + fName);
            } catch (IOException e){
                JOptionPane.showMessageDialog(this,"Nie udało się zapisać notatki \n" + fName);
            }
        }

    }

    private void readButtonClick(){
        // set up fileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setDialogTitle("Otwórz notatkę");
        fileChooser.setFileFilter(
                new FileNameExtensionFilter("Plik tekstowy","txt"));
        int answer = fileChooser.showOpenDialog(null);
        if(answer == JFileChooser.APPROVE_OPTION){
            File noteFile = fileChooser.getSelectedFile();
            String fName = noteFile.getAbsolutePath();
            // check for exceptions
            try {
                FileReader reader = new FileReader(fName);
                BufferedReader br = new BufferedReader(reader);
                noteField.read(br,null);
                br.close();
            } catch (Exception e){
                JOptionPane.showMessageDialog(this,"Błąd \n" + e);
            }
        }
    }

    private void deleteButtonClick() {
        // set fileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setDialogTitle("Usuń plik");
        fileChooser.setFileFilter(
                new FileNameExtensionFilter("Plik tekstowy","txt"));
        int answer = fileChooser.showOpenDialog(null);
        if(answer == JFileChooser.APPROVE_OPTION){
            File noteFile = fileChooser.getSelectedFile();
        // check for exceptions
        try {
            if(noteFile.delete()) {
                JOptionPane.showMessageDialog(this, "Usunięto plik \n" + noteFile);
            } else {
                JOptionPane.showMessageDialog(this,"Plik nie został usunięty \n" + noteFile);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this,"Błąd \n" + e);
        }
        }
    }
}
