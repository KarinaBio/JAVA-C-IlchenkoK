//0.2.10


#include <iostream>
#include <cmath>
//pi = M_PI

using namespace std;

int main()
{
    double r, h;
    cin >> r >> h;
    double V = r*r*h*M_PI/3;
    cout << V;
}
