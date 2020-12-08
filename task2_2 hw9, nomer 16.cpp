#include<iostream>
#include<cmath>

using namespace std;

double **Reserve_array(int n) {
	double **mas = new double *[n];
	for (int i = 0; i < n; i++){
		mas[i] = new double[n];}
	return mas;
}

void Enter_array(double **mas, int size){
	for (int i = 0; i < size; i++){
		for (int j = 0; j < size; j++)
		{
			cin >> mas[i][j];
		}}

}

void Print_array(double **mas, int size) {
	for (int i = 0; i < size; i++) { 
		for (int j = 0; j < size; j++)
			cout << " " << mas[i][j];
		cout << '\n';
	}
}

double Find_max(double **mas, int size){
    double max = mas[0][0];
    for (int i = 0; i < size; i++) { 
		for (int j = 0; j < size; j++){
			if (abs(mas[i][j]) > abs(max)) {
			    max = mas[i][j];
			}}}
	return max;
}

int main() {
	int n;
	cout << " n:  ";
	cin >> n;
	double **mas = Reserve_array(n);
	Enter_array(mas, n);
	Print_array(mas, n);
	cout << Find_max(mas, n);
}
