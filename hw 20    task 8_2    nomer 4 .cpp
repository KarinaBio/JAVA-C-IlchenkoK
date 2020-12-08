#include<iostream>
#include<vector>

using namespace std;

class Polynom
{
	vector<double> polynom;
	int degree;

public:

	Polynom(){}

	Polynom(vector<double> polynom)
	{
		this->polynom = polynom;
		degree = polynom.size();
	}

	void Input()
	{
		int deg = 0;
		cout << "Enter deg = ";
		cin >> degree;
		degree += 1;
		double x;
		while (deg < degree)
		{
			cout << "Enter coef with " << deg++ << " degree: ";
			cin >> x;
			polynom.push_back(x);
		}
	}

	void Print() {
		cout << "degree: " << degree << endl;
		cout << "polynom: ";
		int deg = 0;
		while (deg < degree)
		{
			cout << polynom[deg] << "*x^" << deg;
			if (!(deg == degree - 1)) {
				cout << " + ";
			}
			deg++;
		}
	}

	double ValueX0(double x0) {
		double ans = 0.0;
		for (int i = 0; i < degree; i++) {
			ans += polynom[i] * pow(x0, i);
		}
		return ans;
	}

	Polynom Deriv() {
		vector<double> ans;
		int i = 1;
		double x;
		while (i < degree)
		{
			x = polynom[i] * i;
			cout << x << endl;
			ans.push_back(x);
			i++;
		}
		Polynom p(ans);
		return p;
	}

	Polynom operator+(Polynom &x)
	{
		vector<double> ans;
		int i = 0;
		double k;
		while (i < degree)
		{
			k = polynom[i] + x.polynom[i];
			ans.push_back(k);
			i++;
		}
		Polynom p(ans);
		return p;
	}

	Polynom operator-(Polynom& x)
	{
		vector<double> ans;
		int i = 0;
		double k;
		while (i < degree)
		{
			k = polynom[i] - x.polynom[i];
			ans.push_back(k);
			i++;
		}
		Polynom p(ans);
		return p;
	}

	Polynom operator*(double x)
	{
		vector<double> ans;
		int i = 0;
		double k;
		while (i < degree)
		{
			k = polynom[i] * x;
			ans.push_back(k);
			i++;
		}
		Polynom p(ans);
		return p;
	}

};


int main() {
	Polynom p;
	p.Input();
	Polynom k;
	k.Input();
	cout << endl;
	p.Print();
	cout << endl;
	double x = 1.2;
	cout << p.ValueX0(x) << endl;
	Polynom d = p.Deriv();
	d.Print();
	cout << endl;
	cout << endl;
	Polynom sum = p + k;
	sum.Print();
	cout << endl;
	Polynom sub = p*2.0 - k;
	sub.Print();
	cout << endl;
}