import java.time.LocalDate;
import java.time.Period;

public class Person {
    private LocalDate birthYear;
    private String name;

    public Person(LocalDate birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return Period.between(birthYear, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }


}