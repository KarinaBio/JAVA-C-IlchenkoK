#include <iostream>
#include <vector>
#include <string>
#include <map>
#include <set>

using namespace std;

int main() {
    int n;
    set<string> ss;
    cin >> n; 
    for (int i = 0; i < n; ++i) {
        string s;
        cin >> s;
        ss.insert(s);
    }
    cout << ss.size();
    return 0;
}