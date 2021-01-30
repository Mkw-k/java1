import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
				
		/*
			학생성적관리			
			과목 ((이름,) 국어, 영어, 수학)	- column(항목)
		*/		
		String student[][] = null;
		int sum;
		
		// 1.입력
		student = userInput();
		
		// 2.총점
		sum = studentSum(student);
				
		// 3.평균
		studentAvg(student, sum);
				
		// 4.수학점수 최고점수
		mathTop(student);
				
		// 5.영어점수 최하점수
	}
	
	static String[][] userInput(){
		Scanner sc = new Scanner(System.in);
		
		String[][] student = null;
		
		System.out.print("몇명의 학생 = ");
		int count = sc.nextInt();
		
		student = new String[count][4];
				
		for (int i = 0; i < student.length; i++) { // 학생수			
			System.out.print("이름 = ");
			student[i][0] = sc.next();
			
			System.out.print("국어 = ");
			student[i][1] = sc.next();
			
			System.out.print("영어 = ");
			student[i][2] = sc.next();
			
			System.out.print("수학 = ");
			student[i][3] = sc.next();
		}
		
		return student;
	}
	
	static int studentSum(String student[][]) {
		int sum = 0;
		int _student[][] = new int[student.length][3];
		
		// String -> Integer
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length - 1; j++) {
				_student[i][j] = Integer.parseInt(student[i][j + 1]);				
			}
		}
		
		// 합계
		for (int i = 0; i < _student.length; i++) {
			for (int j = 0; j < _student[i].length; j++) {
				sum = sum + _student[i][j];
			}
		}
		
		System.out.println("총점의 합계:" + sum);
		
		return sum;
	}
	
	static void studentAvg(String student[][], int sum) {
		double avg = 0.0;		
		avg = sum / student.length;
		
		System.out.println("학생성적의 평균:" + avg);
	}
	
	static void mathTop(String student[][]) {		
		int math[] = new int[student.length];
		
		for (int i = 0; i < student.length; i++) {
			math[i] = Integer.parseInt(student[i][3]);
		}
		
		int max = math[0];
		int index = 0;
		for (int i = 0; i < math.length; i++) {
			if(max < math[i]) {
				max = math[i];
				index = i;	// 누구?
			}
		}
		
		System.out.println("수학 최고점수:" + max);
		System.out.println("학생 명:" + student[index][0]);
		
	}

}

















