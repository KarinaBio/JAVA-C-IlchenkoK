#include<iostream>

using namespace std;

double **reserve_array(int r) {
	double **mas = new double *[r];
	for (int i = 0; i < r; i++)
		mas[i] = new double[r];
	return mas;
}
void free_array(double **mas, int r) {
	for (int i = 0; i < r; i++)
		delete[]mas[i];
	delete[]mas;
}
void enter_array(double **mas, int row)
{
	for (int i = 0; i < row; i++)
		for (int j = 0; j < row; j++)
		{
			mas[i][j] = i + j;
		}
}
void print_array(double **mas, int row)
{
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < row; j++)
			cout << "\t" << mas[i][j];
		cout << endl;
	}
}

double **multiply_matrix(double **mas_1, double **mas_2, int row)
{
	double **mas_3 = reserve_array(row);
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < row; j++)
		{
			mas_3[i][j] = 0;
			for (int k = 0; k < row; k++)
			{
				mas_3[i][j] += mas_1[i][k] * mas_2[k][j];
			}
		}
	}
	return mas_3;
}

double **multiply_matrix_mas(int n, int row)
{
	double ***mas = new double**[n];
	for (int i = 0; i < n; i++)
	{
		mas[i] = reserve_array(row);
		enter_array(mas[i], row);
	}
	double **ans = reserve_array(row);
	ans = mas[0];
	for (int i = 1; i < n; i++)
	{
		ans = multiply_matrix(ans, mas[i], row);
	}
	for (int i = 0; i < n; i++)
	{
		free_array(mas[i], row);
	}
	delete[]mas;
	return ans;
}

int main()
{
	size_t size;
	cout << " size = ";
	cin >> size;
	int n;
	cout << " number of matrixes = ";
	cin >> n;
	double **mas = reserve_array(size);
	mas = multiply_matrix_mas(n, size);
	print_array(mas, size);
	free_array(mas, size);
}
