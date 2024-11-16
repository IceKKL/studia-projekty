package edu.lab05;

import java.io.FileNotFoundException;

public class EDataFileNotFound extends FileNotFoundException {
    private static int code = 10001;

    public EDataFileNotFound(String message) {
        super(String.format("Error code: %d. Message: %s", code, message));
    }
}
