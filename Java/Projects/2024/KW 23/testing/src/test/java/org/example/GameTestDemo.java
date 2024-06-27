package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameTestDemo {
    @Test
    void test_moveUp_fromFloor_toFloor() {
        int[][] expected = {{2},
                            {0}};
        int[][] actual = {{0},
                          {2}};

        Game game = new Game(actual);
        game.moveUp();
        assertArrayEquals(expected, game.getField());
    }
}