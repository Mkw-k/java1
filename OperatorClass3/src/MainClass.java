
public class MainClass {

	public static void main(String[] args) {
	  
		/*
		 
		 bit 연산 : 0, 1     -> 2진수 
		 
		 &  		AND
		 |			OR    듈중 하나만 트루면 트루 
		 ^			XOR   서로 같지 않을 때만 트루 
		 <<			LEFT SHIFT
		 >>			RIGHT SHIFT
		 ~			NOT
		 
		 2 진수 
		 1  1  0  1
		  		  2의 0승	
		 		  1 * 1	 =1
		 	   2의 1승
		 	   0*2 = 0 
		    2의 2승 
		    1*4 = 4
		  2의 3승
		  1*8  	   = 8	    -> 13
		  
		  
		  
		  1100 1010 
		  8421 8421
           12   10 
         16의 1승 16의 0승 
           C     A
         
         12*16 + 10 *1 -> 192+10 -> 202
         
         1110 0011
         8421 8421 
         14   3      
         E    3     
         
         0x7A
         
         8421 8421
         0111 1010
		  
		 */
		
		
		int number;
		
		//AND 
		number = 0x71 & 0x85;
	
		/*
		 0x71
		 
		 8421 8421						연산
		 0111 0001                    0111 0001
		                              1000 0101
		 0x85                         0000 0001
		 
		 8421 8421
		 1000 0101
		 */
		System.out.println("number = "+number);
		System.out.printf("0x%x \n", number);
		
		
		
		//OR
		number = 0xD2 | 0x3B;
		
		/*
		       0xD2
		       														      연산
		       13   2 												1101 0010
		       8421 8421 											0011 1011
		       1101 0010											1111 1011
		       														F     B
		      
		       0x3B
		 		
		 	   0011 1011
		 	   8421 8421
		 
		 */
		System.out.println("number = "+number);
		System.out.printf("0x%x \n", number);
		
		//XOR       비트가 다를때만 트루가 된다 
		number = 0xAB ^ 0x74;  //암호화 
		
		/*
		  
		   0xAB 
		     10  11                
		    8421 8421                               T T   FALSE(0)
		    1010 1011                               T F   TRUE(1)            
		                                            F T   TRUE
		    0x74                                    T T   FALSE
		    
		    8421 8421
		    0111 0100									 1010 1011     
		    											 0111 0100 -> KEY 값	
		    											 1101 1111 -> D  F    0xDF   암호화
		    											 13   15
		    											 
		    											 0111 0100 -> KEY 값 
		    											 1101 1111
		    											 1010 1011 ->                복호화 
		 */
		System.out.println("number = "+number);
		System.out.printf("0x%x \n", number);
		
		number = 0xDF ^ 0x74;   //복호화 
		System.out.printf("0x%x \n", number);
		
		
		//left shift == *2
		/*
		  0001	-> 1
		  0010  -> 2
		  0100  -> 4 
		  1000  -> 8 
		  
		  right shift
		  1010 -> 0101
		  
		 */
		
		byte by; 
		by = 0x1 << 2;
		System.out.println(by);
		
		//right shift == /2
		by = 0x8 >> 3;
		System.out.println(by);
		
		//~반전    0 -> 1   1 -> 0  
		by = ~0x55;
		
		/*
		     8421 8421 
		     0101 0101 
		     
		     0101 0101
		  ~  1010 1010 
		     A    A     
		 
		 */
		System.out.printf("0x%x \n", by);
		
		int num2;
		
		num2 = 0x3b & 0x7F;
		System.out.printf("0x%x \n", num2);
		
		num2 = 0x3b | 0x7F;
		System.out.printf("0x%x \n", num2);
		
		num2 = 0x3b ^ 0x7F;
		System.out.printf("0x%x \n", num2);
		
		
		
		num2 = 0X6D & 0X9E;
		System.out.printf("0x%x \n", num2);
		
		num2 = 0X6D | 0X9E;
		System.out.printf("0x%x \n", num2);
		
		num2 = 0X6D ^ 0X9E;
		System.out.printf("0x%x \n", num2);
		
		
		num2 = 0X7A & 0X3C;
		System.out.printf("0x%x \n", num2);
		
		num2 = 0X7A | 0X3C;
		System.out.printf("0x%x \n", num2);
		
		num2 = 0X7A ^ 0X3C;
		System.out.printf("0x%x \n", num2);
		
		by = 3 <<34;     //int 는 32bit 이므로 33번 쉬프트 하지않음 2번만 쉬프트함 
		System.out.println(by);
		System.out.printf("0x%x \n", by);
		
	}

}
