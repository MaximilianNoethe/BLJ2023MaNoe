import exceptions.DenyListedPersonException;
import exceptions.LeaseLengthCollisionException;
import exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) throws MinorAgeException, DenyListedPersonException, LeaseLengthCollisionException {
        VehicleRentalManager vrm = new VehicleRentalManager();

        // Cars - jdm
        Car jdm1 = new Car(1500, 35.00, "Internal combustion engine", "Nissan", 4, 4);  // Nissan Skyline GT-R
        vrm.addVehicle(jdm1);

        Car jdm2 = new Car(1400, 37.50, "Internal combustion engine", "Toyota", 4, 4);  // Toyota Supra
        vrm.addVehicle(jdm2);

        Car jdm3 = new Car(1300, 40.00, "Internal combustion engine", "Mazda", 4, 4);   // Mazda RX-7
        vrm.addVehicle(jdm3);

        // Cars - luxury
        Car luxury1 = new Car(2100, 80.50, "Electric engine", "Mercedes-Benz", 4, 4);  // Mercedes-Benz S-Class
        vrm.addVehicle(luxury1);

        Car luxury2 = new Car(2000, 85.75, "Internal combustion engine", "BMW", 4, 4); // BMW 7 Series
        vrm.addVehicle(luxury2);

        Car luxury3 = new Car(2200, 90.00, "Electric engine", "Audi", 4, 4);           // Audi A8
        vrm.addVehicle(luxury3);

        // Cars - sport
        Car sports1 = new Car(1600, 75.00, "Internal combustion engine", "Porsche", 2, 4);  // Porsche 911
        vrm.addVehicle(sports1);

        Car sports2 = new Car(1570, 100.00, "Hybrid engine", "Ferrari", 2, 4);              // Ferrari SF90 Stradale
        vrm.addVehicle(sports2);

        Car sports3 = new Car(1550, 95.00, "Internal combustion engine", "Lamborghini", 2, 4); // Lamborghini Huracan
        vrm.addVehicle(sports3);


        // Person 1
        Person testPerson = new Person(LocalDate.of(2007, 4, 24), "Aryan");
        vrm.addPersonToCustomerList(testPerson);
        //vrm.addPersonToDenyList(testPerson);

        // Contractinfos
        LocalDate startDate = LocalDate.of(2024, 05, 23);
        LocalDate endDate = LocalDate.of(2024, 06, 23);
        String contractModalities = "content";

        Contract contract = new Contract(startDate, endDate, contractModalities, testPerson, jdm1);
        vrm.createContract(contract);


        // Person 2
        Person testPerson2 = new Person(LocalDate.of(2000, 1, 16), "Max");
        vrm.addPersonToCustomerList(testPerson2);

        // Contractinfos
        LocalDate startDate1 = LocalDate.of(2024, 04, 23);
        LocalDate endDate2 = LocalDate.of(2024, 12, 23);
        String contractModalities2 = "content";

        Contract contract2 = new Contract(startDate1, endDate2, contractModalities2, testPerson2, luxury3);
    }
}