package main;

import dao.accountDao;

public class MainClass {

	public static void main(String[] args) {
		accountDao dao = new accountDao();
		dao.insert();
		dao.insert();
//		dao.allprint();
//		dao.delete();
//		dao.allprint();
//		dao.update();
		dao.allprint();
		dao.select();
		
			
		
	}

}
