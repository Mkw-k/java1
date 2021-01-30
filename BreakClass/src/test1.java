
public class test1 {

	public static void main(String[] args) {
		boolean b = false;
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+ i);
			for(int j =0; j<5; j++) {
				System.out.println("\tj = " + j);
				
				if(i ==3 && j==2) {
					b = true;
				}
				if(b == true) {
					break;
				}
			}//end for sub 
			if(b == true) {
				break;
			}
		}//end for main

	}

}
