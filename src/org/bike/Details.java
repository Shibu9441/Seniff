package org.bike;

public class Details extends Bike {
	
	private void serviceDate() {
		
		System.out.println("Service date is August");

	}
	
	@Override
	public void bikeModel() {
		
		System.out.println("Bike model is 2023");
	}
	
	public static void main(String[] args) {
		
		Details d =new Details();
		d.bikeModel();
		d.bikename();
		d.bikeColor();
		d.serviceDate();
	}

	
}
