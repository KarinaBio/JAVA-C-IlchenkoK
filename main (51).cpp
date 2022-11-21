#include <iostream>
using namespace std;

void Enter_arr(int n, int arr[]){
	for (int i = 0; i < n; i++){
	    int elem;
		cin >> elem;
		arr[i] = elem * (i+1);
	}
}


void Print_arr(int n, const int arr[]){
	for (int i = 0; i < n; i++){
		cout << arr[i] << "  ";
	}
}

int Min_array(int n, const int arr[]){
    int min = arr[0];
    for (int i = 1; i < n; i++){
		if (arr[i]<min) {
		    min = arr[i];
		}
	}
	return min;
}



int main(){
    int size;
    cin >> size;
	int arr1[size];
 	Enter_arr(size, arr1);
 	Print_arr(size, arr1);
 	cout << Min_array(size, arr1);
}



