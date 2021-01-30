package main;

import cls.ParentClass;
import cls.childClass;

public class MainClass {

	public static void main(String[] args) {
		
//		childClass cc = new childClass(); 
//		
//		cc.method();
		
		ParentClass pc = new childClass();
		pc.method();	//Over ride 된 메소드만 접근 
		
//		pc.func();
		//cast 변환   강제형변환 
		childClass c = (childClass)pc;
		c.func();

	}

}
