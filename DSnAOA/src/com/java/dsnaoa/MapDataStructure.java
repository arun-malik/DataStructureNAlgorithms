package com.java.dsnaoa;

import java.util.Arrays;

public class MapDataStructure <K,V>{

	private int size;
	final int DEFAULT_SIZE =16;
	private MapEntry<K, V>[] mapElements;// = new MapEntry[DEFAULT_SIZE];
	
	public MapDataStructure() {
		mapElements = new MapEntry[DEFAULT_SIZE];
	
	}
	
	public void addElementToMap(K key, V value){
		
		if(mapElements.length == size)
		{
			increaseMapSize();
		}
		mapElements[size++]  = new MapEntry(key, value);
		
	}
	
	

	private void increaseMapSize() {
		int newSize = mapElements.length*2;
		mapElements = Arrays.copyOf(mapElements, newSize);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}



	public class MapEntry<K, V>{
		private final K key;
		private V value;
		
		public MapEntry(K key, V value){
			this.key = key;
			this.value = value;
		}
		
		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}
		
		public void setValue(V value) {
			this.value = value;
		}
		
	}

}


