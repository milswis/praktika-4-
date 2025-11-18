package parkapp.entities;

import parkapp.core.Place;

public class Park extends Place {
    protected String location;
    protected int foundedYear;

    public Park(int id, String name, String location, int foundedYear) {
        super(id, name);
        this.location = location;
        this.foundedYear = foundedYear;
    }

    public void addAttraction(Attraction attraction) {
        System.out.println("Added attraction: " + attraction);
    }

    @Override
    public void open() {
        System.out.println("Park is now open: " + name);
    }

    @Override
    public void close() {
        System.out.println("Park is now closed: " + name);
    }

    @Override
    public String toString() {
        return "Park{id=" + id + ", name='" + name + "', location='" + location + "', founded=" + foundedYear + "}";
    }
}
