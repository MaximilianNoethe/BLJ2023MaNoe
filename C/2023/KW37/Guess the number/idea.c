#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{

    const int MIN = 0;
    const int MAX = 100;
    int guess = 0;

    int maxGuesses = 4;

    srand(time(0));

    while (1)
    {
        int guesses = 0;

        int answer = (rand() % MAX) + MIN;

        do
        {
            printf("Guess a number between 0-100:");
            scanf("%d", &guess);

            if (guess > answer)
            {
                printf("False, too high!\n\n");
            }
            else if (guess < answer)
            {
                printf("False, too low!\n\n");
            }
            else
            {
                printf("\nNice! You won!!\n");
            };
            guesses++;

            if (guesses > maxGuesses && guess != answer)
            {
                printf("You lost!\n");
                break;
            }
        } while (guess != answer);

        printf("---------------------------\n");
        printf("answer: %d\n", answer);
        printf("guesses: %d\n", guesses);
        printf("---------------------------\n");

        char Y = 'Y';
        char N = 'N';

        if (guess == answer || guess != answer)
        {
            printf("Do you want to play again? [Y/N]");
            char input[2];
            scanf("%1s", input);
            if (input[0] == 'N')
            {
                printf("Thank you for playing, see you next time!");
                break;
            }
        }
    }
    return 0;
}