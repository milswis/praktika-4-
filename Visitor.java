package parkapp.entities;

import parkapp.core.Person;

public class Visitor extends Person {
    protected int age;

    public Visitor(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    @Override
    public void action() {
        System.out.println("Visitor is walking around the park: " + name);
    }

    public void visitAttraction(Attraction attraction) {
        System.out.println(name + " visited attraction: " + attraction);
    }

    @Override
    public String toString() {
        return "Visitor{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}
