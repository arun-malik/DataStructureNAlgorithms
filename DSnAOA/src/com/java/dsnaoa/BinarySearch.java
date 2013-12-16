package com.java.dsnaoa;

public class BinarySearch {


	public void findUsingBinarySearch(int key, int[] arrayToSearch) {

		int lowIndex =0;
		int highIndex = arrayToSearch.length-1;
		int keyFoundAtIndex=-1;
		int cycleCount=0;

		System.out.println("Key to Search: "+ key);
		DummyDataClass.printOutPut(arrayToSearch, "Array to be Searched");



		while(highIndex>lowIndex){
			int midIndex = ((lowIndex+highIndex)/2);

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("LowIndex : "+lowIndex+ " MidIndex : " +midIndex+ " HighIndex : "+highIndex );
			System.out.println("LowValue : "+arrayToSearch[lowIndex]+ " MidValue : " +arrayToSearch[midIndex]+ " HighValue : "+arrayToSearch[highIndex] );
			System.out.println("----------------------------------------------------------------------------");

			if(arrayToSearch[midIndex] == key)
			{
				keyFoundAtIndex =  midIndex;
				break;
			}
			else if(arrayToSearch[midIndex] > key)
			{
				highIndex=midIndex-1;
				cycleCount++;
			}
			else if(arrayToSearch[midIndex] < key)
			{
				lowIndex = midIndex+1;
				cycleCount++;
			}
			else
			{
				break;
			}
		}

		System.out.println("Binary Serch: ");
		System.out.println("Total Number of elements : " + arrayToSearch.length);
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
