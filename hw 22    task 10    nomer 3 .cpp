#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

int main()
{
	int n;
	cout << "enter n:  ";
	cin >> n;
	fstream f1;

	f1.open("txt2.txt");

	int data;
	vector<int> lst_num;
	
	if (f1)
	{
		while (!(f1 >> data).eof())
		{
			if (f1.bad())
			{
				cerr << "Wrong reading" << endl;
				return 2;
			}
			cout << lst_num.size() << "; ";
			lst_num.push_back((int)data);
			
		}
	}
	f1.close();


	fstream f2;
	f2.open("txt3.txt", ios::out);
	
	cout << lst_num.size()<< endl;

	if (lst_num.size() % n == 0) {
		int i = 0;
		while (i < lst_num.size()) {

			int max = -100000;
			for (int j = 0; j < n; j++)
			{
				if (lst_num[i] > max) {
					max = lst_num[i];
				}
				i++;
			}
			f2 << max << " ";
		}
	}
	else {
		int i = 0;
		while (i < (lst_num.size() - lst_num.size()%n)) {

			int max = -100000;
			for (int j = 0; j < n; j++)
			{
				if (lst_num[i] > max) {
					max = lst_num[i];
				}
				i++;
			}
			f2 << max << " ";
		}
		while (i < lst_num.size()){

			int max = -100000;
			for (int j = 0; j < lst_num.size() % n; j++)
			{
				if (lst_num[i] > max) {
					max = lst_num[i];
				}
				i++;
			}
			f2 << max << " ";
		}

	}

	f2.close();
}

