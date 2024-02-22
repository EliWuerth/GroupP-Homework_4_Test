package edu.mu;

import edu.mu.vehicleAttributes.FuelType;
import edu.mu.vehicleAttributes.StartMechanism;
import edu.mu.vehicleAttributes.VehicleColor;
import edu.mu.vehicleManager.VehicleManager;
import edu.mu.vehicles.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleManager manager = new VehicleManager();
		
		// Display all vehicle information
		System.out.println("Displaying all vehicles: ");
        manager.displayAllVehicleInformation();

        // Display all car information
        System.out.println("\nList of Cars: ");
        manager.displayAllCarInformation();
        
        // Display all truck information
        System.out.println("\nList of Trucks: ");
        manager.displayAllTruckInformation();

        // Display all SUV information
        System.out.println("\nList of SUVs: ");
        manager.displayAllSUVInformation();

        // Display all MotorBike information
        System.out.println("\nList of MotorBikes: ");
        manager.displayAllMotorBikeInformation();
        
        //Display a specific vehicle information
        Car car = new Car("Honda", "Civic", 2024, 18000, VehicleColor.GRAY, FuelType.ELECTRIC, 50000, 0.25, 6, 14, StartMechanism.PUSHSTART);
        manager.displayVehicleInformation(car);

	}

}
