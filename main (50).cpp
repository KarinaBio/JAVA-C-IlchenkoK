#include <iostream>
using namespace std;

void Enter_arr(int n, int arr[]){
	for (int i = 0; i < n; i++){
		cin >> arr[i];
	}
}


void Print_arr(int n, const int arr[]){
	for (int i = 0; i < n; i++){
		cout << arr[i] << "  ";
	}
}

bool sum_of_digits_div_by_7(int x){
    int sum = 0;
    while (x != 0){
        sum += x%10;
        x = x/10;
    }
    if (sum % 7 == 0){
        return true;
    } else {
        return false;
    }
}

int check_array(int n, const int arr[]){
    int ans = 0;
    for (int i = 0; i < n; i++){
		if (sum_of_digits_div_by_7(arr[i])) {
		    ans += 1;
		}
	}
	return ans;
}



int main(){
    int size;
    cin >> size;
	int arr1[size];
 	Enter_arr(size, arr1);
 	cout << check_array(size, arr1);
 	
 	
 	
}