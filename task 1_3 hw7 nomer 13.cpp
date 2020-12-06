#include <iostream>
using namespace std;

// інвертувати число, вивести у бінарному представленні

unsigned int invert_num (unsigned int a) {
    return ~a;
}

void bin(unsigned n) 
{ 
    unsigned i; 
    for (i = 1 << 31; i > 0; i = i / 2) {
        if (n & i){
            cout << "1";
        } else{
            cout << "0"; }}
} 

int main() 
{ 
    unsigned int a, b;
    std::cin >> a;
    b = invert_num(a);
    cout << dec << a << " to " << b << endl;
    bin(a);
    cout << " to ";
    bin(b);
}