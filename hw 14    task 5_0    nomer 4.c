#include <stdio.h>
#include<string.h>
#include<math.h>


typedef struct Point {
    double a;  // x or r
    double b;  // y or phi
    char type;  // d or p
}Point;

double side_lenght(Point first, Point second){
    double lenght;
    Point start = first;
    if (start.type == 'p'){
        start.a = start.a * cos(start.b);
        start.b = start.a * sin(start.b);
    }
    Point end = second;
    if (end.type == 'p'){
        end.a = end.a * cos(end.b);
        end.b = end.a * sin(end.b);
    }
    double vec[2];
    vec[0] = end.a - start.a;
    vec[1] = end.b - start.b;
    lenght = sqrt(vec[0] * vec[0] + vec[1] * vec[1]);
    return lenght;
}


double triangle_area(double side_1, double side_2, double side_3){
    double area;
    double p = (side_3 + side_2 + side_1) / 2.0;
    area = sqrt(p * (p - side_1) * (p - side_2) * (p - side_3));
    return area;
}


int main()
{
  Point A = {0, 0, 'd'}; 
  Point B = {0, 1, 'd'}; 
  Point C = {1, 0, 'd'}; 
  double side_1 = side_lenght(A, B);
  printf("%lf", side_1);
  printf("\n");
  double side_2 = side_lenght(C, B);
  printf("%lf", side_2);
  printf("\n");
  double side_3 = side_lenght(A, C);
  printf("%lf", side_3);
  printf("\n");
  double area = triangle_area(side_1, side_2, side_3); 
  printf("area:  ");
  printf("%lf", area);
  printf("\n");
  printf("\n");
  
  
  Point a = {1, 0, 'p'}; 
  Point b = {1, 0.6, 'p'}; 
  Point c = {0, 0, 'p'}; 
  double side_11 = side_lenght(a, b);
  printf("%lf", side_11);
  printf("\n");
  double side_22 = side_lenght(c, b);
  printf("%lf", side_22);
  printf("\n");
  double side_33 = side_lenght(a, c);
  printf("%lf", side_33);
  printf("\n");
  double area_2 = triangle_area(side_11, side_22, side_33); 
  printf("area_2:   ");
  printf("%lf", area_2);
  
}






