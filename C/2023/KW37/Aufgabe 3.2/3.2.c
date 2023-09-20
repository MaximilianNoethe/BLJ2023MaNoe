#include <stdio.h>
int main()
{

    char c1 = 80;
    char c2 = 120;
    short s = 324;
    int i = 3200;
    long l = 328932;
    float f = 5.67;
    double d = 2.71;

    printf("Speicherbedarf char: %d Byte (s) \n", sizeof(char));
    printf("Speicherbedarf short: %d Byte (s) \n", sizeof(short));
    printf("Speicherbedarf int: %d Byte (s) \n", sizeof(int));
    printf("Speicherbedarf long: %d Byte (s) \n", sizeof(long));
    printf("Speicherbedarf float: %d Byte (s) \n", sizeof(float));
    printf("Speicherbedarf double: %d Byte (s) \n", sizeof(double));

    printf("Speicherbedarf char: %d\n", c1);
    printf("Speicherbedarf short: %d\n", s);
    printf("Speicherbedarf int: %d\n", i);
    printf("Speicherbedarf long: %d\n", l);
    printf("Speicherbedarf float: %f\n", f);
    printf("Speicherbedarf double: %lf\n", d);

    printf("WERTE DER VARIABLEN\n");
    printf("------------------------------------------------------------------\n");
    printf("Variable\tZeichen\t\tdez\t\thex\t\tokt\n");
    printf("------------------------------------------------------------------\n");

    printf("c [char]\t'%c'\t\t%d\t\t%x\t\t%o\n", c1, c1, c1, c1);
    printf("c [char]\t'%c'\t\t%d\t\t%x\t\t%o\n", c2, c2, c2, c2);
    printf("s [short]\t\t\t%d\t\t%x\t\t%o\n", s, s, s, s);
    printf("i [int]\t\t\t\t%d\t\t%x\t\t%o\n", i, i, i, i);
    printf("l [long]\t\t\t%d\t\t%x\t\t%o\n", l, l ,l ,l);
    printf("f [float]\t\t\t%f\t%x\t%o\n", f, f, f, f);
    printf("d [double]\t\t\t%lf\t%x\t%o\n", d, d ,d ,d );
}
