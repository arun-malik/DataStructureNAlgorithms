package mypackage;

public class ReverseString {
	
	static String str = "Three ways to reverse a String";
	
	public static void main(String[] args)
	{
		// Using String reverse method 		
		String reverseStr = new StringBuffer(str).reverse().toString();
		System.out.println(""+ reverseStr);
		
		//Revere a string iteratively
		char[] charArr= str.toCharArray();
		for(int i=0;i<charArr.length;i++){
			System.out.print(""+charArr[charArr.length -1- i]);
		}
		System.out.println("");
		String reverseStr1 = reverseRecursively(str);
		
		System.out.println(""+ reverseStr1);
	}
	
	public static String reverseRecursively(String str)
	{
		if(str.length() < 2){
			return str;
	}
		System.out.println(str);
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	
	}

}
