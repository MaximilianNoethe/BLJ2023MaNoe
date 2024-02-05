import java.util.Scanner;
import java.lang.Math.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of your tree in meters: ");
        int length = input.nextInt();

        System.out.println("Enter the center diameter of your tree in centimeters: ");
        int centerDiameter = input.nextInt();

        double treeTrunkVolume = 0;
        treeTrunkVolume = Math.PI / 4 * centerDiameter * centerDiameter * length / 10000;

        System.out.println("The volume of your tree trunk is " + treeTrunkVolume + "cm^3");
    }
}