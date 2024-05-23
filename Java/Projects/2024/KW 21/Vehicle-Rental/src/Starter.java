import exceptions.DenyListedPersonException;
import exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) throws MinorAgeException, DenyListedPersonException {
        VehicleRentalManager vrm = new VehicleRentalManager();

        Person testPerson = new Person(LocalDate.of(2007, 1, 16),"Thorfinn");
        vrm.addPersonToCustomerList(testPerson);

        Car testCar = new Car(560, 250.50, "Internal combustion engine", "Mercedes", 4, 4);
        vrm.addVehicle(testCar);

        LocalDate startDate = LocalDate.of(2024, 05, 23);
        LocalDate endDate = LocalDate.of(2024, 06, 23);
        String contractModalities = "content";

        Contract contract = new Contract(startDate, endDate, contractModalities, testPerson, testCar);




        vrm.createContract(contract);

    }
}