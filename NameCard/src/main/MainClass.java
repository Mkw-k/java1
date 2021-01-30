package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhoneCard;

public class MainClass {

	public static void main(String[] args) {
		
		NameCard ncard = new NameCard("홍길동", "123-1321", "고명우@한메일");

		ncard.setPrintNameCard(new PrintNameCard());
		ncard.print();
		
		ncard.setPrintNamePhoneCard(new PrintNamePhoneCard());
		ncard.printPhone();
	}

}
