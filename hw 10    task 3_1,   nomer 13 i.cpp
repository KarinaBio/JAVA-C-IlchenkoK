#include<iostream>

using namespace std;

double **reserve_array(int r, int col) {
	double **mas = new double *[r];
	for (int i = 0; i < r; i++)
		mas[i] = new double[col];
	return mas;
}

void free_array(double **mas, int r) {
	for (int i = 0; i < r; i++)
		delete[]mas[i];
	delete[]mas;
}

void enter_array(double **mas, int row, int col)
{
	for (int i = 0; i < row; i++)
		for (int j = 0; j < col; j++)
		{
			mas[i][j] = i + j;
		}
}

void print_array(double **mas, int row, int col)
{
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
			cout << "  " << mas[i][j];
		cout << endl;
	}
}

double **add_k_rows(double **mas, int row, int col, int k)
{

	double **ans_array = reserve_array(row + k, col);
	for (int i = 0; i < k; i++)
	{
		for (int j = 0; j < col; j++)
		{
			ans_array[i][j] = k;
		}
	}
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
		{
			ans_array[k+i][j] = mas[i][j];
		}
	}
	free_array(mas, row);
	return ans_array;
}

int main()
{
	size_t row, col, k;
	cout << " row #:  ";
	cin >> row;
	cout << " column #:  ";
	cin >> col;
	cout << " k:  ";
	cin >> k;
	double **mas = reserve_array(row, col);
	enter_array(mas, row, col);  // mas[i][i] = i + j
	print_array(mas, row, col);
	
	mas = add_k_rows(mas, row, col, k);
	cout << "\nresult:\n\n";
	print_array(mas, row+k, col);
	free_array(mas, row+k);
}