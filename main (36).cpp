#include <stdio.h>

int check_ans(double a, double b, double c) {
    double D = b*b - 4*a*c;
    if (D<0){
        return 0;
    } else if (D=0) {
        return 1;
    } else {
        return 2;
    }
}

int main()
{
    double a,b,c;
    scanf("%lf", &a);
    scanf("%lf", &b);
    scanf("%lf", &c);
    int ans_n = check_ans(a, b, c);
    printf("%d", ans_n);
}
