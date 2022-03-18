package com.company;

public class Taxi extends Vehicle {
    private int noPassengers, ticketPrice;

    public Taxi() {
        noPassengers = 1;
        ticketPrice = 10;
    }

    public Taxi(String colour, boolean functional, int noPassengers, int ticketPrice) {
        super(colour, functional);
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    public void setNoPassengers(int noPassengers) {
        this.noPassengers = noPassengers;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNoPassengers() {
        return noPassengers;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    @Override
    int charge() {
        return ticketPrice * noPassengers;
    }

    @Override
    double profit() {
        return charge()/4.0;
    }

    @Override
    String display() {
        return "Number of passengers in TAXI: " + noPassengers + " with a ticket price of " + ticketPrice + " and a profit of " + profit();
    }
}
