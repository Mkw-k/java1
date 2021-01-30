
public class MainClass {

	public static void main(String[] args) {
		/*
		 	break	== 탈출 escape
		 	
		 	loop 문 함께 사용한다 (for, while, do while)
		 	
		 	switch(변수) {
		 		case 값1 : 
		 			처리1
		 			break;
		 		case 값2 : 
		 			처리2
		 			break;
		 	}
		 	
		 	형식 : 
		 	for(int i =0; i < 10; i++) {
		 		if(조건) {
		 			break;
		 		}
		 	}
		 	
		 	w = 0;
		 	while(w <5) {
		 	
		 	if(조건) {
		 		break;
		 	}
		 	
		 	w++;
		 	}
		 */
		
		
		
		for(int i =0; i < 10; i++) {
			System.out.println("for loop "+i);
			if(i ==5) {
				break;
			}
		}
		
		char array[] = { 'a', 'b', 'c', 'd', 'e'};
		for(int i = 0; i< array.length; i++) {
			System.out.println("for i = "+ i);
			if(array[i] == 'd') {
				break;
			}
		}
		
		//정수 배열을 5~6개 초기화 -> -n 
		//-값이 나왔을때  탈출하는 식 
		
		int array2[] = {1, 2, 3, -4, 5, 6};
		int w = 0;
		while(w < array2.length) {
			System.out.println("while loop w = "+ w);
			if(array2[w] < 0 ) {
				break;
			}
			w++;
		}
		
		//2중 loop 탈출 
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+ i);
			for(int j =0; j<5; j++) {
				System.out.println("\tj = " + j);
				
				if(i == 3 && j == 2) {
					break;
				}
				
			}
		}
		
		//1. loop수에 맞게 break를 설정해준다. 
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
			}
		}
//		if(b == true) {
//			break;
//		}
		
		
		//2. break를 설정 
		myout:for(int i = 0; i<10; i++) { // myout 변수는 사용자 지정이다
			System.out.println("i = "+ i);
			for(int j =0; j<5; j++) {
				System.out.println("\tj = " + j);
				
				if(i ==3 && j ==2) {
					break myout;
				}
			}//end for1
		}//end for2
		
	//for
		int arr[] = {11, 22, 33, 44, 55};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//foreach    값만 대입되서 넘어온다 
				for(int n : arr) { // n <= arr[0 ~ 4] value가 대입된다 
					System.out.println(n);
				}
		
		
		
//		for(int i=0; i<array2.length; i++) {
//			System.out.println("array "+i);
//			if(array2[i] < 0 ) {
//				break;
//			}
//		}
		
		

	}//end main

}//end class






