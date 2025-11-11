package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ParkingLot {
    private int capacity;
    private final int id;
    private String address;
    private List<Vehicle> vehicleList;
    private final double CAR_RENT=100;
    private final double MOTORCYCLE_RENT=200;




    public ParkingLot(int capacity, String address) {
        this.capacity = capacity;
        this.vehicleList = new ArrayList<>();
        this.address = address;
        this.id=(int)(Math.random()*10000);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addVehicle(Vehicle vehicle) throws Exception {
        if(this.capacity==vehicleList.size()){
            throw new Exception("lot is full to go other parking lot");
        }
        else{
            this.vehicleList.add(vehicle);
            vehicle.setTicket(new Ticket(vehicle.getNumberplate(),new Date(),this.id));


        }

    }
    public void removeVehicle(Vechicle ve)

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public int getId() {
        return this.id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
