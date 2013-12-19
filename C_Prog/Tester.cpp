#include <stdio.h>

int * bubblesort(int n[]);
int * insertionsort(int n1[]);
int * selectionsort(int n2[]);
int main()
{
	int inputarray[10] = {3,5,1,8,0,9,2,6,7,4};
	int *p;
	printf("****** Example of Bubble Sort ********\n");
	printf("        List before sorting:            \n");
	for (int i=0; i< 10; i++) {
		printf("%d\n", inputarray[i]);
	}
	p = bubblesort(inputarray);
	printf("        List after sorting:            \n");
	for (int i=0; i< 10; i++) {
		printf("%d\n", *(p+i));
	}

	printf("****** Example of Insertion Sort *******\n");
	printf("........List after sorting.......\n");
	p = insertionsort(inputarray);
	for (int i=0; i<10; i++){
		printf("%d\n", *(p+i));
	}
	
	printf("****** Example of Selection Sort *******\n");
	printf(".........List after sorting........\n");
	p= selectionsort(inputarray);
	for (int i=0; i<10; i++){
		printf("%d\n", *(p+i));
	} 
	return 0;
}
