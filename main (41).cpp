//1.1.17

/*Точка простору задана декартовими координатами (x, y, z).
Перевірити, чи належить вона кулі з радіусом R i центром у початку координат. 
*/

#include <iostream>
#include <cmath>

using namespace std;

int main()
{ 
    double x, y, z, R;
    std::cout << "x y z - ?" << std::endl;
    cin >> x >> y >> z;
    cout << "R - ?" << "\n";
    cin >> R;
    double d = pow(x*x + y*y + z*z, 0.5);
    if (d <= R) {
        cout << "Yes";
    } else cout << "No";
}
