package edu.lab01;

import utilities.util;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        util.printLogMsg("program start" + ((args.length > 0) ? ":" + args[0] : ""));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        util.printLogMsg("program end");
    }
}