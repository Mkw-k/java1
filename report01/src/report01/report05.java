package report01;

import java.util.Arrays;

public class report05 {

	public static void main(String[] args) {
		int num1[] = {1,2,3,4,5};
		getDouble(num1);
		System.out.println(Arrays.toString(num1));
	}
	
	static void getDouble(int num1[]) {
//		int d = 0;
		for (int i = 0; i < num1.length; i++) {
			num1[i] = num1[i]*2;
			//			d = num1[i] *2;
//			System.out.print(d+" ");
		}
		
		
	}

}
