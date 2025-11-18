package parkapp.core;

public class Place {
    protected int id;
    protected String name;

    public Place(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void open() {
        System.out.println("Place opened: " + name);
    }

    public void close() {
        System.out.println("Place closed: " + name);
    }
}
