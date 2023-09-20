#include <stdio.h>

int main() {
  int inMillis = 0;

  printf("Strecke in Millimeter: ");
  scanf("%d", &inMillis);

  float outCentis = inMillis / 10.0;
  float outMeters = inMillis / 1000.0;

  printf("%dmm = %fcm = %fm", inMillis, outCentis, outMeters);

  return 0;
}
