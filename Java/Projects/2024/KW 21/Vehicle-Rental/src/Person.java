import java.time.LocalDate;

public class Person {
    private LocalDate birthYear;
    private int age;
    private String name;

    public Person(LocalDate birthYear, int age, String name) {
        this.birthYear = birthYear;
        this.age = age;
        this.name = name;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}