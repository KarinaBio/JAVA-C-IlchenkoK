#include <stdio.h>


int main()
{
    float a;
    scanf("%f", &a);
    printf("%5.5f%s%5.5f", a, "----------", a);
    printf("\n\n");
    printf("%s%5.5f%s", "|        ", a, "        |");
    printf("\n\n");
    printf("%5.5f%s%5.5f", a, "----------", a);

    return 0;
}
