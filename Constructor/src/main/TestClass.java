package main;

public class TestClass {
	
	int number = 12;

	public TestClass() {	//기본 생성자 
		System.out.println("TestClass TestClass()");
	}
	
	public TestClass(char c) {
		this(); // 생성자를 호출 
		//this(12,'h'); 여러개 호출은 안됨 
		System.out.println("TestClass TestClass(char c)");
	}
	
	public TestClass(int i, String s) {
		this('B');
		System.out.println("TestClass TestClass(int i, String s)");
		//this('B');  생성자는 들어가자마자 제일 위에 있어야 한다. 
	}
	
	/*
	    this : 자기 참조 
	    	   0번째 매개변수로 자기 자신의 주소를 가리킨다
	 */

	public void method(int number) {
		//int number;
		System.out.println(this);
		
		this.number = number;
		//heap 영역에 들어가있는 주소이다. 암기 
		
		
	}

}
