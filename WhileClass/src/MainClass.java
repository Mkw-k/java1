
public class MainClass {

	public static void main(String[] args) {
		/*
		    loop 
		    
		    for(초기화; 조건식; 연산식) {
		    	처리 
		    }
		    
		    //이중 for문 
		    for(초기화;조건식;연산식) {   1
		    	for(초기화;조건식;연산식) {  5
		    	처리
		    	배열, 조건문과 같이 처리
		    	}
		    }
		    
		    형식 : 
		    	초기화 
		    	while(조건식){		if(조건식)
		    	처리					처리
		    	연산식							//2가지는 비슷해 보이지만 while루프는 조건이 맞으면 계속돌아간다
		    	}								//if는 조건이 맞으면 처리되고 나가는 반면에
		 */

	
	
	int w ; //선언
	
	w=0; //초기화
	while(w <10) {
		System.out.println("while loop " + w); //처리
		w++;  //연산식
	}
	
//	while(true) { //무한루프
//		System.out.println("무한 루프");
//	}
	
	for(int i =0; i <5; i++) {
		System.out.println("i = "+i);
		for(int j = 0; j<3;j++) {
			System.out.println("\tj = "+j);
		}
	}
	
	int w1, w2;
	
	w1 = 0;
	while(w1 <5) {
		System.out.println("w1 = "+w1);
		w2 = 0; //초기화의 위치를 잘 잡아야한다.
		while(w2 <3) {
			System.out.println("\tw2= "+w2);
			w2++;
		}
		w1++;
	}
	
	/*
	   형식 :
	   	초기화 
	   do{
	   	  처리
	   	  연산식
	   }while(조건식);
	   
	 */
	
	int w3;
	w3 = 0;
	
	do { //무조건 한번 실행하고 조건식으로 감 
		System.out.println("do while " +w3 );
		w3++;
	}while (w3 <5);
	
}

}
