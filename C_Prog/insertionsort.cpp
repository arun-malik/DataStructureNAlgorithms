/*
Twice as fast as bubble sort and faster than selection sort 
*/

#include <stdio.h>

int * insertionsort(int n1[])
{
  for(int out=1;out<10;out++)
	{
	int in=out;
	int temp=n1[out];
		
		for(;in>0 && n1[in-1] > temp;in--)
		{
				n1[in]=n1[in-1];
				//pos=in-1
		}
		n1[in]=temp;
	}
	return n1;
}