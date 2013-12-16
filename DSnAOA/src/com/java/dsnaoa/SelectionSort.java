package com.java.dsnaoa;

public class SelectionSort {

	public void doSelectionSort(String scenario, int[] arrayToSort)
	{
		DummyDataClass.printOutPut(arrayToSort, "before sorting = ");
		//declare variables
		int numUnSorted = arrayToSort.length,max,cycleCount = 0;
		
		while(numUnSorted>0) //iterate array
		{
			max=0;
			for(int i=1;i<numUnSorted ;i++)
			{
				if(arrayToSort[max]<arrayToSort[i])
				{
					max = i;
				}
				cycleCount++;
			}
			DummyDataClass.swap(arrayToSort,max, numUnSorted-1);
			DummyDataClass.printOutPut(arrayToSort, "Pass = "+cycleCount);
			numUnSorted--;
		}
		
		System.out.println("Selection Sort Scenario : " + scenario);
		System.out.println("Total Number of elements : " + arrayToSort.length);
		System.out.println("Total Number of Iterations : " + cycleCount);
		System.out.println("Avg : " + cycleCount / arrayToSort.length);
	}

}
