#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<cmath>
#include<time.h>
#include<fstream>
#include<string.h>

typedef
struct Baggage
{
	int amount;
	int weight;
}Baggage;

Baggage input_Baggage()
{
	Baggage res;
	printf("amount = ");
	scanf("%d", &res.amount);
	printf("weight = ");
	scanf("%d", &res.weight);
	return res;
}

void SavePassangers(const char* filename, int n) {
	FILE* f1 = fopen(filename, "wb");///////
	char pass[50];
	for (int i = 0; i < n; i++) {
		printf("current passangers: ");
		scanf("%s", &pass);
		fwrite(&pass, 1, sizeof(char), f1);
	}
	fclose(f1);
}

void SaveBaggage(const char* filename, int n) {
	FILE* f2 = fopen(filename, "wb"); /////
	Baggage b;
	for (int i = 0; i < n; i++) {
		b = input_Baggage();
		fwrite(&b, 1, sizeof(Baggage), f2);
	}
	fclose(f2);
}



int main() {
	int n;
	printf("amount of passangers: ");
	scanf("%d", &n);
	float average_weight = 0.0;
	int amount = 0;

	SavePassangers("passengers.bin", n);
	SaveBaggage("Baggage.bin", n);

	Baggage b;

	FILE* f3 = fopen("passengers.bin", "rb");
	FILE* f4 = fopen("Baggage.bin", "rb");
	int min_amount = 100000;
	int max_weight = 0;
	while (!feof(f4)) {
		int r = fread(&b, 1, sizeof(Baggage), f4);
		average_weight += b.weight / b.amount;
		amount += b.amount;
		if (b.amount < min_amount) {
			min_amount = b.amount;
		}
		if (b.weight > max_weight) {
			max_weight = b.weight;
		}
	}
	fclose(f4);

	char pass[50];
	FILE* f5 = fopen("Baggage.bin", "rb");

	for (int i = 0; i < n; i++) {
		int r = fread(&b, 1, sizeof(Baggage), f5);
		int k = fread(&pass, 1, sizeof(char), f3);

		if (b.amount > 2) {
			printf("\n%s", "more than 2 items has: ");
			printf("%s", pass, "%\n");
		}
		if (b.amount > amount / n) {
			printf("\n%s", "more than average number of items has: ");
			printf("%s", pass, "%\n");
		}
		if ((b.amount > min_amount) && (b.weight < max_weight)) {
			printf("\n%s", "more items but less weight has: ");
			printf("%s", pass, "%\n");
		}
		printf("%\n");
	}
	printf("%\n");
	fclose(f3);
	fclose(f5);

}