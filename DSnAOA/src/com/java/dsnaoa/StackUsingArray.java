package com.java.dsnaoa;

import java.util.Arrays;

public class StackUsingArray<T> {
	
	private Object[] stack;
	private int top = 0;
	
	public StackUsingArray(int INITIAL_SIZE){
		stack = new Object[INITIAL_SIZE];
	}
	
	public void push(T element){
		if(size() == top){
			increaseCapacity();
		}
		stack[top++] = element;
		
		System.out.println("Saved element:"+element.toString()+" in stack at position:"+ Integer.toString(top-1));
	}
	
	public T pull(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return null;
		}
		T element = (T) stack[--top];
		stack[top] =null; 
		System.out.println("Pull: "+ element.toString());
		return element;
	}
	
	public T peek(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return null;
		}
		T element=  (T) stack[top-1];
		System.out.println("Peek: "+ element.toString());
		return element;
	}

	private void increaseCapacity() {
		 int newLength = stack.length *2;
		 stack = Arrays.copyOf(stack, newLength);
		 System.out.println("Increasing stack size: " + Integer.toString(newLength));
	}
	
	private int size() {
		// System.out.println("Stack size: " + Integer.toString(stack.length));
		 return stack.length;
	}
	
	private Boolean isEmpty() {
		// System.out.println("Check stack is empty");
		 return top == 0?true:false; 
	}

}
