package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import dto.accountDto;

public class listDao {
	
/*
	추가
	삭제
	검색
	수정
	모두 출력
*/
	
	public ArrayList<accountDto> dto = new ArrayList<accountDto>();
	Scanner sc = new Scanner(System.in);
	accountDto dt;
	
	//추가
	public void insert() {
		int c = 0;
		String use = "";
		String classify = ""; 
		int money = 0;
		String memo = "";
		
		while(true) {
		System.out.print("지출(1)/수입(2) = ");
		
			try {
				c = sc.nextInt();
			
			
			if( c == 1 || c == 2) {
				System.out.println("바로 입력하셨습니다");
				
			}
			else {
				System.out.println("잘못입력했습니다");
				return;
			}
	
		
		classify = (c == 1)?"지출":"수입";
		
		System.out.print("금액 = ");
		money = sc.nextInt();
		
		System.out.print("사용처 = ");
		use = sc.next();
		
		System.out.print("memo = ");
		memo = sc.next();
		
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
			sc.nextLine();
		}
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
		Calendar cal = Calendar.getInstance();	
		String dateTime = f.format(cal.getTime()); // 2021년 01월 28일 10시42분51초
		
		dto.add(new accountDto(dateTime, use, classify, money, memo));
		break;
	}
	}
	
	public void delete() {
		System.out.print("삭제할 데이터 = ");
		String use = sc.next();
		
		int index = search(use);
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		dto.remove(index);
		
		System.out.println("데이터를 삭제 하였습니다");

	}
	
	
	public int search(String use) {
		
		int index = -1;
		int cnt = 0;
		for (accountDto dt : dto) {
			if(dt.getUse().contains(use)) {
				index = cnt;
				break;
			}
			cnt++;
		}
		return index;
	}
	
	public void print(int index) {
	
		System.out.println(dto.get(index));
	}
	
	public void update() {
		System.out.print("수정할 데이터 = ");
		String use = sc.next();
		
		int index = search(use);
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		System.out.print("수정할 금액 = ");
		int money = sc.nextInt();
		dto.get(index).setMoney(money);    
		System.out.println("수정되었습니다");	
	}
	
	public void allprint() {
		
		for (accountDto a : dto) {
			System.out.println(a);
		}
	}
}
