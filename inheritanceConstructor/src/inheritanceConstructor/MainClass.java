package inheritanceConstructor;

import cls.ChildOneClass;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		// 상속 -> 생성자 
		
		ChildOneClass cc = new ChildOneClass('A');
		//부모클래스 생성자 먼저 호출되고 자식클래스 생성자 실행됨 
		
		ParentClass pc = new ParentClass("성춘향");
	
		ChildOneClass co = new ChildOneClass("일지매");
		co.namePrint();
		
		co.setName("향단이");
		co.namePrint();
	}
}
