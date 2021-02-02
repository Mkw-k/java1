package main;

import queue.ArrayQueue;

public class MainClass {
	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(5);
		
		String str = "AAA";
		queue.push(str);
		
		String peek = (String)queue.peek();
		System.out.println(peek);
		
		str = "BBB";
		queue.push(str);
		
		peek = (String)queue.peek();
		System.out.println(peek);
		
		queue.pop();
		
		peek = (String)queue.peek();
		System.out.println(peek);
		

		
	}
}
