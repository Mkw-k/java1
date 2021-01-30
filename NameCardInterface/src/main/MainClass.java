package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhoneCard;
import cls.PrintNamePhoneEmailCard;

public class MainClass {
	public static void main(String[] args) {
		
		NameCard ncard = new NameCard("성춘향", "234-5678", "sch@naver.com");
		
		ncard.setPrintNameCard(new PrintNameCard());
		ncard.print();
		
		ncard.setPrintNameCard(new PrintNamePhoneCard());
		ncard.print();
		
		ncard.setPrintNameCard(new PrintNamePhoneEmailCard());
		ncard.print();
		
	}
}




