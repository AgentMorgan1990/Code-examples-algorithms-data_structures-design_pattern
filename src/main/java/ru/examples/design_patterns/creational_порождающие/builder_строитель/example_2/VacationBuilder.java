package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_2;

public class VacationBuilder implements AbstractBuilder {


    // навешиваем сложную логику при создании, установка
    Planner planner = new Planner();

    @Override
    public void buildDay(String day) {
        planner.setDay(day);
    }

    @Override
    public void buildHotel(String hotel) {
        planner.setHotel(hotel);
    }

    @Override
    public void buildReservation(String reservation) {
        planner.setReservation(reservation);
    }

    @Override
    public void buildSpecialEvent(String event) {
        planner.setSpecialEvent(event);
    }

    @Override
    public void buildTickets(String tickets) {
        planner.setTickets(tickets);

    }

    @Override
    public Planner getVacationPlanner() {
        return planner;
    }
}
