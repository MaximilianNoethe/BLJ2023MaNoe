import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Media> medias = new ArrayList<>();


        medias.add(new Book("Heroes of Olympus: The Blood of Olympus",
                "English",
                "Fantasy, Young Adult",
                14.99,
                "Rick Riordan",
                528));

        medias.add(new Book("Bleach volume 1",
                "English",
                "Shōnen-Manga (Action, Adventure)",
                12.00,
                "Tite Kubo",
                192));

        medias.add(new Book("Vinland Saga volume 24",
                "English",
                "Seinen-Manga (Action, Adventure, Drama)",
                11.00,
                "Makoto Yukimura",
                250));


        medias.add(new Videogame("Elden Ring",
                "English",
                "Action RPG, Souls-Like",
                69.90,
                "Banda Namco Entertainment",
                "Console and PC",
                75));

        medias.add(new Videogame("Ghost of Tsushima",
                "English",
                "Action-Adventure, Open World",
                50.00,
                "Sony",
                "Console (PS-Only)",
                45));

        medias.add(new Videogame("God of War",
                "English",
                "Action-Adventure, Hack and Slash",
                55.00,
                "Sony",
                "Console (PS-Only)",
                50));


        medias.add(new Song("Redrum",
                "English",
                "Hip-Hop",
                1.50,
                "21 Savage",
                2.43));

        medias.add(new Song("Duvet",
                "English",
                "Trip-hop",
                1.29,
                "Boa",
                3.55));

        medias.add(new Song("679",
                "English",
                "Hip-Hop",
                1.29,
                "Fetty Wap",
                3.09));

        Boolean exit = false;
        while (!exit) {
            System.out.println("""
                    Welcome to the coolest media library
                                    
                    What kind of media do you want to see?
                                    
                    --Media--
                    Books (b)
                    Videogames (v)
                    Songs (s)
                    Everything (a)
                    
                    Exit (x)
                                    
                    Please enter your choice:""");
            String input = scanner.next();

            switch (input) {
                case "b":
                    System.out.println("Books:");
                    for (Media media : medias) {
                        if (media instanceof Book) {
                            media.printInfo();
                        }

                    }
                    break;


                case "v":
                    System.out.println("Videogames:");
                    for (Media media : medias) {
                        if (media instanceof Videogame) {
                            media.printInfo();
                        }

                    }
                    break;


                case "s":
                    System.out.println("Songs:");
                    for (Media media : medias) {
                        if (media instanceof Song) {
                            media.printInfo();
                        }

                    }
                    break;

                case "a":
                    System.out.println("Everything:");
                    for (Media media : medias) {
                        media.printInfo();
                    }
                    break;

                case "x":
                    exit = true;
                    System.out.println("Thank you for visiting my Media-library, see you next time!");
                    break;

                default:
                    System.out.println("Invalid input");
                    break;


            }
        }
    }
}