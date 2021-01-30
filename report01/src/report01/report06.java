package report01;

public class report06 {

	public static void main(String[] args) {
		int num1, num2;
		int result, tag[] = new int[1];
		num1 = 9;
		num2 = 4;
		
		result = getResult(num1,num2, tag);
		
		System.out.println("몫 :"+result+" 나머지 :"+tag[0]);
		
		//result = 몫, tag = 나머지

	}
	
	static int getResult(int num1, int num2, int tag[]) {
		int r; 
		r = num1/num2;  //몫
		tag[0] = num1 % num2;
		
		return r;
		
	}
	
//	static int getResult(int num1,int num2) {
//		int result = num1/num2;
//		return result;
//	}
//	
//	static int getTag(int num1,int num2) {
//		int tag = num1%num2;
//		return tag;
//		
//	}

}
