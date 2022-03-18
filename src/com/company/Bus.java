package com.company;

public class Bus extends Vehicle {

    private int noPassengers, ticketPrice;

    public Bus() {
        noPassengers = 10;
        ticketPrice = 5;
    }

    public Bus(String colour, boolean functional, int noPassengers, int ticketPrice) {
        super(colour, functional);
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    public int getNoPassengers() {
        return noPassengers;
    }

    public void setNoPassengers(int noPassengers) {
        this.noPassengers = noPassengers;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
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
        return "Number of passengers in BUS: " + noPassengers + " with a ticket price of " + ticketPrice + " and a profit of " + this.profit();
    }
}
