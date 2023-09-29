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

int main()
{
    int numbers[] = {62, -1234555, -96, 0, 32};
    int length = sizeof(numbers) / sizeof(int);

    sort(numbers, length);

    printf("%d, ", numbers[0]);
    printf("%d, ", numbers[1]);
    printf("%d, ", numbers[2]);
    printf("%d, ", numbers[3]);
    printf("%d", numbers[4]);

    return 0;
}
