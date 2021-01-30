package cls;
	
public class ParentClass {
	
//	private String name;
	protected String name; //자식클래스에서만 접근을 허용 
	
	public void Parent_method() {
		System.out.println("ParentClass Parent_method()");
		
	}
//	childOneMethod(); 역방향은 안됨 
}
