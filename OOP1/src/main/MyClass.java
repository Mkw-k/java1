package main;

public class MyClass {

	public static void main(String[] args) {
		Human h = new Human();  //new로 잡혀져 있는건 heap영역에 있다.
		//human(class 자료형)
		//h : object(객체), instance(주체)  <-stack에 있음 h는
		
		h.name = "홍길동";
		h.age = 24;
		h.height = 172.2;
		
		h.method();
		h.function();
		
	}

}
