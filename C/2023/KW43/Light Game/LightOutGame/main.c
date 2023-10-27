#include <stdio.h>
#include <stdbool.h>
#include <time.h>
#include <stdlib.h>

#define SIZE 5

bool grid[SIZE][SIZE];

void initializeGrid()
{
    srand((unsigned)time(NULL));
    for (int i = 0; i < SIZE; i++)
    {
        for (int j = 0; j < SIZE; j++)
        {
            grid[i][j] = rand() % 2;
        }
    }
}

void printGrid()
{
    printf("\nLights Out Game\n");
    for (int i = 0; i < SIZE; i++)
    {
        for (int j = 0; j < SIZE; j++)
        {
            printf(grid[i][j] ? " . " : " # ");
        }
        printf("\n");
    }
}

void toggleLight(int row, int col)
{
    grid[row][col] = !grid[row][col];
    if (row > 0)
        grid[row - 1][col] = !grid[row - 1][col];
    if (row < SIZE - 1)
        grid[row + 1][col] = !grid[row + 1][col];
    if (col > 0)
        grid[row][col - 1] = !grid[row][col - 1];
    if (col < SIZE - 1)
        grid[row][col + 1] = !grid[row][col + 1];
}

bool isGameWon()
{
    for (int i = 0; i < SIZE; i++)
    {
        for (int j = 0; j < SIZE; j++)
        {
            if (grid[i][j])
                return false;
        }
    }
    return true;
}

int main()
{
    initializeGrid();
    printf("Welcome to the Lights Out Game!\n");
    printGrid();

    while (!isGameWon())
    {
        int row, col;
        printf("Enter row and column (0-%d) to toggle a light or 'x' to exit: ", SIZE - 1);
        char input[10];
        fgets(input, sizeof(input), stdin);

        if (input[0] == 'x')
        {
            printf("You've exited the game.\n");
            break;
        }
        else
        {
            int result = sscanf(input, "%d %d", &row, &col);
            if (result == 2 && row >= 0 && row < SIZE && col >= 0 && col < SIZE)
            {
                toggleLight(row, col);
            }
            else
            {
                printf("Invalid input. Please enter row and column (0-%d) or 'x' to exit.\n", SIZE - 1);
            }
            printGrid();
        }
    }

    if (isGameWon())
    {
        printf("Congratulations! You've won the game.\n");
    }

    return 0;
}