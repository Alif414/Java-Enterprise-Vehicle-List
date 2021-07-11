/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclehireapp;

import java.util.ArrayList;
import my.edu.swin.vehicle.Vehicle;
import my.edu.swin.vehicle.VehicleType;
import java.util.Scanner;

/**
 *
 * @author alif_
 */
public class VehicleHireApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create the vehicle types
        VehicleType sedan = new VehicleType("SEDAN", "A standard sedan", 4);
        VehicleType limo6 = new VehicleType("LIMO6", "A six seater limo", 6);
        VehicleType limo8 = new VehicleType("LIMO8", "An eight seater limo", 8);
// Create the vehicles
        ArrayList<Vehicle> vehicles = new ArrayList();
        vehicles.add(new Vehicle("Ed's Holden Caprice", "Silver", sedan, 2002));
        vehicles.add(new Vehicle("John's Mercedes C200", "Black", sedan, 2005));
        vehicles.add(new Vehicle("Guy's Volvo 244 DL", "Blue", sedan, 1976));
        vehicles.add(new Vehicle("Sasco's Ford Limo", "White", limo6, 2014));
        vehicles.add(new Vehicle("Peter's Ford Limo", "White", limo6, 2004));
        vehicles.add(new Vehicle("Robert's Ford Limo", "White", limo8, 2003));
        System.out.println("\n\nList of vehicles in system:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        String typeCode = args[0];
        System.out.println("\n\nList of vehicle of type " + typeCode);
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().getCode().equals(typeCode)) {
                System.out.println(vehicle);
            }
        }

        int i = 1;
        while (i != 4) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nIt will display a list of vehicles based on the "
                    + "type you choose:\n1: SEDAN\n2: LIMO6\n3: LIMO8\n4: Exit"
                    + "\n\nPlease select an option (1-4):");
            i = scan.nextInt();
            if (i == 1) {
                String userCode = "SEDAN";
                System.out.println("\n\nList of vehicle of type " + userCode);
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getType().getCode().equals(userCode)) {
                        System.out.println(vehicle);
                    }
                }
            } else if (i == 2) {
                String userCode = "LIMO6";
                System.out.println("\n\nList of vehicle of type " + userCode);
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getType().getCode().equals(userCode)) {
                        System.out.println(vehicle);
                    }
                }
            } else if (i == 3) {
                String userCode = "LIMO8";
                System.out.println("\n\nList of vehicle of type " + userCode);
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getType().getCode().equals(userCode)) {
                        System.out.println(vehicle);
                    }
                }
            } else if (i == 4) {                
            }else{
                System.out.println("\n\nInvalid input, try again.");
            }
        }

    }
}
