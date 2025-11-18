package parkapp.entities;

import parkapp.core.Facility;

public class Attraction extends Facility {
    private String type;
    private int capacity;

    public Attraction(int id, String name, String type, int capacity, boolean isWorking) {
        super(id, name, isWorking);
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        isWorking = true;
        System.out.println("Attraction started: " + name);
    }

    @Override
    public void stop() {
        isWorking = false;
        System.out.println("Attraction stopped: " + name);
    }

    @Override
    public String toString() {
        return "Attraction{id=" + id + ", name='" + name + "', type='" + type + "', capacity=" + capacity + ", working=" + isWorking + "}";
    }
}
