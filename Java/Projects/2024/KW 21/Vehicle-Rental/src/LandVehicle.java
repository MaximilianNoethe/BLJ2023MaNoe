public class LandVehicle extends Vehicle {
    private int wheelCount;

    public LandVehicle(int weight, double pricePerHour, String motorType, String vehicleBrand, int seatNumber, int wheelCount) {
        super(weight, pricePerHour, motorType, vehicleBrand, seatNumber);
        this.wheelCount = wheelCount;
    }
}
