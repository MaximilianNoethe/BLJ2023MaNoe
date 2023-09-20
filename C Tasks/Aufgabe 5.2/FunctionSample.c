#include <stdio.h>
#include <stdlib.h>

int sum(int a, int b);
int subtract(int a, int b);
int multpily(int a, int b);
float divide(float a, float b);

// FUnktions Körper
int main()
{

    int num1 = 5;
    int num2 = 20;

    int num3 = sum(3, 44);

    int result = divide(5.0, 4);

    printf("%d", num3);

    // TODO: ergebis weiterverarbeiten

    printf("\n\n");
    system("pause");
    return 0;
}

/*Function head/ Funktions Kopf --->*/int /*Rückgabetyp/ returntype*/ sum/*Funktionsname/ function name*/(int a, int b) /*Parameter/ Parameterliste -> Je nach Anforderungen muss nicht ein Parameter enthalten sein*/
{
    return a + b;
}

int subtract(int a, int b)
{
    return a - b;
}

int multpily(int a, int b)
{
    return a * b;
}

float divide(float a, float b)
{
    return a / b;
}

/*
    if (b == 0)
    {
        // teilen durch 0 nicht möglich..
    } else{

    }*/
