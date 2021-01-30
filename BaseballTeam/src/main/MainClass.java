package main;

import java.util.Scanner;

import dao.MemberDao;

public class MainClass {

	public static void main(String[] args) {
	MemberDao dao = new MemberDao();
	Scanner sc = new Scanner(System.in);
	
total : while(true) {	
	System.out.println("메뉴를 선택하세요");
	System.out.println("[1]선수추가 [2]선수삭제 [3]선수검색 [4]선수수정 [5]저장 [6]종료");
	int menu = sc.nextInt();
	
	switch(menu) {
		case 1: 
			dao.insert();
			break;
		case 2: 
			dao.delete();
			break;
		case 3: 
			dao.index();
			break;
		case 4: 
			dao.update();
			break;
		case 5:
			dao.saveData();
			break;
		case 6: 
			System.out.println("종료합니다");
			break total;
	}
}	

	}//end main

}//end class
