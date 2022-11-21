//1.2.20.b
/*Задане натуральне число n. Скласти програми обчислення добутків
left (1+ {1} over {{1} ^ {2} }  right ) left (1+ {1} over {{2} ^ {2} }  right )
… left (1+ {1} over {{n} ^ {2} }  right )
*/

#include <iostream>

using namespace std;

double func(int n) {
    if (n <= 2) {
        cout << "impossible input";
        return 0;
    } else {
         double p = 1;
         for (int i = 2; i < n+1; i++) {
             p *= 1 - 1.0/(i*i);
         }
         return p;
    }
}

int main()
{
    double n;
    cout<<"n - ?" << "\n";
    std::cin >> n;
    cout << func(n);
}
