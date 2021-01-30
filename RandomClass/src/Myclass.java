
public class Myclass {

	public static void main(String[] args) {
		
		/*
		  Random : 무작위, 난수 
		   			1~5 -> ? 
		 */
		
		int r;
		
		//0 ~ 9
		r = (int)(Math.random() * 10) ;
		System.out.println("r = "+r);
		
		//10 20 30 40 50 
		r = ((int)(Math.random() * 5)+ 1    )*10  ;
		//0 ~ 4 + 1 -> 1 ~ 5 * 10
		System.out.println("r = "+r);
	}

}
