package main;

public class MyClass {

		public int number; // 멤버변수  -> Heap
		static int staticVar;  // global variable ->static 
		
		public void method(int n) {// -> 매개 변수 -> stack
			
			int num; //지역(local)변수  -> stack 
			
			
			number = 1;
			
		}
		
		public void func() {
			
			number = 2;
			
			MyClass.staticVar = 12;
		}
		
		public void function() {
			int _num = 0;
			
			_num++;
			number++;
			MyClass.staticVar++;
			
			System.out.println("local변수 _num = "+_num);
			System.out.println("member변수 number ="+number);
			System.out.println("static변수 staticVar ="+MyClass.staticVar);
		}
}
