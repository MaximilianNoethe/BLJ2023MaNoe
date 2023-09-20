#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
    int zahl, i;

    time_t number = time(NULL);
    srand(number);

    for (i = 0; i < 5; i++)
    {
        zahl = rand() % 15;
        printf("%d\n", zahl);
    }






}
