package report01;

import java.util.Arrays;

public class report02 {

	public static void main(String[] args) {
		
		int[] original  = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
	//	int[] result = shuffle(original);
	//	System.out.println(Arrays.toString(result));
		
		shuffle(original);
		System.out.println(Arrays.toString(original));
	
		/*
		int a, b;
		a = 11;
		b = a; // value 대입/할당
		
		a = 22;
		System.out.println(a);
		System.out.println(b);
		*/
	
		/*
		int aa[] = new int[1];
		aa[0] =11;
		
		int bb[] = aa; //adress    aa는 bb고 bb는 aa다 
		
		aa[0] = 22;
		
		System.out.println(bb[0]);
		*/
	}
	
	static int[] shuffle(int[] original) { //adress할당
		int temp;
		for (int i = 0; i < 1000; i++) {
			int j = (int)(Math.random()*9);
			int k = (int)(Math.random()*9);
			
			temp = original[j];
			original[j]=original[k];
			original[k]=temp;
		}
		
		
		
		
		
	/*	
		int temp;
		for (int i = 0; i <1000; i++) {
			int j = (int)(Math.random()*9);
			int k = (int)(Math.random()*9);
			
			temp = original [j];
			original [j] = original [k];
			original [k] = temp;
		}
	*/
//		for (int i = 0; i < original.length; i++) {
//			System.out.print(original[i]+" ");
//		}
		return original;
		
	}

}
