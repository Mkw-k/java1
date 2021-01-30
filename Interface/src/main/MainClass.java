package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		    abstract class : 일반메소드 + 추상메소드 + 멤버변수 
		    
		    interface : 추상메소드 
		    			포함하는 메소드가 선언만 되어 있는 것.
		    			다중 상속이 가능하다.
		    			빠르게 클래스의 내용을 파악할수 있는 점.
		    			확장성, 관리목적을 갖고 있다. 
		    			
		    MyClass extends AClass, BClass  --->안됨 
		    
		 */

//		Myinterface inf = new Myinterface();
		MyClass mycls = new MyClass();
		mycls.method(1);
		
		YouClass youcls = new YouClass();
		youcls.func();
		youcls.method(2);
		
		Youinterface yinter = new Youinterface() {
			
			@Override
			public void func() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Myinterface arr[] = new Myinterface[2];
		arr[0] = new MyClass();
		arr[1] = new HeClass();
		
		for (Myinterface in : arr) {
			in.method(1);
		}
		
		Myinterface my = new MyClass();
		
	}

}
