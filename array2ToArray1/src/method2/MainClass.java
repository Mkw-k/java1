package method2;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		/*
		   2차원 배열 -> 1차원 배열로 변환 
		 	3 X 4     12 
		 */
		
		int array2[][] = {
				{11, 22, 33, 44},
				{55, 66, 77, 88},
				{99, 111, 222, 333}
		};
		
		int array1[] = array2ToArray1(array2);
		
		System.out.println(Arrays.toString(array1));
		
		
		// a b c -> 
				
				
								
		//암호화
		String str = "abc123";
		String result = encoding(str);
		System.out.println("암호화된 코드 : "+result);
				
		//복호화
		String base = descrambling(result);
		System.out.println("복호화된 코드 : "+base);
	}

	
	
	static int[] array2ToArray1(int array2[][]) {
		int array1[] = new int[array2.length * array2[0].length];
		
		for(int i = 0; i<array2.length; i++) {
			for(int j =0; j <array2[0].length; j++) {
				array1[array2[0].length*i+j] = array2[i][j];
				 
			}
		}
		return array1;
	}
	
	
	static String encoding (String src) {
		char[] abcCode ={ 
				'`','~','!','@','#', '$','%','^','&','*',
				'(',')','-','_','+', '=','|','[',']','{',
				'}',';',':',',','.', '/'
		};
		
		// 					0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t', 'y','u','i','o','p'};
		
		String result ="";
		
		for(int i = 0;i < src.length(); i++) {
			char c = src.charAt(i);
			int asc = (int)c;
			
			// 알파벳의 경우
			if(asc >= 97 && asc <= 122) {
				asc = asc - 97;	// 97 -> 0
				result = result + abcCode[asc];
			}			
			// 숫자의 경우
			if(asc >= 48 && asc <= 57) {
				asc = asc - 48;	// 48 -> 0
				result = result + numCode[asc];
			}
		}
		return result;
	}
	
	
	static String descrambling(String result) {
		char[] abcCode ={ 
				'`','~','!','@','#', '$','%','^','&','*',
				'(',')','-','_','+', '=','|','[',']','{',
				'}',';',':',',','.', '/'
		};
		
		// 					0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t', 'y','u','i','o','p'};
		
		String baseCode = "";
		
		for(int i = 0;i < result.length(); i++) {
			char c = result.charAt(i);
			int asc = (int)c;
			
			// 알파벳 -> 숫자가 암호화
			int index = 0;
			if(asc >= 97 && asc <= 122) {
				
				for(int j = 0;j < numCode.length; j++) {
					if(c == numCode[j]) {	// c == 'w'
						index = j;
						break;
					}					
				}
				
				index = index + 48;	// 0 -> 48
				baseCode = baseCode + (char)index;				
			}
			else {	// 기호 -> 알파벳이 암호화
				
				for(int j = 0;j < abcCode.length; j++) {
					if(c == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;				
				baseCode = baseCode + (char)index;
			}			
		}
		return baseCode;
		
	}

}
