package encapsulation;

import my.MyClass;

public class MainClass {
	
		
	public static void main(String[] args) {
		MyClass cls = new MyClass();
		// 멤버 변수는 90% private
		//	cls.number = 1;   private
		//	cls.name = "홍길동";  //public
		//	cls.height = 172.1;  자식클래스에서 허용해라 다만 외부에선 차단
								//protected
		
		cls.setNumber(123);
		int Number = cls.getNumber();
		
		
	}
	
	
	
	}


