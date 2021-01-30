package main;

import dto.MemberDto;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열
		MemberDto memArr[] =new MemberDto[100];
		
		//객체생성
		memArr[0] = new MemberDto();

		//추가 
		memArr[0].setName("홍길동");
		memArr[0].setAge(24);
		memArr[0].setPhone("123-4567");
		memArr[0].setAdress("서울시");
		memArr[0].setContent("친구");
		
		System.out.println(memArr[0].getAdress());
		
		System.out.println(memArr[0].toString());
	}

}
