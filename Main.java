package parkapp;

import parkapp.entities.*;

public class Main {
    public static void main(String[] args) {
        Park park = new Park(1, "Sunny Park", "Одеса", 2005);
        Attraction attraction = new Attraction(1, "Roller Coaster", "Extreme", 20, true);
        Visitor visitor = new Visitor(1, "Анна", 17);
        Employee employee = new Employee(1, "Наталья", "Оператор", 5);
        Ticket ticket = new Ticket(1, visitor, attraction, 150.0, "2025-10-06");

        park.open();
        visitor.action();
        employee.action();
        attraction.start();
        ticket.useTicket();
        employee.maintainAttraction(attraction);
        visitor.visitAttraction(attraction);

        System.out.println(park);
        System.out.println(attraction);
        System.out.println(visitor);
        System.out.println(employee);
        System.out.println(ticket);
    }
}
