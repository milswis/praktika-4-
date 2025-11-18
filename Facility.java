package parkapp.core;

public class Facility {
    protected int id;
    protected String name;
    protected boolean isWorking;

    public Facility(int id, String name, boolean isWorking) {
        this.id = id;
        this.name = name;
        this.isWorking = isWorking;
    }

    public void start() {
        System.out.println("Facility started: " + name);
    }

    public void stop() {
        System.out.println("Facility stopped: " + name);
    }

    public void repair() {
        System.out.println("Facility repaired: " + name);
    }
}
