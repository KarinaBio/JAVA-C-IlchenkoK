//1.2.33.a 
/*Скласти  програми обчислення:
а) номера найбільшого числа Фібоначчі, яке не перевищує задане число a;
*/

#include <iostream>

using namespace std;

int fib_num(int a) {
    int fib_1 = 1, fib_2 = 1, n = 2;
    int ans = 2;
    while (ans <= a) {
        fib_1 = fib_2;
        fib_2 = ans;
        ans = fib_1 + fib_2;
        n += 1;
    } return n;
}

int main()
{
    cout<<fib_num(5);
}
