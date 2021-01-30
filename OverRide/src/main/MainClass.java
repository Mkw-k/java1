package main;

import cls.Parant;
import cls.child;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	Over Ride : 부모 클래스로부터 상속받은 메소드를 자식 클래스에 고쳐 기입
		 	
		 
		 */
		
//		child c= new child();
//		c.method();

		Parant pc = new child();
		pc.method();
	}

}
