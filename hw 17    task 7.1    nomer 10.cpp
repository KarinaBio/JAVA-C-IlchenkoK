#include <iostream>
#include <string>

using namespace std;
int main()
{
	int n, m = 0, p = 0;
	char k = 'k';
	string s = "aaaa bbbbk bk k gggk bb ", s2 = "";
	for (int i = 0; i < s.length(); i++)
	{
		n = s.find(' ');
		if (s[n - 1] == k) {
			s2.append(s, m, n - m);
			s2.append("---");
			//cout << s2;
		}
		s.erase(0, n+1);
		//cout << s << endl;
		if (n == s.length()) break;
	}
	cout << s2 << endl;
	system("pause");
}