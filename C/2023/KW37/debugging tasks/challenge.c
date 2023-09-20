#include <stdio.h>

int main()
{
    int age = 16;

    printf("I am now %f years old\n", age);

    printf("How old am I gonna be in 10 years?\n");
    scanf("%d", &age);

    if (age == 26)
    {
        printf("Good! You're right");
    }
    else
    {
        float age = 26;
        printf("Too bad, i'm gonna be &d years old", age);
    };

    return 0;
}