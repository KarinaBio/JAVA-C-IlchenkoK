//1.1.19.г

/*Реалізуйте функції 
та напишить відповідні власні функцію, що буде рахувати похідні даних функцій:
г) eLu(a,x)  = a({e} ^ {x} -1), x<0 # x , x≥0 
*/

#include <iostream>
#include <cmath>

using namespace std;

double eLu(double a, double x) {
    if (x<0){
        return a*(pow(M_E, x)-1);
    } else return x;
}

double eLu_derivative(double a, double x) {
    if (x<0) {
        return eLu(a,x) + a;
    } else return 1;
} 

int main() { 
    double a, x;
    std::cout << "a x - ?" << std::endl;
    cin >> a >> x;
    cout << "eLu: " << eLu(a,x) << "\n";
    cout << "eLu_derivative: " << eLu_derivative(a,x);
}
