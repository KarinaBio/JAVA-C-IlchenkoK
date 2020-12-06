#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>

int main()
{
    char mas[100];

	FILE *file = fopen("txt1.txt", "rt");
	char c;
	int k = 0;
	while (1) {
		if (feof(file)) break;
		c = getc(file);
		mas[k++] = (char)c;
	}
	fclose(file);
    int cnt = k;
    char names[100];
    int costs[100];
  
    bool f = true;
    for (int i = 0, j = 0, k = 0, h = 0; i < cnt; i++) {
        char str[10];
        while (mas[i] != '=')
        {
            names[k++] = mas[i];
            i++;
        }
        i++;
        names[k++] = '=';
        while (mas[i] != '-')
        {
            str[j++] = mas[i];
            i++;
        }
        i++;
        j = 0;
        costs[h++] = atoi(str);
        continue;
    }

}
