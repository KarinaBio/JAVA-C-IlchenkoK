#include<iostream>
#include<cmath>

using namespace std;

class Triangle
{
	double angle;
	double side1_lenght;
	double side2_lenght;

public:


	Triangle(double angle, double side1_lenght, double side2_lenght)
	{
		this->angle = angle;
		this->side1_lenght = side1_lenght;
		this->side2_lenght = side2_lenght;
	}

	double GetAngle() const
	{
		return angle;
	}

	double GetSide1() const
	{
		return side1_lenght;
	}

	double GetSide2() const
	{
		return side2_lenght;
	}

	double GetSide3() const
	{
		return sqrt(pow(side1_lenght, 2) + pow(side2_lenght, 2) - 2 * side1_lenght * side2_lenght * cos(angle));
	}

	double Perimetr() const
	{
		return side1_lenght + side2_lenght + GetSide3();
	}

	double Square() const
	{
		return (1.0 / 2.0) * (side1_lenght * side2_lenght * cos(angle));
	}

	void Print()
	{
		cout << "angle" << angle << endl;
		cout << "side 1" << side1_lenght << endl;
		cout << "side 2" << side2_lenght << endl;
	}
};


int main()
{ 
	Triangle t1(1.4, 4.4, 5.4);
	cout << t1.GetSide3() << endl;
	cout << t1.Perimetr() << endl;
	cout << t1.Square() << endl;
	
}