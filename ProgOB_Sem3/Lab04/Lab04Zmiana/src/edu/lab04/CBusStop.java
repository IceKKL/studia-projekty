package edu.lab04;

import java.util.Arrays;

public class CBusStop {
    protected String name;
    protected String[] changes;

    public CBusStop(String name) {
        this.name = name;
        this.changes = null;
    }

    public CBusStop(String name, String ... changes) {
        this.name = name;
        this.changes = changes;
    }

    public void setChanges(String ... changes){
        if (changes.length == 0){
            this.changes = null;
        } else {
            this.changes = changes;
        }
    }

    @Override
    public String toString() {
        return "  przystanek  " + name + ", przesiadki: " + (changes != null ? Arrays.toString(changes) : "-brak-" );
}
}
