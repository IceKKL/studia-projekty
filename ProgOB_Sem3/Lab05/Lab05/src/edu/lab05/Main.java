package edu.lab05;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static edu.lab05.CDataFile.readIntValue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class    Main {

    private static CDataFile dataFile = null;
    private static Logger logger = Logger.getLogger("aLogger");
    private static FileHandler fh;

    private static void assignLogger() {
        try{
            fh = new FileHandler("c:\\temp\\mojLogger.log",true);
            logger.addHandler(fh);
            // logger.setUseParentHandlers(false);
            fh.setFormatter(new SimpleFormatter());
        } catch(SecurityException | IOException e){
            e.printStackTrace();
        }
    }

    private static void releaseLogger(){
        logger.removeHandler(fh);
    }

    public static void main(String[] args) {
        assignLogger();

        try{
            // Poprawny plik
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file.dat");

            // Wyjątek EParameterError - nieobsłużony
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file-bad-double.dat");

            // Wyjątek EDataFileIncorrectHeader - obsłuzony
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file-bad-header.dat");

            // Wyjątek EParameterError - nieobsłuzony
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file-bad-int.dat");

            // Wyjątek EParameterErrorRange - obsłużony
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file-bad-range-int.dat");

            // Wyjątek EDataFileNotFound - obsłużony
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/null.dat");

            // Wyjątek EDataFileIncorrectFooter - obsłuzony
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file-bad-footer.dat");

            // Wyjątek EParameterErrorRange - obsłuzony
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file-bad-range-double.dat");

            // Brak wyjątku
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file.dat");
            //int read = CDataFile.readIntValue("src/resource/file.dat");

            // Wyjątek EParameterError - nieobsłuzony
            //dataFile = new CDataFile("/Users/imob10/Desktop/Students/Malina_Bartlomiej/Lab05/src/resource/file-bad-int.dat");
            //int read = CDataFile.readIntValue("src/resource/file-bad-int.dat");


            dataFile.readFile();
            System.out.println("Odczytany parametr INT: " + dataFile.intValue);
            System.out.println("Odczytany parametr DOUBLE: " + dataFile.doubleValue);
        } catch (EDataFileNotFound | EDataFileIncorrectHeader | EDataFileIncorrectFooter
            | EParameterErrorRange ee){
            logger.info(ee.getMessage());
        }
        releaseLogger();
    }
}