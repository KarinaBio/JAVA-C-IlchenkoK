#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>


void write_float_numbers(const char* filename, int n)
{
	float number;
	FILE* f1 = fopen(filename, "wb");
	for (int i = 0; i < n; i++)
	{
		printf("next number:   ");
		scanf("%f", &number);
		fwrite(&number, 1, sizeof(float), f1);
	}
	fclose(f1);
}


float* read_float_numbers(const char* filename, int n)
{
	float *nums = new float[n];
	float number;
	FILE* f1 = fopen(filename, "rb");
	int i = 0;
	while (!feof(f1))
	{		
		int r = fread(&number, 1, sizeof(float), f1);
		if (r < sizeof(float)) break;
		nums[i] = number;
		i++;
	}
	fclose(f1);
	return nums;
}


float sum_num(const char* filename) {
	float res = 0.0;
	float number;
	FILE* f1 = fopen(filename, "rb");
	int i = 0;
	while (!feof(f1))
	{
		int r = fread(&number, 1, sizeof(float), f1);
		if (r < sizeof(float)) break;
		res += number;
		i++;
	}
	fclose(f1);
	return res;
}


int num_of_negative(const char* filename) {
	int res = 0; 
	float number;
	FILE* f1 = fopen(filename, "rb");
	int i = 0;
	while (!feof(f1))
	{
		int r = fread(&number, 1, sizeof(float), f1);
		if (r < sizeof(float)) break;
		if (number < 0) {
			res += 1;
		}
		i++;
	}
	fclose(f1);

	return res;
}

float last_num(const char* filename) {
	float res;
	float number;
	FILE* f1 = fopen(filename, "rb");
	int i = 0;
	while (!feof(f1))
	{
		int r = fread(&number, 1, sizeof(float), f1);
		if (r < sizeof(float)) {
			break;
		}
		res = number;
		i++;
	}
	fclose(f1);
	return res;
}


int main()
{
	float *mas;
	int n;
	float sum, last;
	int num_neg;
	printf("n:   ");
	scanf("%d", &n);
	write_float_numbers("dn1.bin", n);
	printf("\n");
	mas = read_float_numbers("dn1.bin", n);
	printf("\n");
	for (int i = 0; i < n; i++) {
		printf("%f", mas[i]);
		printf("%c", '\n');
	}
	printf("\n");
	sum = sum_num("dn1.bin");
	printf("%f", sum);
	printf("\n");
	num_neg = num_of_negative("dn1.bin");
	printf("%d", num_neg);
	printf("\n");
	last = last_num("dn1.bin");
	printf("%f", last);
	printf("\n");

	getchar();
	getchar();
}
