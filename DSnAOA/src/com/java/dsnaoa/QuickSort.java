package com.java.dsnaoa;

public class QuickSort {

	int[] tempArraySort;
	int cycleCount;
	public void doQuickSort(String scenario, int[]arrayToSort) {
		cycleCount=0;
		
		this.tempArraySort=arrayToSort;
		
		DummyDataClass.printOutPut(tempArraySort, "Before Sorting");
		
		quickSort(0,tempArraySort.length-1);
		
		System.out.println("Insertion Sort Scenario : " + scenario);
		System.out.println("Total Number of elements : " + arrayToSort.length);
		System.out.println("Total Number of Iterations : " + cycleCount);
		System.out.println("Avg : " + cycleCount / arrayToSort.length);
		DummyDataClass.printOutPut(tempArraySort, "Final sorted Array: ");
	}
	
	public void quickSort(int lowIndex, int highIndex){
		int i= lowIndex,j=highIndex;
		
		int mid= (lowIndex + ((highIndex-lowIndex)/2));
		
		
		while(i<j){
			
			System.out.println("LowIndex : "+lowIndex+ " MidIndex : " +mid+ " HighIndex : "+highIndex );
			System.out.println("LowValue : "+tempArraySort[lowIndex]+ " MidValue : " +tempArraySort[mid]+ " HighValue : "+tempArraySort[highIndex] );
			
		
			while(tempArraySort[mid]>tempArraySort[i]){
				i++;
				cycleCount++;
			}
			
			while(tempArraySort[mid]<tempArraySort[j]){
				j--;
				cycleCount++;
			}
			
			if(i<j){
				DummyDataClass.swap(tempArraySort, i, j);
				i++;
				j--;
			}
			
			//System.out.println("Mid index :" + mid +" Mid Value : " +tempArraySort[mid]);
			cycleCount++;
			DummyDataClass.printOutPut(tempArraySort, "Pass :"+cycleCount);
			
			if(lowIndex<j){
				quickSort(lowIndex,j);
			}
			
			if(highIndex<i){
				quickSort(i,highIndex);			
			}
			
		}
	}

}
