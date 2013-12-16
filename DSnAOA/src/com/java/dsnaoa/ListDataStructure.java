package com.java.dsnaoa;

import java.util.Arrays;

public class ListDataStructure <E> {
	
	private int size;
	private final int DEFAULT_CAPACITY = 10;
	private Object elements[]; 
	
	public ListDataStructure()
	{
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public void addElementToList( E e){
		if(elements.length==size){
			increaseCapacity();
		}
		elements[size++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E getElementByIndex(int i)
	{
		if(i>=size || i<0){
			throw new IndexOutOfBoundsException();
		}
	
		return (E) elements[i];
		
	}
	
	private void increaseCapacity() {
		int newSize = elements.length *2;
		elements = Arrays.copyOf(elements,newSize);
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getCount(){
		return elements.length;
	}
	
	public void printListElements()
	{
		System.out.println("******************************************");
		for(int i=0 ; i< elements.length;i++)
		{
			System.out.print( elements[i]  + ", ");
		}
		System.out.println();
		System.out.println("_____________________________________________________");
	}

	
}
