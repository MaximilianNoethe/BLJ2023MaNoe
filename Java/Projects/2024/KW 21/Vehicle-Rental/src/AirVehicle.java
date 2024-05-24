public class AirVehicle extends Vehicle {
    private String driveType;


    public AirVehicle(int weight, float pricePerHour, String motorType, String vehicleBrand, int seatNumber, String driveType) {
        super(weight, pricePerHour, motorType, vehicleBrand, seatNumber);
        this.driveType = driveType;
    }
}
