import exceptions.DenyListedPersonException;
import exceptions.MinorAgeException;

import java.time.LocalDate;
import java.util.ArrayList;

public class VehicleRentalManager {
    private ArrayList<Person> customerList;
    private ArrayList<Person> denyList;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Contract> contracts;


    public VehicleRentalManager() {
        this.customerList = new ArrayList<Person>();
        this.denyList = new ArrayList<Person>();
        this.vehicles = new ArrayList<Vehicle>();
        this.contracts = new ArrayList<Contract>();
    }

    private final int MINIMUM_AGE = 22;

    public void createContract(Contract contract) throws DenyListedPersonException, MinorAgeException {
        Person person = contract.getPerson();
        if (denyList.contains(person)) {
            throw new DenyListedPersonException();
        } else if (person.getAge() < MINIMUM_AGE) {
            throw new MinorAgeException();
        } else {
            contracts.add(contract);
            System.out.println("Thank you for signing the contract!");
        }
    }


    public void addPersonToCustomerList(Person person) {
        customerList.add(person);
    }

    public void addPersonToDenyList(Person person) {
        denyList.add(person);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }


}
