import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		    continue : skip(생략)
		    
		    loop문과 같이 사용한다. 
		    
		    while(조건문) {
		    
		    	처리 1
		    	
		    	처리 2
		    	
		    	if(조건) {
		    		continue;
		    	}
		    	
		    	처리 3      <- 조건이 성립되면 생략된다 
		    }
		 */
		
		for(int i=0; i< 10; i++) {
			System.out.println("for i = "+i);
			
			System.out.println("for start");
			
			if(i > 3) {
				continue;
			}
			
			System.out.println("for end");
		}
		
		//숫자 입력 5개 
		//0을 포함해서 음수를 입력 받으면 안됨 
		
//		Scanner sc = new Scanner(System.in);
//		int PosNum[] = new int[5];
//		int count = 1;
//		
//		for(int i=0; i<PosNum.length; i++) {
//			System.out.println(count +"번째 숫자를 입력하세요.(음수는안됨)");
//			count++;
//			int val = sc.nextInt();
//			if(val < 0 ) {
//				System.out.println("음수를 입력하셨습니다");
//				break;
//			}
//			
//		}//end for
//		
//		count = 1;
//		for(int n : PosNum) {
//			System.out.println(count+"번째 숫자는 "+n+" 입니다");
//			count++;
//		}//end for
		
		
		Scanner kb = new Scanner(System.in);
		int numArr[] = new int[5];
		int w = 0;
		while(w<5)	{
			System.out.println((w+1) + "번째 수 = " );
			numArr[w] = kb.nextInt();
			
			if(numArr[w] <= 0 ) {
				System.out.println("다시입력하세요");
				continue;
			}
			w++;
		}
		
		

	}

}






