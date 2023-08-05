package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_2;

public interface AbstractBuilder {

    void buildDay(String day);

    void buildHotel(String hotel);

    void buildReservation(String reservation);

    void buildSpecialEvent(String specialEvent);

    void buildTickets(String tickets);

    Planner getVacationPlanner();
}
