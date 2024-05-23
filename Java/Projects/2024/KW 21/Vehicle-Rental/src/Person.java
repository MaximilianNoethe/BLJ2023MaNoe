import java.time.LocalDate;

public class Person {
    private LocalDate birthYear;
    private int age;
    private String name;

    public Person(LocalDate birthYear, String name) {
        this.birthYear = birthYear;

        this.name = name;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}