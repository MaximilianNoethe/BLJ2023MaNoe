#include <stdio.h>
#include <stdlib.h>

void sort(int numbers[], int length)
{
    for (int i = 0; i < length - 1; i++)
    {
        for (int p = 0; p < length - 1; p++)
        {
            int temp = 0;

            if (numbers[p] > numbers[p + 1])
            {
                temp = numbers[p];
                numbers[p] = numbers[p + 1];
                numbers[p + 1] = temp;
            }
        }
    }
}

void BinarySearch(int numbers[])
{
    int x = 5;

    int min = numbers[0];
    int max = numbers[4];

    int mid = (max + min) / 2;

    if (mid < x)
    {
        mid = min;
    }
    else
    {
        mid = max;
    }

    printf("%d", mid);
}

int main()
{
    int numbers[] = {8, 5, -6, 0, 32};
    int length = sizeof(numbers) / sizeof(int);

    sort(numbers, length);

    for (int o = 0; o < length; o++)
    {
        printf("\n%d\n", numbers[o]);
    }

    BinarySearch(numbers);

    return 0;
}