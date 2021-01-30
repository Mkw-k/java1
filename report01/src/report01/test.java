package report01;

public class test {

	public static void main(String[] args) {
//		int[] data = {-3,-2,-9,-4,-7}; //이럴수도 있어서 초기화는 arr[0];부터
		int[] data = {3,2,9,4,7};
		for (int i = 0; i < arr.length; i++) {
			
		}
		System.out.println(java.util.Arrays.toString(data));
		
		
		
//		int m = max(data);
//		System.out.println("최대값:"+m);
	}
	
	
	
	
}
	

static int max(int[] arr) { //가상인수 파라미터 arr은 
	// TODO Auto-generated method stub
//	 int m = 0;
	 int m = arr[0];
	 
	 for (int i = 0; i < arr.length; i++) {
		if(m < arr[i]) {
			m = arr[i];
		}
	}
	return m;
}

	
	
	
	
	
	
	public static void main01(String[] args) {
//			int num1 = 11;
//			int num2 = 5;
//			int tag = num1%num2;
//			 
//			System.out.println(tag);
			
		int num1, num2;
		int result, tag[] = new int[1];
		num1 = 9;
		num2 = 4;
		
		result = getResult(num1,num2, tag);
		
		System.out.println("몫 :"+result+" 나머지: "+tag[0]);
		
		//result = 몫, tag = 나머지

	}

	 static int getResult(int num1, int num2, int[] tag) {
		int r = num1/num2;
		tag[0] = num1%num2;
		
		return r;
	}
	
	

	}


