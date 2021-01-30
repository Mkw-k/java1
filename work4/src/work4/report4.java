package work4;

public class report4 {

	public static void main(String[] args) {
		String[] aStar = {"*", "**", "***", "****", "*****"};
		int n = 2;
		
		
		for(int i =0; i<9; i++) {
			if(i < 5) {
				System.out.println(aStar[i]);	
			}
			else if(i >= 5) {
				System.out.println(aStar[i-n]);
				n += 2;
			}
			
		}

	}

}
