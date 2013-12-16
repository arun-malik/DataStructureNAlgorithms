package com.java.dsnaoa;

public class FibbonacciSeries {

	
	public void generateFibbonacciSeries(int index, int testNumber)
	{
		System.out.println("Number to search in Fibonacci Series : " + testNumber);
		for(int i=0; i<=index; i++){
            System.out.println(recursionFibbonacciSeries(i,testNumber) +" ");
        }
	}

	private long recursionFibbonacciSeries(long index, long testNumber) {
				
				//System.out.println("Recursion Fib Enter : Index : "+ index);
				if(testNumber ==0 || testNumber ==1 )
				{
					System.out.println("Test Number is 0 & 1");
				}
		
				if(index == 0) return 0;
				if(index <=2) return 1;
				
				
				long fibterm = recursionFibbonacciSeries(index-1,testNumber) + recursionFibbonacciSeries(index-2,testNumber);
				if(fibterm>testNumber)
				{
					System.out.println("Test number not present");
				}
				else if (fibterm == testNumber)
				{
					System.out.println("Test number  present");
				}
				
				
				return fibterm;
	}

}
