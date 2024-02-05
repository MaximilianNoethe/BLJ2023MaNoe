import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();

        for (int i = num1; i <= num2; i++){

           sum = sum + i;
        }
        System.out.println("Your sum is: " + sum);
    }
}