package work5;

public class Array05 {

	public static void main(String[] args) {
		// abcdefghijklmnopqrstuvwxyz
		char[] abcCode = {'`','~','!','@','#','$','%','^','&','*','(',')','-','_',
				'+','=','|','[', ']','{','}',';',':',',','.','/'};
		``
		char[] spel = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
				'p','q','r','s','t','u','v','w','x','y','z'};
		
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String[] sum = new String[6];
		
		
		String src = "shk4512";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			int asc = (int)ch;
		
			// 알파벳의 경우 
			if(asc >= 97 && asc <= 122) {
				asc = asc - 97; //97 -> 0
				result = result + abcCode[asc];
			}
				
			// 숫자의 경우
			if(asc >= 48 && asc <=57) {
				asc = asc - 48; //48 ->0
				result = result + numCode[asc];
				
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		//복호화 
		String baseCode = "";
		
		for(int i =0; i < result.length(); i++) {
			char c = result.charAt(i);
			int asc = (int)c;
			
			//알파벳 -> 숫자가 암호화 
			int index = 0;
			if(asc >= 97 && asc <= 122) {
				
				for(int j = 0; j < numCode.length; j++) {
					if(c == numCode[j]) { // c == 'w'
						index = j;
						break;
					}
				}
				index = index +48; //0 -> 48 
				baseCode = baseCode + (char)index;
			}
			else { //기호 -> 알파벳이 암호화 
				
				for(int j = 0; j < abcCode.length; j++) {
					if(c == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;
				
				baseCode = baseCode + (char)index;
			}
		}
		System.out.println("복호화: "+baseCode);
	
	}
}
		
		
		
		
		
		
		//		for(int i=0; i < src.length();i++) {
//			char ch = src.charAt(i);
//			System.out.println(ch);
//			
//			if(ch == spel[i]) {
//				ch = abcCode[i];
//				}
//			else {
//				ch = numCode[i-2];
//				}
//			
//			
//			sum[i] = String.valueOf(ch);
//			result = result + sum[i];
//			
//			
////		result = String.valueOf(ch);
//			}
//		System.out.println("src:"+src);
//		System.out.println("result:"+result);
//		
//		}
////	[실행결과]
////	src:abc123
////	result:`~!wer						
//	}



//	String 입력 
// 모두 숫자?
// 문자가 있는지?

//숫자입니다
//숫자가 아닙니다 .

// ->123a3 -> 숫자가 아닙니다 
// -> 345 -> 숫자입니다



