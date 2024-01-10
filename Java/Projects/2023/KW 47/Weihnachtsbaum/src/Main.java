import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows for the Christmas tree: ");
        int rows = in.nextInt();

        Tree tree = new Tree(rows);


        while (true) {

            System.out.println("\n***Choose a theme***");
            System.out.println("1 for stars -> *");
            System.out.println("2 for hashtags -> #");
            System.out.println("3 for at-symbols -> @");
            int theme = in.nextInt();

            switch (theme) {
                case 1:
                    tree.printTree1();
                    break;

                case 2:
                    tree.printTree2();
                    break;

                case 3:
                    tree.printTree3();
                    break;

                default:
                    System.err.println("ERROR please enter a valid number for the theme.");
            }

        }


    }
}
