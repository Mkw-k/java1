package dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

import dto.accountDto;

public class accountDao {
	accountDto accountBook[] = new accountDto[100];
	int indexcount = 0;
	Scanner sc = new Scanner(System.in);
	
	//날짜, 용도, 분류(수입/지출), 금액, 내용 
	//date use classify     money memo 
	
	public void insert() {
		
		System.out.println("데이터 입력");
		System.out.print("용도 = ");
		String use = sc.next();
		System.out.println("분류 [1]수입 [2]지출");
		int cla = sc.nextInt();
		String classify = ((cla == 1)? "수입" : "지출");
		System.out.print("금액 = ");
		int money = sc.nextInt();
		System.out.print("내용 = ");
		String memo = sc.next();
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		Calendar cal = Calendar.getInstance();
		String dateTime = f.format(cal.getTime());
		
		accountBook[indexcount] = new accountDto(dateTime, use, classify, money, memo);
		
		indexcount++;
		
		
		
	}

	public void delete() {
		System.out.println("======데이터삭제=======");
		System.out.println("검색할 데이터의 내용을 입력하세요");
		String use = sc.next();
		int index = search(use);
		accountBook[index] = new accountDto("", "", "", 0, "");
		System.out.println("데이터삭제완료");
	}

	public void select() {
		System.out.println("=====데이터선택출력=====");
		System.out.println("날짜를 입력하세요");
		System.out.print("월 = ");
		int month = sc.nextInt();
		System.out.print("일 = ");
		int day = sc.nextInt();
		
		String smonth = (month<10)? "0" +month:""+month;
		String sday = (day<10)? "0"+day:""+day;
		
		
		
		int idx = -1;
		for (int i = 0; i < accountBook.length; i++) {
			if(accountBook[i]!=null && !accountBook[i].getClassify().equals("")) {
				accountDto dto = accountBook[i];
				String dateTime = dto.getDateTime();
				String monthday = dateTime.substring(6, 13); //yyyy년 MM월 dd일 HH시 mm분 ss초
				String searchTime = smonth +"월 "+ sday+"일";
				
				if(monthday.equals(searchTime)) {
					System.out.println(dto.toString());
				}
				
			}
				
		}
	
		
	}

	public void update() {
		System.out.println("======데이터변경=======");
		System.out.println("검색할 데이터의 내용을 입력하세요");
		String use = sc.next();
		int index = search(use);
		
		System.out.print("금액을 새로 입력하세요 = ");
		int newMoney = sc.nextInt();
		accountBook[index].setMoney(newMoney);
	}

	public int search(String use) {
		int idx = -1;
		for (int i = 0; i < accountBook.length; i++) {
			if(accountBook[i]!=null 
					&& !accountBook[i].getClassify().equals("")) {
				if(accountBook[i].getUse().equals(use)) {
					idx=i;
				}
			}
				
		}
		return idx; 
	}
	
	public void allprint() {
		for (int i = 0; i < accountBook.length; i++) {
			if(accountBook[i] != null 
					&& !accountBook[i].getClassify().equals("")) {
				System.out.println(accountBook[i].toString());
			}
		}
	}
	
	
}
