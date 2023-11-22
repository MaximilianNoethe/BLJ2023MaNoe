public class Dog { // Eigenschaften, Attribute, Builds

    private String name;
    private String breed;
    private String color;
    private int birthyear;

    public Dog(){}

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, String breed, String color, int birthyear) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.birthyear = birthyear;
    }

    void barking(){
        System.out.println(name + "Woof! Woof!");
    }

    void sleeping(){
        System.out.println(name + "ZZzzzZZZzZ");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }


    @Override
    public String toString() {
        return "Dog" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", birthyear=" + birthyear;
    }
}
