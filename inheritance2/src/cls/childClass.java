package cls;

public class childClass extends ParentClass {

	public childClass() {
		System.out.println("childClass childClass()");
	}
	
	public void func() {
		number = 12;
		
//		super.method();
//		this.method();
		System.out.println("childClass func()");
	}
	
	//Over Ride -> 상속받은 클래스에서 메소드를 고쳐 기입하는 것을 말한다. 메소드의 사양이 완전 동일해야한다. 
	public void method() {
//		super.method();
		System.out.println("childClass method()");
	}
	
}
