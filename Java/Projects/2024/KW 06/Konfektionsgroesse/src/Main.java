import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int clothingSize = 0;
        System.out.println("Enter your gender (m/f): ");
        char gender = input.next().charAt(0);

        System.out.println("Enter your height in cm: ");
        int height = input.nextInt();

        System.out.println("Enter your chest circumference in cm: ");
        int chestCircumference = input.nextInt();

        clothingSize = chestCircumference / 2;

        if (gender == 'm') {
            System.out.println("Your clothingsize is " + clothingSize);
        } else if (gender == 'f') {
            clothingSize = clothingSize - 6;

            if (height > 170) {
                clothingSize = clothingSize * 2;
                System.out.println("Your clothingsize is " + clothingSize);

            } else if (height < 164) {
                clothingSize = clothingSize / 2;
                System.out.println("Your clothingsize is " + clothingSize);

            } else {
                System.out.println("Your clothingsize is " + clothingSize);
            }
        }


    }
}