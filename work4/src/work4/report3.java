package work4;

public class report3 {

	public static void main(String[] args) {

		for(int i = 0; i<9 ; i++) {
			for(int j = 0; j <5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	
	int t = 0;
		for(int i = 0; i<9 ; i++) {
			
			if( i < 5) t++;
			else 	   t--;
			
			for(int j = 0; j <t; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	
	
	}

}
