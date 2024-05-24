import exceptions.DenyListedPersonException;
import exceptions.LeaseLengthCollisionException;
import exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) throws MinorAgeException, DenyListedPersonException, LeaseLengthCollisionException {
        VehicleRentalManager vrm = new VehicleRentalManager();

        // Cars
        Car testCar = new Car(1990, 50.50, "Internal combustion engine", "Mercedes", 4, 4);
        vrm.addVehicle(testCar);

        //Car testCar2 = new Car()

        // Person 1
        Person testPerson = new Person(LocalDate.of(2007, 4, 24),"Aryan");
        vrm.addPersonToCustomerList(testPerson);
        //vrm.addPersonToDenyList(testPerson);

        // Contractinfos
        LocalDate startDate = LocalDate.of(2024, 05, 23);
        LocalDate endDate = LocalDate.of(2024, 06, 23);
        String contractModalities = "content";

        Contract contract = new Contract(startDate, endDate, contractModalities, testPerson, testCar);
        vrm.createContract(contract);


        // Person 2
        Person testPerson2 = new Person(LocalDate.of(2000, 1,16), "Max");
        vrm.addPersonToCustomerList(testPerson2);

        // Contractinfos
        LocalDate startDate1 = LocalDate.of(2024, 04, 23);
        LocalDate endDate2 = LocalDate.of(2024, 12, 23);
        String contractModalities2 = "content";

        Contract contract2 = new Contract(startDate1, endDate2, contractModalities2, testPerson2, testCar);
    }
}