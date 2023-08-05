package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_2;

public class Planner {

    private String day;
    private String hotel;
    private String reservation;
    private String specialEvent;
    private String tickets;

    public void setDay(String day) {
        this.day = day;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }
}
