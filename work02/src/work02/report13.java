package work02;

public class report13 {

	public static void main(String[] args) {
		//범위 : 0~ 99 1개
		double x = Math.random();
		
		int y = (int)(x*100); 
		System.out.println(y);
		
		//범위 11, 12, 13, 14, 15 1개 
		int z = (int)(((x*5)+1)+10);
		System.out.println(z);
		
		
		//범위 1~45 개수 6개
		
		int k = (int)(x*100);	
		
		int n;
		n = (k < 0 )? (k*+54):k;
		
		System.out.println(n);
				
		
		
		
		
	}
	
	
	
	
}
