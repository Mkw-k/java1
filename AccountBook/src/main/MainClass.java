package main;

import java.util.ArrayList;
import java.util.Scanner;

import dao.accountDao;
import dto.accountDto;

public class MainClass {

	public static void main(String[] args) {
		/*
			가계부
			
			날짜(Calendar), 용도, 분류(수입/지출), 금액, 내용 
			date use  classify      money meno
			
			menu
			
			추가
			삭제
			검색
			수정
			모두 출력
			종료

		*/	
		
		// menu
		accountDao dao = new accountDao();
		ArrayList<accountDto> dto = new ArrayList<accountDto>();
		
		
		
	total : while(true) {
		System.out.println("메뉴를 입력하세요");
		System.out.println("[1]데이터추가 [2]데이터삭제 [3]데이터검색 [4]데이터수정 [5]모두출력 [6]종료");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1: 
				
				break;
			case 2: 
				dao.delete();
				break;
			case 3: 
				dao.select();
				break;
			case 4: 
				dao.update();
				break;
			case 5: 
				dao.allprint();
				break;
			case 6: 
				System.out.println("종료합니다");
				break total;
		}
	}
		
	/*	
		dao.allprint();
		
		dao.delete();
		
		dao.allprint();
		
		dao.update();
		
		dao.allprint();
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 형식		
		/*
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
		
		Calendar cal = Calendar.getInstance();		
		
		String ftime1 = format1.format(cal.getTime());
		String ftime2 = format2.format(cal.getTime());
		
		System.out.println(ftime1);
		System.out.println(ftime2);
		*/
	}

}





