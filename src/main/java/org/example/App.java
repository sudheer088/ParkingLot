package org.example;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws Exception {
        ParkingLot p1= new ParkingLot(2,"-1");
        Vehicle windsor = new Vehicle("AP40JH5271", VehicleType.CAR);
        p1.addVehicle(windsor);




    }
}
