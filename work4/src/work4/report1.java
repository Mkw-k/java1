package work4;

public class report1 {

	public static void main(String[] args) {
		
		//1~1000 사이에 수를 전부 합친 값을 출력하라
					
                   int sum = 0;
        		  
        		  for(int i=1; i<= 1000; i++ ) {
        			  	sum = sum + i;
        		  }
        		  	System.out.println("결과값은 " + sum+ " 입니다");
        		  	
        		  	sum = 0;
        		  	int n = 0;
        		  	for(int i =0; i <1000; i++) {
        		  		n++;
        		  		sum = sum +n;
        		  	}
        		  	System.out.println("결과값은 " + sum+ " 입니다");
        		  	
        		  	
	}

}
