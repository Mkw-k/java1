package main;

import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		
		MyClass cls = new MyClass();
		
		cls.method(); //멤버 메소드 , 인스턴스 메소드 
		
//		cls.staticmethod();
		
		MyClass.staticmethod();

		MyClass cls1 = MyClass.getObject();
		
		Calendar cal = Calendar.getInstance();
	}


}
