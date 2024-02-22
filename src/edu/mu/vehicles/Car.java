package edu.mu.vehicles;

import edu.mu.vehicleAttributes.FuelType;
import edu.mu.vehicleAttributes.StartMechanism;
import edu.mu.vehicleAttributes.VehicleColor;

public class Car extends Vehicle{

	public Car(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateMaintenaceCost(double distance) {
		// TODO Auto-generated method stub
		int currentYear = 2024;
		double maintenanceCost = distance * mass * (currentYear-modelYear) * cylinders * 0.0005;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		// TODO Auto-generated method stub
		double fuelEfficiency = cylinders * gasTankCapacity * fuelPrice / (distance * 0.003);
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		//setStartType(StartMechanism.PUSHSTART);
		System.out.println(getStartType());
		
	}

	@Override
	public String getVehicle() {
		// TODO Auto-generated method stub
		return "Car";
	}

}
