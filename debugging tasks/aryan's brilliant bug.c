#include <stdio.h>

int main() {

    char name[20];
    int age;
    printf("Hello there, what's your name?\n");
    sleep(1);
    printf("My name is: \n");
    scanf("%s", &name);
    printf("Hello %s, How old are you?\n", name);
    scanf("%i", &age);
    if (age >= 18) {
       printf("Welcome to the platform");
    } else {
        printf("Sorry your to young. Please try again in %i years", 18 - age);
    };
    

    return 0;
};