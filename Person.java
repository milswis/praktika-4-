package parkapp.core;

public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void info() {
        System.out.println("Person info: " + name);
    }

    public void action() {
        System.out.println("Person action");
    }
}
