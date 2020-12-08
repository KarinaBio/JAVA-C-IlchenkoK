
#include <iostream>
#include <fstream>
#include<string>
#include <map>
using namespace std;


class Person
{
public:
	string name;
	unsigned year;

	void input() {
		cout << "Name:" << endl;
		cin >> name;
		cout << "Year: " << endl;
		cin >> year;
	}

	void print() {
		cout << name << "," << year << endl;
	}
};

class Familiar : public Person
{
public:
	string phone_number;

	void input_familiar() {
		Person::input();
		cout << "Phone number: " << endl;
		cin >> phone_number;
	}

	void print() {
		Person::print();
		cout << phone_number << endl;
	}
};

map<string, string> CreateDct(int n) {
	map<string, string> dictionary;
	for (int i = 0; i < n; i++) {
		Familiar f;
		f.input_familiar();
		dictionary[f.name] = f.phone_number;
	}
	return dictionary;
}

void AddMember(map<string, string>& dct, string name_, string phone_num) 
{
	dct[name_] = phone_num;

}

void ChangeNumber(map<string, string>& dct, string name_, string phone_num)
{
	dct[name_] = phone_num;
}

string FindByNumber(const map<string, string>& dct, string phone_num)
{
	for (auto item: dct) 
	{
		if (item.second == phone_num) {
			return item.first;
		}
		else return "not found";
	}
}

string FindByName(const map<string, string>& dct, string name_)
{
	for (auto item : dct)
	{
		if (item.first == name_) {
			return item.second;
		}
		else return "not found";
	}
}

int main() {

	int n;
	cout << "number of members: ";
	cin >> n;
	map<string, string> dct1 = CreateDct(n);
	AddMember(dct1, "aaa", "111");

	cout << endl << FindByName(dct1, "aaa") << endl;
	ChangeNumber(dct1, "aaa", "222");
	cout << FindByNumber(dct1, "222") << endl;
	cout << FindByNumber(dct1, "....") << endl;

}