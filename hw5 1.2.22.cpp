//1.2.22
/*Скласти  програму визначення кількості тризначних натуральних чисел, 
сума цифр яких дорівнює n Операцію ділення не використовувати.
*/

#include <iostream>

using namespace std;

int count_numbers(int n) {
    int ans = 0;
    for (int i=1; i<=9; i++) {
        for (int j=0; j<=9; j++) {
            for (int k=0; k<=9; k++) {
                if (i+j+k == n) {
                    ans += 1;
                }
            }
        }
    } return ans;
}

int main()
{
    int n;
    cout<<"n - ?" << "\n";
    cin >> n;
    std::cout << count_numbers(n) << std::endl;
}
