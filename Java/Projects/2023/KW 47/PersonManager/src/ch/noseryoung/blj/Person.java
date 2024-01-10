package ch.noseryoung.blj;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;
    private String ethnicity;


    public Person() {
    }

    public Person(String name, int age, int height, int weight, String ethnicity) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.ethnicity = ethnicity;
    }


    void eating() {
        System.out.println(name + "mampf!");
    }

    void singing() {
        System.out.println(name + "LAlaLAlaLAla");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", ethnicity='" + ethnicity + '\'' +
                '}';
    }
}


