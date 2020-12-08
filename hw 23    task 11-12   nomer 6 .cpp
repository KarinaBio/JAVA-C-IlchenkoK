// orange grapefruit mandarin lime banana mangoe mandarin lime banana mangoe banana mangoe 

#include <iostream>
#include <fstream>
#include <string>
#include <map>

using namespace std;

int main()
{
	string data;
	map<string, int> counter;

	fstream f1;
	f1.open("txt1.txt");
	
	
	if (f1)
	{
		while (!(f1 >> data).eof())
		{
			if (f1.bad())
			{
				cerr << "Wrong reading" << endl;
				return 2;
			}
			cout << data << "; ";

			if (counter.find(data) == counter.end()) {
				counter[data] = 1;
			}
			else {
				counter[data] += 1;
			}
		}
	}
	f1.close();
	cout << "\n\nresult:  \n\n";
	for (auto item : counter) {
		cout << item.first << " : " << item.second << endl << endl ;
	}
}