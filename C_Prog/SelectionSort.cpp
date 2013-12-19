/*
Improves on bubble sort by reducing the number of steps from O(N2) to O(N)
*/

int * selectionsort(int n2[])
{
	for(int i=0;i< 10;i++)
	{
		int min=n2[i];
		
		for(int j=i+1;j<10;j++){
			if (n2[j] < min)
				min=n2[j];
		}
		n2[i]=min;
	}
	return n2;
}