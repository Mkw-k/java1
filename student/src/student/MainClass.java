package student;

import java.util.Arrays;
import java.util.Scanner;

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
		
		int array1[] = new int[array2.length * array2[0].length];
		
		System.out.println(array1.length);
		
		/*										4
		  array2[0][0] -> array1[0]    array2[0].length*i+j
		  array2[0][1] -> array1[1]
		  array2[0][2] -> array1[2]
		  array2[0][3] -> array1[3]
		  
		  array2[1][0] -> array1[4]		array2[0].length*i+j
		  array2[1][1] -> array1[5]
		  		 i  j 
		 */
		for(int i = 0; i<array2.length; i++) {
			for(int j =0; j <array2[0].length; j++) {
				array1[array2[0].length*i+j] = array2[i][j];
				 
			}
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(array1);
	}
	
	
	
	
	
	
	public static void main01(String[] args) {
	/*
	   2차원 배열 -> 1차원 배열로 변환 
	 	3 X 4     12 
	 */
	
	/*
	     학생성적관리
	     
	     몇명? <- 입력
	     과목 ((이름), 국어, 영어, 수학)
	    
	   총점 
	   평균 
	   수학 점수 최고점 
	   영어 점수 최하점 
	     
	     
	 */
		Scanner sc = new Scanner(System.in);
		
		//몇명? <- 입력
		System.out.print("학생의 총수는 = ?");
		int i = sc.nextInt();
		
		int man[][] = new int[i][3];
		String subj = "";
		int sum = 0;
		int avg = 0;
        int max, min; 
        int j, k;
        
        //이름
        
		
		//과목 ((이름), 국어, 영어, 수학)
		//국어 영어 수학
		for(j = 0; j<man.length; j++) {
			for(k = 0; k<man[0].length; k++) {
				if(k == 0) {
					subj = "국어";
				}
				else if (k==1) {
					subj = "영어";
				}
				else if (k==2) {
					subj = "수학";
				}
				
				System.out.print((j+1)+"번째 학생의 "+subj+"과목의 점수는 = ");
				man[j][k] = sc.nextInt();
			}
		}
				
		//총점
		for(j = 0; j<man.length; j++) {
			sum=0;
			for(k = 0; k<man[0].length; k++) {
				sum = sum +man[j][k];
			}
			System.out.println(j+"번째 학생의 총점은 "+sum+"입니다");
		}
		
		
		//평균
		for(j = 0; j<man.length; j++) {
			sum=0;
			avg=0;
			for(k = 0; k<man[0].length; k++) {
				sum = sum +man[j][k];
				
			}
			
				avg = sum/man[0].length;
				
			System.out.println(j+"번째 학생의 평균은 "+avg+"입니다");
		}
		
		//수학 점수 최고점 
		k=2; 
        max = man[0][0]; 
        j = 0;
      
        for (j = 0; j < man.length; j++) {
            if (man[j][k] > max) {
                max = man[j][k];
            }
        }
        System.out.println("수학점수의 최고점은 "+max+" 점 입니다.");
		
		
		//영어 점수 최하점 
        k=1; 
        min = man[0][0];
        for (j = 0; j < man.length; j++) {
            if (man[j][k] < min) {
                min = man[j][k];
            }
        }
        System.out.println("영어점수의 최하점은 "+min+" 점 입니다.");
	}
}












