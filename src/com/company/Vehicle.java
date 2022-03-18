package com.company;

abstract public class Vehicle implements Comparable<Vehicle>   {

    private String colour;
    private boolean functional;

    public Vehicle(){
        this.colour = "black";
        this.functional = true;
    }

    public Vehicle(String colour, boolean functional){
        this.colour = colour;
        this.functional = functional;
    }

    public void set(String colour, boolean functional){
        this.colour = colour;
        this.functional = functional;
    }


    public boolean getFunctional(){
        return functional;
    }


    public String getColour() {
        return colour;
    }




    abstract double profit();
    abstract int charge();
    abstract String display();

    @Override
    public int compareTo(Vehicle o){
        if(this.profit()<o.profit())
            return -1;
        else if(o.profit()<this.profit())
            return 1;
        return 0;
    }

}

