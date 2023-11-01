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
void printPerson(TPerson person)
{
    printf("Firstname: %s\n", person.firstname);
    printf("Lastname: %s\n", person.lastname);
    printf("Birthday: %d\n", person.birthday);
    printf("Weight: %dkg\n", person.weight);
    printf("Height: %dcm\n", person.height);
}
void initFamily()
{
    TPerson person1;
    strncpy(person1.firstname, "John", sizeof(person1.firstname)) - 1;
    strncpy(person1.lastname, "Doe", sizeof(person1.lastname)) - 1;
    person1.birthday = 1981;
    person1.weight = 91;
    person1.height = 196;

    TPerson person2;
    strncpy(person2.firstname, "jane", sizeof(person2.firstname)) - 1;
    strncpy(person2.lastname, "Doe", sizeof(person2.lastname)) - 1;
    person2.birthday = 1980;
    person2.weight = 64;
    person2.height = 178;

    TPerson person3;
    strncpy(person3.firstname, "Jack", sizeof(person2.firstname)) - 1;
    strncpy(person3.lastname, "Doe", sizeof(person2.lastname)) - 1;
    person3.birthday = 2008;
    person3.weight = 40;
    person3.height = 163;

    TPerson person4;
    strncpy(person4.firstname, "Judy", sizeof(person4.firstname)) - 1;
    strncpy(person4.lastname, "Doe", sizeof(person4.lastname)) - 1;
    person4.birthday = 2015;
    person4.weight = 30;
    person4.height = 124;

    family[0] = person1;
    family[1] = person2;
    family[2] = person3;
    family[3] = person4;
}

void printFamily()
{
    for (int i = 0; i < NUMBER_OF_FAMILY_MEMBERS; i++)
    {
        printf("Family Member %d:\n", i + 1);
        printPerson;
    }
}

/* ---------------------------------------------------------------------------
    main
   ---------------------------------------------------------------------------

    Description of function
*/

int main()
{
    initFamily();
    printFamily();
    return 0;
}
