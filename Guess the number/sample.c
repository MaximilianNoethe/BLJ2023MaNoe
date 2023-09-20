#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{

    const int MIN = 0;
    const int MAX = 100;
    int guess = 0;
    int guesses = 0;
    int maxGuesses = 5;

    printf("Range: %d to %d\n",MIN, MAX);
    
    srand(time(0));

    int answer = (rand() % MAX) + MIN;

    do
    {
        printf("Enter a number between 0-100:");
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

        if (guesses >= maxGuesses)
        {
            printf("You lost!\n");
        }
    } while (guess != answer);

    printf("---------------------------\n");
    printf("answer: %d\n", answer);
    printf("guesses: %d\n", guesses);
    printf("---------------------------");

    char Y = 'Y';
    char N = 'N';

    if (guess == answer)
    {
        printf("Do you want to play again? [Y/N]");

        else if (scanf("%c", Y))
        {
            
        }
    }
    else
    {
        printf("Thank you for playing, see you next time!");
        break;
    }

    return 0;




}



