package report01;

public class report03 {

	public static void main(String[] args) {
		
		
//		int[] data = {-3,-2,-9,-4,-7}; 이럴수도 있어서 초기화는 arr[0];부터
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		int m = max(data);
		System.out.println("최대값:"+m);
	}

	 static int max(int[] arr) { //가상인수 파라미터 arr은 
		// TODO Auto-generated method stub
//		 int m = 0;
		 int m = arr[0];
		 System.out.println(arr[1]);
		 
		 for (int i = 0; i < arr.length; i++) {
			if(m < arr[i]) {
				m = arr[i];
			}
		}
		return m;
	}

	
//	static int max(int[] data) {
//		int max = 0;
//		for (int i = 0; i < data.length; i++) {
//				max = data[0];
//			if(data[i] > max) {
//				max = data[i];
//				break;
//				
//			}
//			
//		}
//		return max;
//		
//	}
	
}
