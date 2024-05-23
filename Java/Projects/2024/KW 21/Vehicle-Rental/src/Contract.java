import java.time.LocalDate;

public class Contract {
    private LocalDate startDate;
    private LocalDate endDate;
    private String contractModalities;
    private Person person;
    private Vehicle vehicle;

    public Contract(LocalDate startDate, LocalDate endDate, String contractModalities, Person person, Vehicle vehicle) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractModalities = contractModalities;
        this.person = person;
        this.vehicle = vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getContractModalities() {
        return contractModalities;
    }

    public Person getPerson() {
        return person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
