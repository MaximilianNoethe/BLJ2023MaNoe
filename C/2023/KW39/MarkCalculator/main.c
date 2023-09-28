#include <stdio.h>
#include <stdlib.h>

#define NUM_MARKS 5

int main(int argc, char **argv)
{

    printf("-----------------------\n");
    printf("Average Mark Calculator\n");
    printf("-----------------------\n");

    float marks[NUM_MARKS];
    int length = sizeof(marks) / sizeof(float);

    float sum = 0;

    if (NUM_MARKS < 6 || NUM_MARKS > 1)
    {
        printf("Enter a valid mark please!");
    }
    else
    {

        for (int i = 0; i < length; ++i)
        {
            scanf("%f", &marks[i]);
            sum += marks[i];
        }

        // printf("\n%f", sum); -> Addition von allen Zahlen
        // printf("\n%f", marks[0]);

        /*
         * TODO - Read as many marks as defined in NUM_MARKS.
         *      - Save read marks in an array of length NUM_MARKS.
         */

        printf("\n-----------------------\n");

        // TODO - Calculate and store the sum of all marks.

        //  TODO - Calculate and print the average mark.

        printf("Here is your average mark: \n");

        float AvgMark = sum / length;
        printf("%.2f", AvgMark);

        /*
         * TODO - Extra tasks, implement only after completing all previous TODOs.
         *      - Round the calculated average to 2 decimal places (output only). [x]
         *      - While inputting, only allow values between 1.0 and 6.0. []
         *      - For every mark, input a weight and calculate the average accordingly. []
         *      - Allow for the manipulation of individual marks, using the index. []
         */

        return (EXIT_SUCCESS);
    }
}