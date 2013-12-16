package com.java.dsnaoa;

import java.util.HashSet;
import java.util.List;

import jdk.nashorn.internal.ir.LiteralNode.ArrayLiteralNode.ArrayUnit;

public class DummyDataClass {

	public static int[] WorseCase = {100,90,80,70,60,50,40,30,20,10,9,8,7,6,5,4,3,2,1};

	public static int[] BestCase = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100};

	public static void printOutPut(int[] arrayToPrint, String message)
	{
		System.out.println("*******************"+message+"***********************");
		for(int i=0 ; i< arrayToPrint.length;i++)
		{
			System.out.print( arrayToPrint[i]  + ", ");
		}
		System.out.println();
		System.out.println("_____________________________________________________________________");

		for(int i=0 ; i< arrayToPrint.length;i++)
		{
			System.out.print( i  + ", ");
		}
		System.out.println();System.out.println();
		//System.out.println("*****************************************************");
	}

	public static void swap(int[] arrayToPrint, int index1 , int index2)
	{
		int temp = arrayToPrint[index1];
		arrayToPrint[index1] = arrayToPrint[index2];
		arrayToPrint[index2] = temp;
	}

	public static void eliminateWords(String sen, String eli){

		HashSet<String> allEminatingWords = new HashSet<String>();
		String[] sentence = sen.split(" ");
		String[] eliminate =eli.split(" ");
		String[] outputArray;
		
		System.out.print("Strings to Eliminate : ");
		for(String word : eliminate){
			allEminatingWords.add(word.toLowerCase());
			System.out.print(word.toLowerCase()+ " | ");
		}
		
		System.out.println();
		System.out.print("All words in Sentence  : ");
		for(String word : sentence){
			System.out.print(word.toLowerCase()+ " | ");
		}

		System.out.println();
		
		outputArray = new String[sentence.length];
		int j=0;
		for(int i=0; i< sentence.length;i++)
		{
			if(!allEminatingWords.contains(sentence[i].toLowerCase())){
				outputArray[j] = sentence[i];
				j++;
			}
			
			
		}
		
		//System.out.println(String.join(" ", sentence));

		System.out.println();
		System.out.print("Eliminated Sentence  : ");
		for(String word : outputArray){
			if(word!=null)
			System.out.print(word.toLowerCase()+ " | ");
		}


	}
	
	public static void checkPalindrome(String checkString)
	{
		int lowIndex = 0;
		int highIndex =checkString.length()-1;
		
		char[] strArray = checkString.toCharArray();
		
		while(highIndex>lowIndex)
		{
			if(strArray[lowIndex]!= strArray[highIndex])
			{
				System.out.println("String is not Palindrome"); // return
			}
			highIndex--;
			lowIndex++;
		}
		
		System.out.println("String is Palindrome");
	}

}
