/*
 *  name of file
 *
 *
 *  Author  : M.Noethe, Accenture AG
 *
 *  Date    : 01.11.2023
 *
 *  Version : 1.0
 *
 *  Purpose : what it does
 *
 *
 *  History : 01.11.2023
 *
 *
 */

/*==========================================================================*\
:  D E F I N E S                                          (for preprocessor)
\*==========================================================================*/
#define NUMBER_OF_FAMILY_MEMBERS 4
/*==========================================================================*\
:  I N C L U D E S
\*==========================================================================*/
#include <stdio.h>
#include <string.h>
#include "Person.h"

/*==========================================================================*\
:  G L O B A L    V A R I A B L E S                             (definition)
\*==========================================================================*/
TPerson family[NUMBER_OF_FAMILY_MEMBERS];

/*==========================================================================*\
:  L O C A L    V A R I A B L E S                               (definition)
\*==========================================================================*/

/*==========================================================================*\
:  L O C A L    F U N C T I O N    P R O T O T Y P E S         (declaration)
\*==========================================================================*/

/*==========================================================================*\
:  F U N C T I O N    I M P L E M E M T A T I O N
\*==========================================================================*/
TPerson findOldestFamilyMember()
{
    TPerson oldest = family[1]; // Assume the first person is the oldest

    for (int i = 1; i < NUMBER_OF_FAMILY_MEMBERS; i++)
    {
        if (family[i].birthyear < oldest.birthyear)
        {
            oldest = family[i];
        }
    }

    return oldest;
}

void printPerson(int index)
{
    printf("Firstname: %s\n", family[index].firstname);
    printf("Lastname: %s\n", family[index].lastname);
    printf("birthyear: %d\n", family[index].birthyear);
    printf("Weight: %dkg\n", family[index].weight);
    printf("Height: %dcm\n", family[index].height);
    printf("Club: %s\n", family[index].myClub.club);
    printf("Topic: %s\n", family[index].myClub.topic);
}
void initFamily()
{
    TPerson person1;
    TClub club1;
    strncpy(person1.firstname, "John", sizeof(person1.firstname)) - 1;
    strncpy(person1.lastname, "Doe", sizeof(person1.lastname)) - 1;
    person1.birthyear = 1981;
    person1.weight = 91;
    person1.height = 196;
    strncpy(club1.club, "Zug 94", sizeof(club1.club)) - 1;
    strncpy(club1.topic, "Football", sizeof(club1.topic)) - 1;
    person1.myClub = club1;

    TPerson person2;
    strncpy(person2.firstname, "jane", sizeof(person2.firstname)) - 1;
    strncpy(person2.lastname, "Doe", sizeof(person2.lastname)) - 1;
    person2.birthyear = 1980;
    person2.weight = 64;
    person2.height = 178;
    strncpy(club1.club, "Zug 94", sizeof(club1.club)) - 1;
    strncpy(club1.topic, "Football", sizeof(club1.topic)) - 1;
    person2.myClub = club1;

    TPerson person3;
    strncpy(person3.firstname, "Jack", sizeof(person3.firstname)) - 1;
    strncpy(person3.lastname, "Doe", sizeof(person3.lastname)) - 1;
    person3.birthyear = 2008;
    person3.weight = 40;
    person3.height = 163;
    strncpy(club1.club, "Zug 94", sizeof(club1.club)) - 1;
    strncpy(club1.topic, "Football", sizeof(club1.topic)) - 1;
    person3.myClub = club1;

    TPerson person4;
    strncpy(person4.firstname, "Judy", sizeof(person4.firstname)) - 1;
    strncpy(person4.lastname, "Doe", sizeof(person4.lastname)) - 1;
    person4.birthyear = 2015;
    person4.weight = 30;
    person4.height = 124;
    strncpy(club1.club, "Zug 94", sizeof(club1.club)) - 1;
    strncpy(club1.topic, "Football", sizeof(club1.topic)) - 1;
    person4.myClub = club1;

    family[0] = person1;
    family[1] = person2;
    family[2] = person3;
    family[3] = person4;
}
§
void printFamily()
{
    for (int i = 0; i < NUMBER_OF_FAMILY_MEMBERS; i++)
    {
        printf("Family Member %d\n----------------\n", i + 1);
        printPerson(i);
        printf("\n\n");
    }
}

/* ---------------------------------------------------------------------------
    main
   ---------------------------------------------------------------------------

    Description of function
*/

int main()
{
    int index;

    initFamily();  // Prints family member
    printFamily(); // Prints family values

    TPerson oldestPerson = findOldestFamilyMember();

    printf("\nOldest Family Member:\n----------------\n");
    printPerson(oldestPerson);

    printf("Choose a person(0-3) to display:");
    scanf("%i", &index);
    printPerson(index);

    return 0;
}
