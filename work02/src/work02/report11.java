package work02;

public class report11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		num1 = 128;
			
		System.out.printf("0x%x",num1);
		System.out.println();
		
		num2 = 56 ; 
		System.out.printf("0x%x",num2);
		System.out.println();
		//16진수로 변경
		
		
		num1 = (num1 & num2) | (num1 & num2);
		System.out.printf("0x%x",num1);
		System.out.println();
		
		num2 = ~(num1^num2);
		System.out.printf("0x%x",num2);
		System.out.println();
		//16진수로 출력 
		

	}

	
}
