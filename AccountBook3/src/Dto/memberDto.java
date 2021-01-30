package Dto;

import java.util.Scanner;

/*
	가계부 
	
	날짜, 용도, 분류(수입/지출), 금액, 내용 
	date use classify     money memo 
	
	추가
	삭제
	검색
	수정
	모두 출력 
	종료 

*/
//배열

//data Input
public class memberDto {
	String date;
	String use;
	String classify;
	int money;
	String memo;
	
	public memberDto() {
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜=");
		this.date = sc.next();
		System.out.print("용도=");
		this.use = sc.next();
		System.out.print("분류(수입/지출)=");
		this.classify = sc.next();
		System.out.print("금액=");
		this.money =sc.nextInt();
		System.out.print("내용=");
		this.memo = sc.next();
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "memberDto [date=" + date + ", use=" + use + ", classify=" + classify + ", money=" + money + ", memo="
				+ memo + "]";
	}

	public void disp() {
		System.out.println("날짜 : "+date);
		System.out.print("용도 : "+use);
		System.out.print("분류(수입/지출) : "+classify);
		System.out.print("금액 : "+money);
		System.out.print("내용 : "+memo);
	}
	
	
	public void delete() {
		this.date = null;
		
		this.use = null;
	
		this.classify = null;

		this.money = 0;
	
		this.memo = null;
	}
	

	
}















