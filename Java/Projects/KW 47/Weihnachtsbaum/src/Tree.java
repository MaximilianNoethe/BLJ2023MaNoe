import java.util.Scanner;

public class Tree {
    int rows;

    public Tree() {
    }

    public Tree(int treeRow) {
        this.rows = treeRow;
    }

    void printTree1(){
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
    }

    void printTree2(){

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("#");
            }


            System.out.println();
        }


        for (int l = 1; l <= rows - 2; l++) {
            System.out.print(" ");
        }

        System.out.println("###");

    }

    void printTree3(){
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("@");
            }


            System.out.println();
        }


        for (int l = 1; l <= rows - 2; l++) {
            System.out.print(" ");
        }

        System.out.println("@@@");
    }



}