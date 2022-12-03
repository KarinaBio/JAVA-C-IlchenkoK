#include <iostream>
#include <cmath>
using namespace std;

// sqrt(1+x)

double math_func(double x, double eps){
    double ans_0 = 1.0, ans = 1+0.5*x;
    int num = 1, din = 2;
    int cnt = 2, cnt_num = 1, cnt_din = 4;
    while ((ans_0 - ans >= eps) || (ans_0 - ans <= -eps)){
        ans_0 = ans;
        ans = ans_0 + pow(-1, cnt+1)*pow(x,cnt)*num*cnt_num/(din*cnt_din);
        cnt += 1;
        num *= cnt_num;
        din *= cnt_din;
        cnt_num += 2;
        cnt_din += 2;
    }
    return ans;
}

int main()
{
    double eps, x, ans;
    cin >> x >> eps;
    ans = math_func(x, eps);
    cout << '\n' << ans;
}
