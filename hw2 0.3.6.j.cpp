//0.3.6ж

#include <iostream>
#include <cmath>

using namespace std;

double sigmoid(double x) {
    return pow(1 + pow(M_E, -x), -1);
}

double sigmoid_derivative(double x){
    return  -pow(M_E, -x) * pow(1 + pow(M_E, -x), -2);
}

int main()
{
    
    double x;
    cin >> x;
    cout << "sigmoid: " << sigmoid(x) << "\n";
    cout << "sigmoid_derivative: " << sigmoid_derivative(x);
}
