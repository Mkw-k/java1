package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import dao.accountDao;

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
		
		dao.insert();
		dao.insert();
		
		dao.select();
		
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





