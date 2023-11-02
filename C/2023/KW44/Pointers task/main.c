#include <stdio.h>

void swappy();

int main()
{
    int x = 3;
    int y = 4;

    swappy();

    printf("value of x is: %d\n", x);
    printf("value of y is: %d\n", y);

    return 0;
}

void swappy(int *y, int *x)
{
    int temp = *x;
    *x = *y;
    *y = temp;
};