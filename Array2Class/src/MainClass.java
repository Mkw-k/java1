
public class MainClass {

	public static void main(String[] args) {
		
		/*
		    Array : 같은 자료형 변수들의 묶음이다. 
		           	관리는 index number로 관리된다. 
		           	동적으로 할당된 후에 정적으로 사용된다. 
		           	
		           	
		    int array[] = new int[10];    //할당
		    array[0] = 1; //값을 따로따로 
		    
		    int array[] = {1, 2, 3, 4, 5 };  //초기화 
		    
		    int array2[][] = new int[3][4];
		    int []array2[] = new int[3][4];
		    int [][]array2 = new int[3][4];
		    
		    int array2[3][4] = { //숫자 기입하는거 아님 설명을 위해서 기입해놓은거 
		    { 1, 2, 3, 4},
		    {5, 6, 7, 8},
		    {9, 10, 11, 12}
		    };
		 */
		
		
		int Array2[][] = new int [3][];
		
		int Array01[] = {1, 2, 3, 4};
		Array2[0] = Array01;
		
		int Array02[] = {5, 6, 7};
		Array2[1] = Array02;
		
		int Array03[] = {8, 9};
		Array2[2] = Array03;
		
		/*
		 int Array2[][] = {
		   {1, 2, 3, 4},             4
		   {5, 6, 7},                3
		   {8, 9}                    2
		 };
		 
		 */
		
		System.out.println(Array2[2][1]);
		
		int Array21[][] = new int[2][3];
		
		Array21[0][0] = 1;
		Array21[0][1] = 2;
		Array21[0][2] = 3;
		
		Array21[1][0] = 4;
		Array21[1][1] = 5;
		Array21[1][2] = 6;
		
		/*
		    int Array21[][] = {
		    {1, 2, 3},
		    {4, 5, 6} 
		  };
		 */
		
		System.out.println(Array21.length);
		System.out.println(Array21[0].length);
		
		1. 알고리즘 (기술면접)    일주일에 많으면 2개 적으면 1개 
		2. 포트 폴리오 적어도 2개이상 
		3. 
		->인성 

	}

}
