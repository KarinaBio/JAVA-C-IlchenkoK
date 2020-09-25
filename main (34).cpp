
#include <stdio.h>

using namespace std;

double max3(double x, double y, double z) {
    double ans;
    if (x>y) {
        ans = x;
    } else { ans = y;}
    if (z>ans) {
        ans = z;}
    return ans;
    
}

int main()
{
    double x,y,z;
    scanf("%lf", &x);
    scanf("%lf", &y);
    scanf("%lf", &z);
    double a = max3(x,y,z);
    printf("%lf", a);

    return 0;
}
