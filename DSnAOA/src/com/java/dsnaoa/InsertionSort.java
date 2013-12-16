package com.java.dsnaoa;

public class InsertionSort {

	public void doInsertionSort(String scenario, int[] arrayToSort) {
		int cycleCount = 0;
		DummyDataClass.printOutPut(arrayToSort, "before sorting = ");
		
		for(int i=1;i<arrayToSort.length;i++)
		{
			for(int j=i; j>0; j--)
			{
				if(arrayToSort[j] < arrayToSort[j-1])
				{
					DummyDataClass.swap(arrayToSort, j, j-1);
				}
				else
				{
					cycleCount++;
					DummyDataClass.printOutPut(arrayToSort, "Pass = "+cycleCount);
					break;
				}
				cycleCount++;
				DummyDataClass.printOutPut(arrayToSort, "Pass = "+cycleCount);
			}
		}
		
		System.out.println("Insertion Sort Scenario : " + scenario);
		System.out.println("Total Number of elements : " + arrayToSort.length);
		System.out.println("Total Number of Iterations : " + cycleCount);
		System.out.println("Avg : " + cycleCount / arrayToSort.length);
		
	}

}
