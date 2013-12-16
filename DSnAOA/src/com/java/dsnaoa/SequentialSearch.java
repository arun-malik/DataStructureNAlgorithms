package com.java.dsnaoa;

public class SequentialSearch {

	public void findUsingSequentialSearch(int key, int[] arrayTosearch) {
		int cycleCount=0; 
		boolean found=false;
		int keyFoundAtIndex=-1;
		
		System.out.println("Key to Search: "+ key);
		DummyDataClass.printOutPut(arrayTosearch, "Array to be Searched");
		
		for(int i=0; i< arrayTosearch.length;i++)
		{
			cycleCount++;
			if(arrayTosearch[i]==key)
			{
				keyFoundAtIndex = i;
				found = true;
				break;
			}
		}
		
		System.out.println("Sequential Serch: ");
		System.out.println("Total Number of elements : " + arrayTosearch.length);
		System.out.println("Total Number of Iterations : " + cycleCount);
		if(keyFoundAtIndex>0){
			System.out.println("Key : "+ key + " Found at index : "+ keyFoundAtIndex );
		}
		else
		{
			System.out.println("Key : "+ key + " not found in array." );
		}
		
	}

}
