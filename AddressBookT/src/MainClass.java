import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
			주소록
			
			column : 이름, 나이, 전화번호, 주소, 내용
					홍길동   24   123-4567 서울시 고교동창	""
					
			배열 : row = 100	
			
			Menu
			1. 친구추가
			2. 친구삭제
			3. 친구검색
			4. 친구수정
			5. 모든 데이터 출력
			6. 종료	
		*/
		
		String Member[][] = new String[100][5];
		int mCount = 0;
		
		while(true) {
			// 메뉴
			System.out.println("menu----------------");
			System.out.println("1.친구추가");
			System.out.println("2.친구삭제");
			System.out.println("3.친구검색");
			System.out.println("4.친구수정");
			System.out.println("5.모든 데이터 출력");
			System.out.println("6.종료");
			
			// 입력 1 ~ 6
			System.out.print(">>");
			int worknum = sc.nextInt();
			
			switch( worknum ) {
				case 1:
					insert( Member, mCount );
					mCount++;
					break;	
					
				case 5:
					allprint( Member );
					break;
			}			
		}
	}
	
	static void insert(String mem[][], int mCnt) {
		Scanner sc = new Scanner(System.in);
		// 이름, 나이, 전화번호, 주소, 내용
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		String age = sc.next();
		
		System.out.print("전화번호 = ");
		String phone = sc.next();
		
		System.out.print("주소 = ");
		String address = sc.next();
		
		System.out.print("내용 = ");
		String content = sc.next();
		
		mem[mCnt][0] = name;
		mem[mCnt][1] = age;
		mem[mCnt][2] = phone;
		mem[mCnt][3] = address;
		mem[mCnt][4] = content;
	}
	
	static void allprint( String mem[][] ) {		
		for (int i = 0; i < mem.length; i++) {
			for (int j = 0; j < mem[i].length; j++) {
				if(mem[i][j] != null) {
					System.out.print(mem[i][j] + " ");	
					if(j == 4) {
						System.out.println();
					}
				}
			}
		}
	}

}



