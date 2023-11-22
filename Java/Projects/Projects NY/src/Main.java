public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "Lumpi";
        String breed = "Border Collie";
        String color = "blue";
        int birthyear = 2012;
/*
        System.out.println(name);
        System.out.println(breed);
        System.out.println(color);
        System.out.println(birthyear);*/

        Dog lumpi = new Dog("Lumpi", "Border Collie", "Blue", 2012);
        Dog jessy = new Dog("Jessy");
        Dog cookie = new Dog();


        System.out.println(lumpi.toString());
        System.out.println(jessy.toString());
        System.out.println(cookie.toString());

        Cat xara = new Cat("Xara", "Bengal", "Brown", 2014, 105);

        System.out.println(xara.toString());
    }
}