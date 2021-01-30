package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhoneCard;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NameCard ncard = new NameCard("성춘향", "231-213", "chs@naver.com");
		
		ncard.setPrintNameCard(new PrintNameCard());
		ncard.print();
		
		ncard.setPrintNameCard(new PrintNamePhoneCard());
		ncard.print();
	}

}
