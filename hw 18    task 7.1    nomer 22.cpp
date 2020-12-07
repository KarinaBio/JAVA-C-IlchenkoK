#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
	int start = 1;
	int cnt = 0;
	int num = 0;
	fstream f1;
	f1.open("txt1.txt");

	string data;
	string sum_words = "";
	string letters = "qwrtpsdfghjklzxcvbnm";

	if (!f1.bad())
	{
		while (!(f1 >> data).eof())
		{
			if (f1.bad())
			{
				cerr << "Wrong reading" << endl;
				return 2;
			}
			sum_words += data;
			sum_words += '=';
		}
	}
	f1.close();
	cout << sum_words << endl;
	if (sum_words != "") num = 1;
	for (int i = 0; i < sum_words.length()-1; i++) {
		if (sum_words[i] == '=') {
			start = 1;
			num += 1;
		} else if ((letters.find(sum_words[i + 1]) != string::npos) && (letters.find(sum_words[i]) != string::npos)) {

			if (start) {
				start = 0;
				cnt += 1;
			}
		}
	}
	cout << "double:  " << cnt << " words: " << num << endl;
	cout << "with double lett: " << (cnt / double(num)) * 100 << "%";
}