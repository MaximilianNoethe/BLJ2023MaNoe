package ch.noseryoung;

import java.awt.*;

public class Game {
    private Point currentPos = new Point();
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
                    currentPos.x = i;
                    currentPos.y = j;
                }
            }
        }
    }

    public void moveUp() {
        System.out.println("UP");

        if (currentPos.y > 0 && gameField[currentPos.y - 1][currentPos.x] != 1) {
            gameField[currentPos.y][currentPos.x] = 0;
            currentPos.y -= 1;
            gameField[currentPos.y][currentPos.x] = 2;
        } else {

            System.out.println("You can't pass the wall!!");
        }
    }

    public void moveDown() {
        System.out.println("DOWN");

        if (currentPos.y < getColCount() - 1 && gameField[currentPos.y + 1][currentPos.x] != 1) {
            gameField[currentPos.y][currentPos.x] = 0;
            currentPos.y += 1;
            gameField[currentPos.y][currentPos.x] = 2;
        } else {
            System.out.println("You can't pass the wall!!");
        }
    }

    public void moveLeft() {
        System.out.println("LEFT");

        if (currentPos.x > 0 && gameField[currentPos.y][currentPos.x - 1] != 1) {
            gameField[currentPos.y][currentPos.x] = 0;
            currentPos.x -= 1;
            gameField[currentPos.y][currentPos.x] = 2;
        } else {

            System.out.println("You can't pass the wall!!");
        }
    }

    public void moveRight() {
        System.out.println("RIGHT");

        if (currentPos.x < getRowCount() - 1 && gameField[currentPos.y][currentPos.x + 1] != 1) {
            gameField[currentPos.y][currentPos.x] = 0;
            currentPos.x += 1;
            gameField[currentPos.y][currentPos.x] = 2;
        } else {
            System.out.println("You can't pass the wall!!");
        }
    }

    public void resetField() {
        System.out.println("ESC");
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
                    currentPos.x = i;
                    currentPos.y = j;
                }
            }
        }
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
