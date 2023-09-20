#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int sum(int a, int b);
float avg(int a, int b, int c, int d);

/*
    -> print "Hello!"
*/
void say_hello();

/*
5   -> print "*****"
0   -> print ""
1   -> print "*"
*/
void print_stars(int count);

/*
0, 10   -> 3
0, 10   -> 7
0, 10   -> 0
*/
int random_num(int min, int max);

/*
5   -> 0
2   -> 1
234 -> 1
*/
int is_even(int num);

/*
0   -> 32
100 -> 212
-11 -> 12.2
*/
float celsius_to_fahrenheit(float celsius);

/*
32  -> 0
0   -> -17.7778
100 -> 37.7778
*/
float fahrenheit_to_celsius(float fahrenheit);

/*
1   -> print "#"
2   -> print "##"
          ##
5   -> print "#####"
          #   #
          #   #
          #   #
          #####
*/
void print_square(int size);

/*
(Eigenrecherche, was die Fibonacci Reihe ist)
*/
int fibonacci_sequence(int count);

/*
(Eigenrecherche, wie Primzahlen ermittelt werden können)
*/
int is_prime(int num);

int main()
{
    int result1 = sum(3, 5);
    int result2 = sum(-4, -6);
    int result3 = sum(0, 0);
    printf("%d\n", result1);
    printf("%d\n", result2);
    printf("%d\n\n", result3);

    float result4 = avg(0, 1, 2, 5);
    int result5 = avg(2, 2, 6, 10);
    int result6 = avg(5, 4, 3, 3);
    printf("%f\n", result4);
    printf("%d\n", result5);
    printf("%d\n\n", result6);

    say_hello();
    print_stars(0);

    int randomNumber = random_num(3, 6);
    printf("%d", randomNumber);
}

int sum(int num1, int num2)
{
    return num1 + num2;
}

float avg(int a, int b, int c, int d)
{
    float result = (a + b + c + d) / 4;

    return result;
}

void say_hello()
{
    printf("Hello!\n\n");
}

void print_stars(int count)
{
    for (int i = 0; i < count; i++)
    {
        printf("*");
    }
}

int random_num(int min, int max)
{
    min = 0;
    max = 10;

    srand(time(0));
    int randomN = (rand() % max) + min;

    return randomN;
}

int is_even(int num)
{

}