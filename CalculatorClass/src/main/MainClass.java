package main;

import cal.Calculator;

public class MainClass {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		int n1 = cal.numberInput("첫번째수");
		String oper = cal.operatorInput();
		int n2 = cal.numberInput("두번째수");
		
		cal.processing(n1, n2, oper);
		
		cal.resultPrint();

	}

}
