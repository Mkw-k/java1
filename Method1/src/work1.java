
public class work1 {

	public static void main(String[] args) {
		
		// ASCII code -> 알파벳 
		char c = ascToChar(65);
		System.out.println("c = "+ c);
		
		// 알파벳 -> ASCII code 
		int a = charToAsc('a');
		System.out.println("a = "+ a);
		
		// 소수/정수 -> true/false
		double dnum = 1234.567;
		boolean b = isDouble(dnum +"");   //.5654     3215561.
		if(b) {
			System.out.println("소수입니다");
		}else {
			System.out.println("정수입니다");
		}
		
	}
	
	static int charToAsc(char c) {
		int asc = (int)c;
		return asc;
	}

	static char ascToChar(int asc) {
		return (char)asc;
	}
	
	static boolean isDouble(String snum) {
		boolean b = false;
		for (int i = 0; i < snum.length(); i++) {
			char c= snum.charAt(i);
			if(c == '.') {
				b = true;
				break;
			}
		}
		return b;
	}
	
	
	
	
//	private static void truefalse() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void asConvert() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void alConvert(int num) {
//		char al = Charcter.toChars(num);	
//		char c = al.charAt(0);
//		System.out.println(c);
//	}
//	
	

}
