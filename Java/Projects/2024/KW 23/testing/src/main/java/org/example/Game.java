package org.example;

import java.awt.*;
import java.util.ArrayList;

public class Game {
    private Point currentPos = new Point();
    ArrayList<Point> checkPoints = new ArrayList<Point>();
    private int[][] gameField;

    public Game() {

        initializePos();
    }


    public Game(int[][] gameField) {
        this.gameField = gameField;
        initializePos();
    }

    public void moveUp() {
        System.out.println("UP");

        move(0, -1);


    }

    public void moveDown() {
        System.out.println("DOWN");

        move(0, 1);


    }

    public void moveLeft() {
        System.out.println("LEFT");

        move(-1, 0);


    }

    public void moveRight() {
        System.out.println("RIGHT");

        move(1, 0);


    }

    public void checkCheckpoints() {
        Point prevPoint = new Point(currentPos);
        gameField[prevPoint.x][prevPoint.y] = 0;
        for (int i = 0; i < checkPoints.size(); i++) {
            if (prevPoint.x == checkPoints.get(i).x && prevPoint.y == checkPoints.get(i).y) {
                gameField[currentPos.x][currentPos.y] = 4;
            }
        }
    }

    public void move(int vertical, int horizontal) {
        int newX = currentPos.x + horizontal;
        int newY = currentPos.y + vertical;

        if (newX < 0 || newX > getRowCount() || newY < 0 || newY > getColCount()) {
            System.out.println("Out of Bounds");
            return;
        }

        if (gameField[currentPos.x + horizontal][currentPos.y + vertical] == 1) {
            System.out.println("You can't go through this wall!");
        } else {
            if (gameField[currentPos.x + horizontal][currentPos.y + vertical] == 3) {
                if (!moveBox(vertical, horizontal)) {
                    return;
                }
            }

            checkCheckpoints();
            currentPos.x += horizontal;
            currentPos.y += vertical;
            gameField[currentPos.x][currentPos.y] = 2;
        }
    }


    public boolean moveBox(int vertical, int horizontal) {
        int nextX = currentPos.x + (2 * horizontal);
        int nextY = currentPos.y + (2 * vertical);

        if (gameField[nextX][nextY] == 1 || gameField[nextX][nextY] == 3) {
            System.out.println("You can't move this box.");
            return false;
        } else {
            gameField[nextX][nextY] = 3;
            System.out.println("Box has been moved");


            boolean hasWon = true;
            for (int y = 0; y < getColCount(); y++) {
                for (int x = 0; x < getRowCount(); x++) {
                    if (4 == gameField[y][x]) {
                        hasWon = false;
                    }

                }
            }

            if (hasWon == true) {
                System.out.println("""
                        *************************************
                        CONGRATS YOU WON THE SOKOBAN-GAME
                        *************************************
                        """);

                resetField();
            }

            return true;
        }


    }

    private void initializePos() {
        for (int y = 0; y < getColCount(); y++) {
            for (int x = 0; x < getRowCount(); x++) {
                if (gameField[y][x] == 2) {
                    currentPos.x = x;
                    currentPos.y = y;
                } else if (gameField[y][x] == 4) {
                    checkPoints.add(new Point(y, x));
                }
            }
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
                {0, 1, 3, 4, 3, 3, 3, 4, 1, 0},
                {0, 1, 0, 0, 0, 4, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        checkPoints.clear();

        initializePos();
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
