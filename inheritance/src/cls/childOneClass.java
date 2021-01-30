package cls;

public class childOneClass extends ParentClass{

	public void func() {
		Parent_method();
		
//		name = "홍길동"; private은 부모의 완전한 자산 
		name = "홍길동";
	}
	
	public void childOneMethod() {
		System.out.println("childOneClass childOneMethod()");
	}
	
}
