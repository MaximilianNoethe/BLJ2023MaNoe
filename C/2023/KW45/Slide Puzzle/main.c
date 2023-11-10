#include <stdio.h>
#include "utils.h"

#define FIELD_SIZE 4

int cordX;
int cordY;

int main(void)
{
    int field[FIELD_SIZE][FIELD_SIZE] = {
        {0, 15, 1, 13},
        {8, 5, 2, 3},
        {14, 7, 4, 9},
        {10, 11, 6, 12},
    };
    int input = 0;

    do
    {
        printField(FIELD_SIZE, field);
        scanf("%d", &input);

        if (input == 1)
        {
            swapValues(&field[0][0], &field[0][1]);
        }

    } while (input != 0);
    printf("\ndone");
    return 0;
}