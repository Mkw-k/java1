package cls;

public class ChildOneClass extends ParentClass {
	/*
	    this : 자기참조 (주소)
	 	super : 부모 참조 (주소)
	 */
	
	
	public ChildOneClass() {
		super('A'); //부모클래스의 생성자는 이것이다 부모클래스를 가리키는것 
		System.out.println("ChildOneClass ChildOneClass()");
		
	}
	
	public ChildOneClass(char c) {
		super('A');
		System.out.println("ChildOneClass ChildOneClass(char c)");
		
	}
	
//	public ChildOneClass(String name) {
//		super(name);
//	}

	public ChildOneClass(String name) {
		super(name);
	}
	
}
