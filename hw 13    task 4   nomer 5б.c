
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define N 100

int main()
{
	char mas[N];

	FILE *file = fopen("txt1.txt", "rt");
	char c;
	int k = 0;
	while (1) {
		if (feof(file)) break;
		c = getc(file);
		mas[k++] = (char)c;
	}
	fclose(file);
	
	int num_of_words = 0;
	for (int i = 1; i < k; i++) {
		if ((mas[i-1] != '\n' && mas[i-1] != ' ') && (mas[i] == '\n' || mas[i] == ' ')){
		    num_of_words += 1; }
	}
	if (mas[k-1] != '\n' && mas[k-1] != ' ') {
	    num_of_words += 1;
	}
	printf("%d", num_of_words);
}