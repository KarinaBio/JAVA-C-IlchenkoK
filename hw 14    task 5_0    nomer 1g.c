#include<stdio.h>
#include<time.h>

typedef
struct Book {
	int shifr;
	char author[30];
	char title[20];
	int nomer;
	char surname[30];
	char date[20];
    }Book;

Book save_Book_info(){
	Book res;
	printf("шифр:  ");
	scanf("%d", &res.shifr);
	printf("автор:  ");
	scanf("%s", res.author);
	printf("назва: ");
	scanf("%s", res.title);
	printf("номер: ");
	scanf("%d", &res.nomer);
	printf("прізвище: ");
	scanf("%s", res.surname);
	printf("дата: ");
	scanf("%s", res.date);
	return res;
}

void print_Book_info(Book book)
{
	printf("Shifr = %d", book.shifr);
	printf("\n");
	printf("Author = ");
	puts(book.author);
	printf("Title = ");
	puts(book.title);
	printf("Nomer = %d", book.nomer);
	printf("\n");
	printf("Surname = ");
	puts(book.surname);
	printf("Date = ");
	puts(book.date);
}

int main()
{
	Book book;
	book = save_Book_info();
	print_Book_info(book);
}






