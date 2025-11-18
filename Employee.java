package parkapp.entities;

import parkapp.core.Person;

public class Employee extends Person {
    protected String position;
    protected int experienceYears;

    public Employee(int id, String name, String position, int experienceYears) {
        super(id, name);
        this.position = position;
        this.experienceYears = experienceYears;
    }

    @Override
    public void action() {
        System.out.println("Employee works: " + name + ", position: " + position);
    }

    public void maintainAttraction(Attraction attraction) {
        System.out.println(name + " maintains attraction: " + attraction);
        attraction.repair();
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', position='" + position + "', experience=" + experienceYears + "}";
    }
}
