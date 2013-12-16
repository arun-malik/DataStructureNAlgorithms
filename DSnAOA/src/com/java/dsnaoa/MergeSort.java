package com.java.dsnaoa;

public class MergeSort {

	private int[] tempArrayToSort;
	int[] sortedArray;
	int cycleCount;

	public void doMergeSort(String scenario, int[]arrayToSort) {
		cycleCount=0;
		DummyDataClass.printOutPut(arrayToSort, "before sorting = ");
		tempArrayToSort = arrayToSort;
		sortedArray = new int[arrayToSort.length];
		mergeSort(0, tempArrayToSort.length-1);
		
		System.out.println("Insertion Sort Scenario : " + scenario);
		System.out.println("Total Number of elements : " + arrayToSort.length);
		System.out.println("Total Number of Iterations : " + cycleCount);
		System.out.println("Avg : " + cycleCount / arrayToSort.length);
		DummyDataClass.printOutPut(tempArrayToSort, "Final sorted Array: ");
	}

	public void mergeSort(int lowIndex, int highIndex){
		System.out.println("LowIndex :"+ lowIndex+"  HighIndex: "+highIndex);
		if(lowIndex<highIndex){
			int middleIndex = (lowIndex+((highIndex-lowIndex)/2));
				mergeSort(lowIndex, middleIndex);
				mergeSort(middleIndex+1, highIndex);
				merge(lowIndex, middleIndex, highIndex);
			
		}
	}

	public void merge(int lowIndex, int middleIndex, int highIndex){
		
				for(int i=lowIndex;i<= highIndex;i++){
					sortedArray[i]=tempArrayToSort[i];
					cycleCount++;
				}
				DummyDataClass.printOutPut(sortedArray, "sortArray ");
		
				int i=lowIndex,k=lowIndex,j=middleIndex+1;
				
				
			    while (i <= middleIndex && j <= highIndex) {
			    	cycleCount++;
			      if (sortedArray[i] <= sortedArray[j]) {
			    	  tempArrayToSort[k] = sortedArray[i];
			    	 // DummyDataClass.printOutPut(sortedArray, "sortArray ");
			  		DummyDataClass.printOutPut(tempArrayToSort, "tempSortArray ");
			        i++;
			      } else {
			    	  tempArrayToSort[k] = sortedArray[j];
			    	 // DummyDataClass.printOutPut(sortedArray, "sortArray ");
			  		DummyDataClass.printOutPut(tempArrayToSort, "tempSortArray ");
			        j++;
			      }
			      k++;
			    }
			    
			    while (i <= middleIndex) {
			    	tempArrayToSort[k] = sortedArray[i];
			    	//DummyDataClass.printOutPut(sortedArray, "sortArray ");
					DummyDataClass.printOutPut(tempArrayToSort, "tempSortArray ");
			      k++;
			      i++;
			      cycleCount++;
			    }
			    

		

	}

}
