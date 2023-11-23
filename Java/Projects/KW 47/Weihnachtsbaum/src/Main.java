import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows for the Christmas tree: ");
        int rows = in.nextInt();

        Tree tree = new Tree(rows);



while (true){
    System.out.println();
    System.out.println("***Choose a theme***");
    System.out.println("1 for stars -> *");
    System.out.println("2 for hashtags -> #");
    System.out.println("3 for at-symbols -> @");
    int theme = in.nextInt();

    switch (theme){
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
        /*
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }


            System.out.println();
        }


        for (int l = 1; l <= rows - 2; l++) {
            System.out.print(" ");
        }

        System.out.println("***");
*/
    }
}
