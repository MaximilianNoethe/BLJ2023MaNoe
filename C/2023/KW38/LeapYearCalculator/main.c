#include <stdio.h>

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
int isLeapYear(int year)
{
    if (year % 4 == 0)
    {
        leapYear = 1;
    }
    else if (year % 4 == 1)
    {
        leapYear = 0;
    }
    // todo first
    // returns 1 if isLeapYear
    // returns 0 if is no LeapYear
}

int daysInMonth(int month, int year)
{

    // to do second
    // returns 30, 31, 28 or 29
}

void printDateInfo(int month, int year)
{

    int days = daysInMonth(month, year);
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && month != 2)
    {
        days = 31;
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11 && month != 2)
    {
        days = 30;
    }
    else if (month == 2)
    {
        if (year % 4 == 0)
        {
            days = 29;
        }
        else
        {
            days = 28;
        }
    }

    if (month > 12 || month < 1)
    {
        printf("Bitte gebe nächstes Mal einen gültigen Monat ein\n");

        return 0;
    }

    printf("Der Monat %d hat im Jahr %d %d Tage. \n", month, year, days);

    printf("Das Jahr %d ist ", year);
    if (year % 4 == 0)
    {
        printf("ein ");
    }
    else
    {
        printf("kein ");
    }
    printf("Schaltjahr. \n");
}