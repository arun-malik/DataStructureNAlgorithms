package com.java.dsnaoa;

public class FibbonacciSeries {

	private long[] fibArray;
	public void generateFibbonacciSeries(int index, int testNumber)
	{
		fibArray = new long[index+1];
		System.out.println("Number to search in Fibonacci Series : " + testNumber);
		for(int i=0; i<=index; i++){
			fibArray[i] = recursionFibbonacciSeries(i,testNumber);
			//System.out.println(recursionFibbonacciSeries(i,testNumber) +" ");
		}

		DummyDataClass.printOutPut(fibArray, " Fibonacci Series ");

	}

	private long recursionFibbonacciSeries(long index, long testNumber) {

		//System.out.println("Recursion Fib Enter : Index : "+ index);
		if(testNumber ==0 || testNumber ==1 )
		{
			//System.out.println("Test Number is 0 & 1");
		}

		if(index == 0) return 0;
		if(index <=2) return 1;


		long fibterm = recursionFibbonacciSeries(index-1,testNumber) + recursionFibbonacciSeries(index-2,testNumber);
		if(fibterm>testNumber)
		{
			//System.out.println("Test number not present");
		}
		else if (fibterm == testNumber)
		{
			System.out.println("Test number  present at index: " + index);
		}


		return fibterm;
	}

	public void findCombinationOfNumbers(int number){
		generateFibbonacciSeries(8, number);

		int start =0;
		//backward traversing
		for(int i = fibArray.length ; i < 0 ; i --){
			if(fibArray[i] <= number){
				if(fibArray[i] == number){
					System.out.println("Number Found : "+ number);
				}
				for(int j =0 ; j < i; j++){

				}
			}
		}
	}

}
