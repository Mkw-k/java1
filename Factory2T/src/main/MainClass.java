package main;

import person.Person;
import types.Atype;
import types.Btype;

public class MainClass {
	public static void main(String[] args) {
		
		Person char1 = new Person();
		char1.create(new Atype());
		
		Person char2 = new Person();
		char2.create(new Btype());
		
		char1.mWeapon.drawWeapon();
		char1.mBomb.drawBomb();
		
		char2.mWeapon.drawWeapon();
		char2.mBomb.drawBomb();
		
	}
}





