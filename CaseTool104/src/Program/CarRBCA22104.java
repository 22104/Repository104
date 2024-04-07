package Program;

public class CarRBCA22104 extends VehicleRBCA22104 {
    private String make;

    public CarRBCA22104 (int horsepower, String make) {
        super(horsepower);
        this.make = make;
    }

    public void drive() {
        super.drive();
        System.out.println("Car is being driven");
    }

    public String getMake() {
        return make;
    }
}
