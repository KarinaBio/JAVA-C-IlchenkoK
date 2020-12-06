#include <stdio.h>


int main() {
    //x+by+c=0; ax+y+c=0; ab!=1
    float a, b, c, x, y;
    scanf("%f", &a);
    scanf("%f", &b);
    scanf("%f", &c);
    y = a*c/(1-a*b);
    x = -b*y-c;
    printf("%s%f", "x = ", x, "\n");
    printf("%s%f", "y = ", y);
    return 0;
}
