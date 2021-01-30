package work4;

public class report5 {

	public static void main(String[] args) {
		int result;
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				result = i * j;
				System.out.print(i+"X"+j+"="+result+" ");
			}
			System.out.println(); //단바꿈 
		}//end for

	}

}
