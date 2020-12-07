#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include <cmath>


void write_int_numbers(const char* filename, int n)
{
	int number;
	FILE* f1 = fopen(filename, "wb");
	for (int i = 0; i < n; i++)
	{
		printf("next number:   ");
		scanf("%d", &number);
		fwrite(&number, 1, sizeof(int), f1);
	}
	fclose(f1);
}


int* read_int_numbers(const char* filename, int n)
{
	int *nums = new int[n];
	int number;
	FILE* f1 = fopen(filename, "rb");
	int i = 0;
	while (!feof(f1))
	{		
		int r = fread(&number, 1, sizeof(int), f1);
		if (r < sizeof(int)) break;
		nums[i] = number;
		i++;
	}
	fclose(f1);
	return nums;
}


int num_of_even(const char* filename) {
	int res = 0;
	int number;
	FILE* f1 = fopen(filename, "rb");
	int i = 0;
	while (!feof(f1))
	{
		int r = fread(&number, 1, sizeof(int), f1);
		if (r < sizeof(int)) break;
		if (number % 2 == 0) {
			res += 1;
		}
		i++;
	}
	fclose(f1);
	return res;
}


int num_of_sqrt(const char* filename) {
	int res = 0; 
	int number;
	FILE* f1 = fopen(filename, "rb");
	int i = 0;
	while (!feof(f1))
	{
		int r = fread(&number, 1, sizeof(int), f1);
		if (r < sizeof(int)) break;
		if (((sqrt(number) - (int)sqrt(number)) == 0) && (number % 2 == 1)) {
			res += 1;
		}
		i++;
	}
	fclose(f1);
	return res;
}

int subtr_even_odd(const char* filename) {
	int k=0, j=0, res;
	int number;
	int max_even = 0;
	int min_odd = 1;
	FILE* f1 = fopen(filename, "rb");
	while (!feof(f1))
	{
		int r = fread(&number, 1, sizeof(int), f1);
		if (r < sizeof(int)) break;
		if (number % 2 == 0) {
			if (j == 0) max_even = number;
			j++;
			if (number > max_even) max_even = number;
		}
		if (number % 2 == 1) {
			if (k == 0) min_odd = number;
			k++;
			if (number < min_odd) min_odd = number;
		}
	}
	fclose(f1);
	res = max_even - min_odd;
	return res;
}


int main(){
	int *mas;
	int n;
	int evens, sqrts, subtrs;
	printf("n:   ");
	scanf("%d", &n);
	write_int_numbers("dn1.bin", n);
	printf("\n");
	mas = read_int_numbers("dn1.bin", n);
	printf("\n");
	for (int i = 0; i < n; i++) {
		printf("%d", mas[i]);
		printf("%c", '\n');
	}
	printf("\n");

	evens = num_of_even("dn1.bin");
	printf("%d", evens);
	printf("\n");
	sqrts = num_of_sqrt("dn1.bin");
	printf("%d", sqrts);
	printf("\n");
	subtrs = subtr_even_odd("dn1.bin");
	printf("%d", subtrs);
	printf("\n");

	getchar();
	getchar();
}

