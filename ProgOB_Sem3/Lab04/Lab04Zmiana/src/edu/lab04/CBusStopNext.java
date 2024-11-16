package edu.lab04;

public class CBusStopNext extends CBusStop {
    protected int nextMeters = 0;
    protected float nextMinues = 0.0f;

    public int getNextMeters() {
        return nextMeters;
    }

    public void setNextMeters(int nextMeters) {
        this.nextMeters = nextMeters;
    }

    public float getNextMinues() {
        return nextMinues;
    }

    public void setNextMinues(float nextMinues) {
        this.nextMinues = nextMinues;
    }

    public CBusStopNext(String name, int nextMeters, float nextMinues, String... changes) {
        super(name, changes);
        this.nextMeters = nextMeters;
        this.nextMinues = nextMinues;
    }

    public CBusStopNext(String name, int nextMeters, float nextMinues) {
        super(name);
        this.nextMeters = nextMeters;
        this.nextMinues = nextMinues;
    }

    @Override
    public String toString() {
        return super.toString() + ", następny przystanek: " + nextMeters + "m,  " + nextMinues + " minut";
    }
}
