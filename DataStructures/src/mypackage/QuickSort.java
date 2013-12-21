/*
 *   O(NlogN)  - Fastest sorting in memory algorithm
 */

package mypackage;

public class QuickSort {
	
	private static int[] arr = {23,12,54,25,19,77,14,45,12,78};
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	
		System.out.println("***Array Before Sorting***");
		for(int num : arr){ 		
			System.out.print(num +" ");}
		
		System.out.println("");
		System.out.println("********************************");
		recQuickSort(0,9);
		System.out.println("Array After Quick Sorting");
		for(int num : arr)
		System.out.println(num +" ");
		
	}
	
	public static void recQuickSort(int left,int right)
	{
		if(right - left <=0)
		{
			return;
		}		
		else
		{	
			int pivot=arr[right];
			int partition = partitionit(left,right,pivot);
			recQuickSort(left,partition-1);
			recQuickSort(partition+1,right);
		}
	}	
	
	// To partition the array
	
	 public static int partitionit(int left,int right,int pivot){
		int leftptr = left-1;
		int rightptr = right;
		
		while(true)
		{
	//		System.out.println( " leftptr " + leftptr);
	//		System.out.println( " pivot " + pivot);
			while (arr[++leftptr] < pivot)
	
				;//do nothing 
			
			
			while ((arr[--rightptr]) > pivot && rightptr > 0)
			
				;//do nothing
			
			
			if (leftptr >= rightptr)
			{
				//partion done
				break;
			}
			else
			{
				//swap(leftptr,rightptr);
				
				int a =arr[leftptr];
				arr[leftptr]=arr[rightptr];
				arr[rightptr]=a;
				
			}
		}//end while
		//swap(leftptr,right);
		int a =arr[leftptr];
		arr[leftptr]=arr[right];
		arr[right]=a;
		return leftptr;
	}
}
