package org.example;

import java.util.Date;

public class Ticket {
    private final String ticketId;
    private final String numberPlate;
    private final Date time;
    private final int parkingLotid;

    public Ticket(String numberPlate, Date time, int parkingLotid) {
        this.ticketId = numberPlate+(int)(Math.random()*100000);
        this.numberPlate = numberPlate;
        this.time = time;
        this.parkingLotid = parkingLotid;
    }

    public String getTicketId() {
        return ticketId;
    }



    public String getNumberPlate() {
        return numberPlate;
    }


    public Date getTime() {
        return time;
    }



    public int getParkingLot() {
        return parkingLotid;
    }


}
