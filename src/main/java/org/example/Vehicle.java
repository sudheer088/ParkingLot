package org.example;

import java.util.Date;

public class Vehicle {

     private String numberPlate;
     private VehicleType type;
     private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Vehicle(String numberplate, VehicleType type) {
        this.numberPlate = numberplate;
        this.type = type;
    }

    public String getNumberplate() {
        return numberPlate;
    }

    public void setNumberplate(String numberplate) {
        this.numberPlate = numberplate;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }


}
