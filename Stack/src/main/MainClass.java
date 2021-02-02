package main;

import stack.ArrayStack;

public class MainClass {
	public static void main(String[] args) {
		/*
			Stack : First In Last Out
					실린더
					in 	-> push
					out -> pop
		*/
		
		ArrayStack stack = new ArrayStack(5);
		
		String str = "AAA";
		stack.push(str);
		
		String peekStr = (String)stack.peek();
		System.out.println("top = " + peekStr);
		
		str = "BBB";
		stack.push(str);
		
		peekStr = (String)stack.peek();
		System.out.println("top = " + peekStr);
		
		str = "CCC";
		stack.push(str);
		
		peekStr = (String)stack.peek();
		System.out.println("top = " + peekStr);
		
		String popStr = (String)stack.pop();
		System.out.println("pop str = " + popStr);
		
		peekStr = (String)stack.peek();
		System.out.println("top = " + peekStr);
		
	}
}






