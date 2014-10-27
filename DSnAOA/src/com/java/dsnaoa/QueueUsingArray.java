package com.java.dsnaoa;

import java.util.Arrays;

public class QueueUsingArray<T> {

	private Object[] queue;
	private int head,tail = 0;
	
	public QueueUsingArray(int INITIAL_SIZE){
		 queue = new Object[INITIAL_SIZE];
	}
	
	public void enQueue(T element){
		if(size()==tail){
			increaseCapactiy();
		}
		queue[tail++] = element;
		System.out.println("Saved element:"+element.toString()+" in queue at position:"+ Integer.toString(tail-1));
	}
	
	public T deQueue(){
		
		if(isEmpty()){
			System.out.println("Queue is empty");
			return null;
		}
		
		T element  = (T) queue[head++];
		
		if(head == tail){
			head = tail = 0;
			System.out.println("Queue Reset : empty");
		}
		
		System.out.println("DeQueue: "+ element.toString());
		return element;
		
	}
	
	public T peek(){
		
		if(isEmpty()){
			System.out.println("Queue is empty");
			return null;
		}
		T element  = (T) queue[head];
		
		System.out.println("Peek: "+ element.toString());
		
		return element;
	}
	
	private void increaseCapactiy() {
		int newLength = queue.length *2;
		queue = Arrays.copyOf(queue, newLength);
		System.out.println("Increasing queue size: " + Integer.toString(newLength));
	}
	
	private int size(){
		return queue.length;
	}
	
	private Boolean isEmpty(){
		return head==tail? (tail==0? true : false) : false;
	}
}
