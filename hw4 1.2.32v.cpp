//1.2.32.v
/*Скласти  програми для обчислення добутків:
{P} rsub {n} = prod from {i=1} to {n} {{1} over {(i+1)!} } ;
*/

#include <iostream>

using namespace std;

int factorial (int m) {
    if (m == 0) {
        return 1;
    } else {
        return factorial(m-1)*m;
    }
}

double func(int n) {
    if (n == 0) {
        return 1;
    } else {
        cout << n <<"\n";
        return (func(n-1) / factorial(n+1));
    }
}

int main()
{
    int n;
    cout<<"n - ?" << "\n";
    cin >> n;
    cout << func(n);
}
