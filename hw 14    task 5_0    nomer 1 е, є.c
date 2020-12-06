#include <stdio.h>
#include<string.h>

//1.e
typedef
struct Field {
    char row;
    int column;
};

//1.є
typedef
struct Circle{
    double radius;
    double center_point[2];
};


int main()
{
    struct Field f1 = {'a', 8};
    struct Circle c1 = {3, {2,2}};
    printf("field row:  ");
    printf("%c", f1.row);
    printf("\n");
    printf("field column:  ");
    printf("%d", f1.column);
    printf("\n");
    printf("circle center x:  ");
    printf("%lf", c1.center_point[1]);
    printf("\n");
    printf("circle radius:  ");
    printf("%lf", c1.radius);
    
}






