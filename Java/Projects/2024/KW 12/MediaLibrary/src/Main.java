import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Videogame> videogames = new ArrayList<>();
        ArrayList<Song> songs = new ArrayList<>();


        Book b1 = new Book("Heroes of Olympus: The Blood of Olympus",
                "English",
                "Fantasy, Young Adult",
                14.99,
                "Rick Riordan",
                528);

        Book b2 = new Book("Bleach volume 1",
                "English",
                "Shōnen-Manga (Action, Adventure)",
                12.00,
                "Tite Kubo",
                192);

        Book b3 = new Book("Vinland Saga volume 24",
                "English",
                "Seinen-Manga (Action, Adventure, Drama)",
                11.00,
                "Makoto Yukimura",
                250);


        Videogame v1 = new Videogame("Elden Ring",
                "English",
                "Action RPG, Souls-Like",
                69.90,
                "Banda Namco Entertainment",
                "Console and PC",
                75);

        Videogame v2 = new Videogame("Ghost of Tsushima",
                "English",
                "Action-Adventure, Open World",
                50.00,
                "Sony",
                "Console (PS-Only)",
                45);

        Videogame v3 = new Videogame("God of War",
                "English",
                "Action-Adventure, Hack and Slash",
                55.00,
                "Sony",
                "Console (PS-Only)",
                50);


        Song s1 = new Song("Redrum",
                "English",
                "Hip-Hop",
                1.50,
                "21 Savage",
                2.43);

        Song s2 = new Song("Duvet",
                "English",
                "Trip-hop",
                1.29,
                "Boa",
                3.55);

        Song s3 = new Song("679",
                "English",
                "Hip-Hop",
                1.29,
                "Fetty Wap",
                3.09);


        System.out.println("""
                Welcome to the coolest media library
                                
                What kind of media do you want to see?
                                
                --Media--
                Books (b)
                Videogames (v)
                Songs (s)
                                
                Please enter your choice:
                """);
        String input = scanner.next();

        switch (input) {
            case "b":
                b1.printInfo();
                b2.printInfo();
                b3.printInfo();
                break;


            case "v":
                v1.printInfo();
                v2.printInfo();
                v3.printInfo();
                break;


            case "s1":
                s1.printInfo();
                s2.printInfo();
                s3.printInfo();
                break;


        }
    }
}