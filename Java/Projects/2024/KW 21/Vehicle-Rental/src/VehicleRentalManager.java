import exceptions.DenyListedPersonException;
import exceptions.LeaseLengthCollisionException;
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

    private final int MINIMUM_AGE = 12;

    public void addPersonToCustomerList(Person person) {
        customerList.add(person);
    }

    public void addPersonToDenyList(Person person) {
        denyList.add(person);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void createContract(Contract contract) throws DenyListedPersonException, MinorAgeException, LeaseLengthCollisionException {
        Person person = contract.getPerson();
        if (denyList.contains(person)) {
            throw new DenyListedPersonException();
        } else if (person.getAge() < MINIMUM_AGE) {
            throw new MinorAgeException();
        } else if (checkCollision(contract.getVehicle(), contract.getStartDate(), contract.getEndDate())) {
            throw new LeaseLengthCollisionException();
        } else {
            contracts.add(contract);
            System.out.println("Thank you for signing the contract!");
        }
    }

    private boolean checkCollision(Vehicle vehicle, LocalDate startDate, LocalDate endDate) throws LeaseLengthCollisionException {
        for (Contract validContracts : contracts) {
            if (validContracts.getVehicle().equals(vehicle)) {
                if (startDate.isAfter(validContracts.getStartDate()) && startDate.isBefore(validContracts.getEndDate()) || endDate.isAfter(validContracts.getStartDate()) && endDate.isBefore(validContracts.getEndDate()) || startDate.equals(validContracts.getStartDate()) || endDate.equals(validContracts.getEndDate())) {
                    throw new LeaseLengthCollisionException();
                }
            }
        }
        return true;
    }

}
