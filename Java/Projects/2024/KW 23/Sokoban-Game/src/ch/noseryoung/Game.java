package ch.noseryoung;

import java.awt.*;
import java.util.ArrayList;

public class Game {
    private Point currentPos = new Point();
    ArrayList<Point> checkPoints = new ArrayList<Point>();
    private int[][] gameField;

    public Game() {
        resetField();
    }

    public void moveUp() {
        System.out.println("UP");
        if (currentPos.y > 0 && gameField[currentPos.y - 1][currentPos.x] != 1) {
            checkCheckpoints();
            currentPos.y -= 1;
            gameField[currentPos.y][currentPos.x] = 2;
        } else {
            System.out.println("You can't pass the wall!!");
        }
    }

    public void moveDown() {
        System.out.println("DOWN");
        if (currentPos.y < getColCount() - 1 && gameField[currentPos.y + 1][currentPos.x] != 1) {
            checkCheckpoints();
            currentPos.y += 1;
            gameField[currentPos.y][currentPos.x] = 2;
        } else {
            System.out.println("You can't pass the wall!!");
        }
    }

    public void moveLeft() {
        System.out.println("LEFT");
        if (currentPos.x > 0 && gameField[currentPos.y][currentPos.x - 1] != 1) {
            checkCheckpoints();
            currentPos.x -= 1;
            gameField[currentPos.y][currentPos.x] = 2;
        } else {
            System.out.println("You can't pass the wall!!");
        }
    }

    public void moveRight() {
        System.out.println("RIGHT");
        if (currentPos.x < getRowCount() - 1 && gameField[currentPos.y][currentPos.x + 1] != 1) {
            checkCheckpoints();
            currentPos.x += 1;
            gameField[currentPos.y][currentPos.x] = 2;
        } else {
            System.out.println("You can't pass the wall!!");
        }
    }

    public void checkCheckpoints() {
        if (checkPoints.contains(new Point(currentPos.x, currentPos.y))) {
            gameField[currentPos.y][currentPos.x] = 4;
        } else {
            gameField[currentPos.y][currentPos.x] = 0;
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
        checkPoints.clear();

        for (int y = 0; y < getColCount(); y++) {
            for (int x = 0; x < getRowCount(); x++) {
                if (gameField[y][x] == 2) {
                    currentPos.x = x;
                    currentPos.y = y;
                } else if (gameField[y][x] == 4) {
                    checkPoints.add(new Point(x, y));
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
