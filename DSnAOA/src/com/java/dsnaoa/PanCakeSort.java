package com.java.dsnaoa;

import java.awt.BufferCapabilities.FlipContents;

public class PanCakeSort {



	public void doPanCakeSort(String scenario, int [] arrayToSort){
		int maxPosition=0;
		int arraySize = arrayToSort.length-1;
		
		DummyDataClass.printOutPut(arrayToSort, "before sorting = ");

		for(int i=arraySize;i>0; i--){
		
			maxPosition = findMaxInArray(arrayToSort,i);
			
			if(maxPosition != arraySize-1){
				
				if(maxPosition != 0){
					flipArray(arrayToSort,maxPosition);
				}
					flipArray(arrayToSort,i);
			}
		}
		
		DummyDataClass.printOutPut(arrayToSort, "End Of Pan Cake Sort ");
		
	}

	private int findMaxInArray(int[] arrayToSort, int arraySize) {
		int mi=0;
		
		for(int i=0; i< arraySize; i++){
			if(arrayToSort[mi]<arrayToSort[i]){
				mi = i;
			}
		}

		return mi;
	}

	private void flipArray(int[] arrayToSort, int i) {
		int temp, start =0;
		
		while(start<i){
			temp = arrayToSort[start];
			arrayToSort[start] = arrayToSort[i];
			arrayToSort[i] = temp;
			start++;
			i--;
			DummyDataClass.printOutPut(arrayToSort, "Flip Array - Iteration " + i);
		}
		
	}


}
