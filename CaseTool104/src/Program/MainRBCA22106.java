package Program;

public class MainRBCA22106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating an object of the Car class
	    	CarRBCA22104 car = new CarRBCA22104 (50, "Toyota");

	        // Calling the drive method
	        car.drive();

	        // Getting the horsepower and make of the car
	        int carHorsepower = car.getHorsepower();
	        String carMake = car.getMake();

	        // Outputting the car's horsepower and make
	        System.out.println("Car's horsepower: " + carHorsepower);
	        System.out.println("Car's make: " + carMake);
	    }
	}

