package main;

import java.util.Scanner;

import Dto.memberDto;

public class MainClass {
	
	
	
	public static void main(String[] args) {
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
		
	
	
		
		//추가
		memberDto[] md = new memberDto[100];
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < md.length; i++) {
			if(b=true) {
				if(md[i]==null) {
			md[i] = new memberDto();
				}
			}
			System.out.println("그만 입력하려면 n");
			String choice = sc.next();
			if(choice.equals("n")|| choice.equals("N")) {
				break;
			}
		}
		
		
		
		//모두 출력
		for (int i = 0; i < md.length; i++) {
			if(md[i].getDate()!=null) {
				md[i].toString();
				}		
			}
		
		
		
		//검색
//		System.out.println("검색할 날짜를 입력하세요");
//		String input = sc.next(); 
//		for (int i = 0; i < md.length; i++) {
//		 
//			if(md[i].getDate().equals(input)) {
//				md[i].disp();
//			}
//		}
		
//		//삭제
//		int idx = -1;
//		System.out.println("검색할 날짜를 입력하세요");
//		input = sc.next(); 
//		for (int i = 0; i < md.length; i++) {
//			if(md[i].getDate().equals(input)) {
//				md[i].delete();;
//			}
//		}
//		
//		//수정
//		System.out.println("검색할 날짜를 입력하세요");
//		input = sc.next(); 
//		for (int i = 0; i < md.length; i++) {
//			if(md[i].getDate().equals(input)) {
//				md[i]=new memberDto();
//			}
//		}
//		
	
	}//end main
	
	
	
	

}//end class
