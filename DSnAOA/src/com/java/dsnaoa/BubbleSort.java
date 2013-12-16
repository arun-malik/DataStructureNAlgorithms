package com.java.dsnaoa;

public class BubbleSort {


	public void doBubbleSort(String scenario, int [] arrayToSort) {
		int cycleCount = 0;
		boolean flag = true;
		
		DummyDataClass.printOutPut(arrayToSort, "before sorting = ");

		while(flag)
		{
			flag = false;
			for(int i=0;i<arrayToSort.length-1;i++)
			{
				
				if(arrayToSort[i] > arrayToSort[i+1])
				{
					DummyDataClass.swap(arrayToSort, i, i+1);
					flag = true;
					
				}
				cycleCount++;
				DummyDataClass.printOutPut(arrayToSort, "Pass = "+cycleCount);
			}
		}
		
		System.out.println("Bubble Sort Scenario : " + scenario);
		System.out.println("Total Number of elements : " + arrayToSort.length);
		System.out.println("Total Number of Iterations : " + cycleCount);
		System.out.println("Avg : " + cycleCount / arrayToSort.length);
		
		
		

	}

}
