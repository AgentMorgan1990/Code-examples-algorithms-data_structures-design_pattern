package ru.examples.design_patterns.creational_порождающие.builder_строитель.example_2;

public class Client {

    public Planner constructPlanner(AbstractBuilder builder) {

        //должна быть логика заполнения
        builder.buildDay("Понедельник");
        builder.buildReservation("Ресерватион");
        builder.buildHotel("Метрополь");
        builder.buildSpecialEvent("Пятничное");
        builder.buildTickets("Обратные");
        return builder.getVacationPlanner();
    }
}
