#include<stdio.h>
#include<string.h>

int main()
{
	char start[15] = "aaabbcaaabbbcd";
	char result[15];
	int m = 1;
	result[0] = start[0];
	
	for (int i = 1; i < 15; i++) {
	    
		if (start[i] == start[i-1]){
		    continue;
		} else {
		    result[m] = start[i];
		    m += 1;
		}
	}

	for (int i = 0; i < strlen(result); i++)
	{
		printf("%c", result[i]);
	}
}
