#include <stdio.h>

int main() {
  char thema[] = "Thermonukleare Reaktion";
    
  printf("Wortumkehrer\n");
  for (int i = 22; i >= 0; i--) {
    printf("Buchstabe %d: %c\n", i, thema[i]);
  }
  return 0;
}
