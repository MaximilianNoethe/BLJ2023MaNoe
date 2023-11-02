#include <stdio.h>

void swappy();

int main()
{
    int x = 3;
    int y = 4;

    printf("value of x before swap: %d\n", x);
    printf("value of y before swap: %d\n\n", y);

    swappy(&x, &y);

    printf("value of x after swap: %d\n", x);
    printf("value of y after swap: %d\n\n", y);
    

    return 0;
}

void swappy(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
};