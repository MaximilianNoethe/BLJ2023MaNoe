#include <stdio.h>

int main() {
  char policeName[] = "Stadtpolizei ZH";
  char policeAddress[] = "Bahnhofquai 3";
  int policePhone = 117;

  char pizzaName[] = "dieci Pizza Kurier";
  char pizzaAddress[] = "Hohlstrasse 204";
  char pizzaPhone[] = "0442422070";

  printf("Wichtige Kontaktdaten:\n----------------------\n");
  printf("%s\n%s\n%d\n\n", policeName, policeAddress, policePhone);
  printf("%s\n%s\n%s\n\n", pizzaName, pizzaAddress, pizzaPhone);

  return 0;
}
