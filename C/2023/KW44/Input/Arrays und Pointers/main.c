#include <stdio.h>

int main()
{
    int a[100000] = {2,
               33,
               97};

    for (int i = 0; i < 3; i++)
    {
        printf("%p\n", &a[i]);
    }

    printf("\n%p\n", a); // Name vom Array -> Pointer zum Wert vom ersten Element

    return 0;
}
