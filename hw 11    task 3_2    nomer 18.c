#include<stdio.h>
#include<string.h>

int main()
{
	char start[15] = "abbcabbbcadaama";
	char result[15];
	char simb_1 = 'a';
	char simb_2 = 'w';
	result[0] = start[0];
	
	for (int i = 0; i < 14; i++) {
	    
		if (start[i] == simb_1 ){
		    result[i+1] = simb_2;
		} else {
		    result[i+1] = start[i+1];
		}
	}

	for (int i = 0; i < strlen(result); i++)
	{
		printf("%c", result[i]);
	}
}