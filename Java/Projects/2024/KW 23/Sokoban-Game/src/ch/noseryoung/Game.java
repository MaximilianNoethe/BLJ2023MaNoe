package ch.noseryoung;

import java.awt.*;

public class Game {
    private Point p = new Point();
    private int[][] gameField;

    public Game() {
        gameField = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 4, 2, 3, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 3, 4, 1, 0, 0},
                {0, 1, 4, 1, 1, 3, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 4, 0, 1, 1, 0},
                {0, 1, 3, 0, 3, 3, 3, 4, 1, 0},
                {0, 1, 0, 0, 0, 4, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        for (int i = 0; i < getColCount(); i++) {
            for (int j = 0; j < getRowCount(); j++) {
                if (gameField[i][j] == 2) {
                    p.x = i;
                    p.y = j;
                }
            }
        }
    }

    public void moveUp() {
        System.out.println("UP");

        gameField[p.x][p.y] = 0;
        p.x -= 1;
        gameField[p.x][p.y] = 2;
    }

    public void moveDown() {
        System.out.println("DOWN");

        gameField[p.x][p.y] = 0;
        p.x += 1;
        gameField[p.x][p.y] = 2;
    }

    public void moveLeft() {
        System.out.println("LEFT");

       // if (p.x >= 0 && gameField[p.y][p.x + 1] != 1) {
            gameField[p.x][p.y] = 0;
            p.y -= 1;
            gameField[p.x][p.y] = 2;
       // } else {


        }


   // }

    public void moveRight() {
        System.out.println("RIGHT");

        gameField[p.x][p.y] = 0;
        p.y += 1;
        gameField[p.x][p.y] = 2;
    }

    public void resetField() {
        System.out.println("ESC");
    }

    public int[][] getField() {
        return gameField;
    }

    public int getColCount() {
        return gameField.length;
    }

    public int getRowCount() {
        return gameField[0].length;
    }
}
