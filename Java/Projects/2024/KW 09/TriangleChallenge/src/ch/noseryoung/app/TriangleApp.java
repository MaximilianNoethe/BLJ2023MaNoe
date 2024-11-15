package ch.noseryoung.app;

import java.time.LocalDate;
import java.util.Scanner;

import ch.noseryoung.exceptions.*;

import javax.crypto.spec.PSource;


public class TriangleApp {
    private Scanner scanner = new Scanner(System.in);

    private String company;
    private String handler;

    private boolean isRunning;

    private String sideAInput;
    private String sideBInput;
    private String sideCInput;

    private double sideA;
    private double sideB;
    private double sideC;

    private String code;

    /**
     * The constructor.
     *
     * @param company of type String to print in the application header
     * @param handler of type String to print in the application header
     */
    public TriangleApp(String company, String handler) {
        this.company = company;
        this.handler = handler;
        isRunning = true;


    }

    /**
     * This method starts the actual application. It will remain in a loop as long
     * as the field "isRunning" is true.
     */
    public void start() {
        printHeader();
        while (isRunning) {
            System.out.println("\nTEST CASES TRIANGLE\n");

            sideAInput = promptSide("A");
            sideBInput = promptSide("B");
            sideCInput = promptSide("C");

            try {
                validateInput();
                code = determineTriangleType();
            } catch (TriangleException e) {
                code = e.getMessage();
            } finally {
                printResult();
                promptAction();
            }
        }
    }

    /**
     * This method prints the application header.
     */
    private void printHeader() {
        System.out.println("""
                ****************************************
                           TRIANGLE EVALUATOR           
                ****************************************
                                
                """);
        System.out.println("****************************************");
        System.out.println("           TRIANGLE EVALUATOR           ");
        System.out.println("****************************************");
        System.out.println("COMPANY: " + company + LocalDate.now().getYear());
        System.out.println("HANDLER: " + handler);
        System.out.println("****************************************");

        // tripple " for sout


    }

    /**
     * This method prints the evaluated code in an aesthetically pleasing way.
     */
    private void printResult() {
        System.out.println();
        System.out.println("****************************************");
        System.out.println("CODE: " + code);
        System.out.println("****************************************");
        System.out.println();
    }

    /**
     * This method prompts the user to give an input for a trinalge side.
     *
     * @param side of type String to display as title for the prompt.
     * @return the input of type String.
     */
    private String promptSide(String side) {


        System.out.println("Enter side " + side + ": ");

        return scanner.nextLine();
    }

    /**
     * This method prompts the user to give an input.<br>
     * "q": Quits the program.<br>
     * "c": Continues the program.<br>
     * else: Keeps asking for an input until "q" or "c" is entered.
     */
    private void promptAction() {
        String action = "";
        boolean selection = true;

        while (selection) {
            System.out.println("<q> QUIT");
            System.out.println("<c> CONTINUE");

            action = scanner.nextLine();

            //if (action.equals("c")) {
            if ("c".equals(action)) {
                isRunning = true;
                selection = false;
            } else if (action.equals("q")) {
                isRunning = false;
                selection = false;
            } else {
                System.out.println("Enter a valid input please!");
                System.out.println();
            }
        }
    }

    /**
     * This method validates the three entered values, to be used as sides for a
     * triangle.
     *
     * @throws TriangleException if the validation fails. This means that the
     *                           entered values do not lead to a triangle.
     */
    private void validateInput() throws TriangleException {
        try {
            sideA = Double.parseDouble(sideAInput);
            sideB = Double.parseDouble(sideBInput);
            sideC = Double.parseDouble(sideCInput);
        } catch (NumberFormatException nfe) {
            throw new IllegalTriangleSideException();
        }

        if (sideA == 0 || sideB == 0 || sideC == 0) {
            throw new ZeroTriangleSideException();
        }

        if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new NegativeTriangleSideException();
        }
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            throw new ImpossibleTriangleException();
        }
        if (sideA + sideB == sideC || sideA + sideC == sideB || sideB + sideC == sideA) {
            throw new TriangleIsLineException();
        }

    }

    /**
     * This method determines whether the three entered values lead to a
     * equilateral, isosceles, right*angled or scalene triangle.
     *
     * @return The corresponding code for each triangle.
     */
    private String determineTriangleType() {
        if (sideA == sideB && sideB == sideC) {
            // Gleichseitiges Dreieck
            return "TRI66TF";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            // Gleichschenkliges Dreieck
            return "TRI84TF";
        } else if ((sideA * sideA) + (sideB * sideB) == (sideC * sideC) || (sideA * sideA) + (sideC * sideC) == (sideB * sideB) || (sideB * sideB) + (sideC * sideC) == (sideA * sideA)) {
            // Rechtwinlkliges Dreieck
            return "TRI72TF";
        } else if (sideA + sideB > sideC || sideA + sideC > sideB || sideB + sideC > sideA) {
            // Gewöhnliches Dreieck
            return "TRI60TF";
        }
        return null;
    }
}
