#include <stdio.h>

void printBoard(int board[3][3])
{
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("%c", (board[i][j] == 0) ? ' ' : (board[i][j] == 1) ? 'X'
                                                                       : 'O');
            if (j < 2)
                printf(" | ");
        }
        printf("\n");
        if (i < 2)
            printf("---------\n");
    }
}

int checkWin(int board[3][3], int player)
{
    for (int i = 0; i < 3; i++)
    {
        if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
            return 1;
        if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
            return 1;
    }

    if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
        return 1;
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
        return 1;

    return 0;
}

int main()
{
    int row, col;
    int matrix[3][3] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    int currentPlayer = 1;
    int moveCount = 0;

    while (1)
    {
        printf("Tic-Tac-Toe Game\n");
        printBoard(matrix);

        printf("Player %d, choose a space (1-9): ", currentPlayer);
        scanf("%d", &row);

        if (row < 1 || row > 9)
        {
            printf("Invalid input. Please choose a space between 1 and 9.\n");
            continue;
        }

        row--;
        if (matrix[row / 3][row % 3] != 0)
        {
            printf("Space is already occupied. Choose another space.\n");
            continue;
        }

        matrix[row / 3][row % 3] = currentPlayer;

        if (checkWin(matrix, currentPlayer))
        {
            printf("Player %d wins!\n", currentPlayer);
            break;
        }

        moveCount++;

        if (moveCount == 9)
        {
            printf("It's a draw!\n");
            break;
        }

        // Switch to the other player
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    return 0;
}