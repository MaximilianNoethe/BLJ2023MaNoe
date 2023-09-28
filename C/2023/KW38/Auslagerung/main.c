#include <stdio.h>
#include "LeapYearFunctions.h" 

int isLeapYear(int year);
int daysInMonth(int month, int year);
int days;
int leapYear;
int month;
int year;
void printDateInfo(int month, int year);

int main()
{
    int month;
    int year;
    printf("Gebe ein beliebiges Jahr ein:\n");
    scanf("%d", &year);
    printf("Gebe einen Monat ein:\n");
    scanf("%d", &month);
    // todo get user input for month and year
    // todo third

    printDateInfo(month, year);

    return 0;
}
