#include<iostream>
#include<math.h>

using namespace std;

int** MakeMatrix(int n) {
    int** matrix = new int* [n];
    for (int i = 0; i < n; i++)
        matrix[i] = new int[n];
    return matrix;
}

void EnterMatrix(int** matrix, int n) {
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            cin >> matrix[i][j];
}

int Determinant(int** matrix, int n) {
    int det = 0;
    int** submatrix = MakeMatrix(n);
    if (n == 2)
        return ((matrix[0][0] * matrix[1][1]) - (matrix[1][0] * matrix[0][1]));
    else {
        for (int x = 0; x < n; x++) {
            int iii = 0;
            for (int i = 1; i < n; i++) {
                int jjj = 0;
                for (int j = 0; j < n; j++) {
                    if (j == x)
                        continue;
                    submatrix[iii][jjj] = matrix[i][j];
                    jjj++;
                }
                iii++;
            }
            det = det + (pow(-1, x) * matrix[0][x] * Determinant(submatrix, n - 1));
        }
    }
    return det;
}

int main() {
    int n, i, j;
    cout << "Enter size of matrix:\n";
    cin >> n;

    int** matrix = MakeMatrix(n);
    EnterMatrix(matrix, n);
 
    cout << "Determinant is " << Determinant(matrix, n);
}
