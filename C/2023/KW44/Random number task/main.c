#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define NUMBER_OF_RANDOMNUMBERS 500

void randomNumbers();

int main()
{
    int myArray[NUMBER_OF_RANDOMNUMBERS] = {};

    randomNumbers(myArray, NUMBER_OF_RANDOMNUMBERS, 10, 104);

    return 0;
}

void randomNumbers()
{
    srand(time(NULL));
    int *array = (int *)malloc(NUMBER_OF_RANDOMNUMBERS * sizeof(int));

    if (array == NULL)
    {
        printf("ERROR\n");
        exit(1);
    }

    int randnum;
    
};