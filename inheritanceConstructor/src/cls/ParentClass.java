package cls;

public class ParentClass {
	
	private String name;
	

	public ParentClass(int n) {
		System.out.println("ParentClass ParentClass()");
		
	}
	
	public ParentClass(String name) {
		this.name = name;
		System.out.println("ParentClass ParentClass(String name)");
		
	}
	
	public void namePrint() {
		System.out.println("Parent name :"+ name);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
