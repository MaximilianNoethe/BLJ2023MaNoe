#include <stdio.h>

typedef struct abc
{
    int x;
    int y;
};

int main()
{
    struct abc a = {0, 1};
    struct abc *ptr = &a;

    printf("%d %d", ptr->x, ptr->y); // ptr->x ist gleichwertig zu (*ptr).x und dies ist gleichwertig zu a.x was im Endeffekt 0 ist.
    return 0;
}
