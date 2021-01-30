package work5;

public class Array02 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		int total = 0;
		float average = 0;
//		System.out.println(arr.length);    4
//		System.out.println(arr[0].length);     5
		
		//알맞은 코드를 넣어 완성 하시오. 
//		for( int i = 0; i<arr.length; i++) {
//			for(int j =0; j<arr[0].length; j++) {
//				total = total + arr[i][j];
//				average = (total/(arr.length*arr[0].length));
//			}
//		}
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				total = total +arr[i][j];
				
			}
		}
	 average =(float)total / (arr.length * arr[0].length);
		
		System.out.println("total = "+total);
		System.out.println("average = "+average);
		

		//실행결과 total = 325 average = 16.25
		
	}//end main

}//end class
