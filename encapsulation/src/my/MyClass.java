package my;

public class MyClass {

	
		/*
		  
	  	Encapsulation == 은닉성, 캡슐화 
	  	외부접근 제어(차단, 읽기전용, 허용여부)
	  	
	  	접근지정자
	  	private : 개인적인 
	  	public : 대중적인
	  	protected : 상속에 관련 보호 
	  	
	  */
		
		private int number;
		public String name;
		protected double height;
		
		//method통해서 접근여부 결정 
		public void setNumber(int number) { //setter
			this.number = number;
		} //지워 주면 Read Only
	
		public int getNumber() { //getter
			return number;
		}//이거마저 지워주면 외부와 차단 
		
	

}
