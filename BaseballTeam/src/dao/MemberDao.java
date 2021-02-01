package dao;

import java.util.Scanner;

import cls.DataCls;
import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;

public class MemberDao {
	
	private static HumanDto memberBook[] = new HumanDto[100];
	Scanner sc = new Scanner(System.in);
	private int indexCount;
	private int number;
	private String name;
	private int age;
	private int height;
	
	public MemberDao() {
		
	}
	

	//짝수는 타자 홀수는 투수 
	public void insert() {
		System.out.println("데이터 등록 메뉴입니다");
		System.out.print("백넘버 = ");
		int number = sc.nextInt();
		this.number = number;
		
		if(number%2 == 0) {
			System.out.println("타자입니다");
			dataInput();
			System.out.print("batCount = ");
			int batCount = sc.nextInt();
			System.out.print("Hit = ");
			int hit = sc.nextInt();
			System.out.print("hitAvg = ");
			double hitAvg = sc.nextDouble();
			getMemberBook()[indexCount] = new BatterDto(number
					, name, age, height, batCount, hit, hitAvg);
					
		}else {
			System.out.println("투수입니다");
			dataInput();
			System.out.print("Win = ");
			int Win = sc.nextInt();
			System.out.print("Lose = ");
			int Lose = sc.nextInt();
			System.out.print("defence = ");
			double defence = sc.nextDouble();
			getMemberBook()[indexCount] = new PitcherDto(number, name, age
					, height, Win, Lose, defence);
		}
		indexCount++;
	}
	
	public void delete() {
		System.out.println("삭제메뉴입니다");
		int index = index();
		if(getMemberBook()[index].getNumber()%2 == 0) {
			getMemberBook()[index] = new BatterDto(0, "", 0, 0, 0, 0, 0.0);
		}else {
			getMemberBook()[index] = new PitcherDto(0, "", 0, 0, 0, 0, 0.0);
		}
		System.out.println(getMemberBook()[index].toString());
	}
	
	public int index() {
		int idx = -1;
		
		System.out.println("이름을 입력하세요");
		System.out.print(">>>");
		String data = sc.next();
		
		for (int i = 0; i < getMemberBook().length; i++) {
			if(getMemberBook()[i] != null 
					&& !getMemberBook()[i].getName().equals("")) {
				if(getMemberBook()[i].getName().equals(data)) {
					idx = i;
					System.out.println(idx);
					System.out.println(getMemberBook()[i].toString());
				}
			}
		}
		
		return idx;
	}
	
	public void update() {
		System.out.println("데이터업데이트 탭입니다");
		int idx = index();
		
		if(getMemberBook()[idx].getNumber()%2 == 0) {
			System.out.println("변경할 내용 :[1]넘버 [2]batCount [3]Hit [4]hitAvg");
			int select = sc.nextInt();
			switch(select) {
				case 1 : 
					System.out.print("새로운넘버 = ");
					int nNumber = sc.nextInt();
					getMemberBook()[idx].setNumber(nNumber); 
			}
		}else {
			System.out.println("변경할 내용 :[1]넘버 [2]Win [3]Lose [4]defence");
			int select = sc.nextInt();
			switch(select) {
				case 1 : 
					System.out.print("새로운넘버 = ");
					int nNumber = sc.nextInt();
					getMemberBook()[idx].setNumber(nNumber); 
			}
		}
		
		
		
		
		
	}
	
	public void allprint() {
		for (int i = 0; i < getMemberBook().length; i++) {
			if(getMemberBook()[i] != null 
					&& !getMemberBook()[i].getName().equals("")) {
				System.out.println(getMemberBook()[i].toString());
			}
		}
	}
	
	public void saveData() {
		DataCls.main(null);
		
	}
	
	public void dataInput() {
//		System.out.print("넘버 = ");
//		int number = sc.nextInt();
//		this.number = number;
		
		System.out.print("이름 = ");
		String name = sc.next();
		this.name = name;
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		this.age = age;
		
		System.out.print("키 = ");
		int height = sc.nextInt();
		this.height = height;
	}

	public static HumanDto[] getMemberBook() {
		return memberBook;
	}

	public static void setMemberBook(HumanDto memberBook[]) {
		MemberDao.memberBook = memberBook;
	}
	
	
	
		
		
}	
	

