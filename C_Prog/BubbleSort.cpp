/*
Bubble Sort in C. Simplest to implement but slow
*/
#include <stdio.h>

int * bubblesort(int n[])
{
	for(int i=9; i>1; i--) {
		for(int j=0;j<i; j++) {
			if (n[j] > n[j+1]) {
				int temp = n[j];
				n[j]=n[j+1];
				n[j+1]=temp;
			}
		}
	}
	return n;
}
