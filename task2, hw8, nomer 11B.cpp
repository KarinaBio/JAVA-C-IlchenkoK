#include <iostream>
using namespace std;

void Enter_arr(int n, int arr[]){
    int elem;
    cin >> elem;
	arr[0] = elem;
	for (int i = 1; i < n; i++){
		cin >> elem;
		arr[i] = elem * arr[i-1];
	}
}


void Print_arr(int n, const int arr[]){
	for (int i = 0; i < n; i++){
		cout << arr[i] << "  ";
	}
}

int Max_array(int n, const int arr[]){
    int max = arr[0];
    for (int i = 1; i < n; i++){
		if (arr[i] > max) {
		    max = arr[i];
		}
	}
	return max;
}



int main(){
    int size;
    cin >> size;
	int arr1[size];
 	Enter_arr(size, arr1);
 	Print_arr(size, arr1);
 	cout << Max_array(size, arr1);
}



