package main;

import ball.Baseball;

public class MainClass {
	public static void main(String[] args) {
		
		Baseball ball = new Baseball();
		
		ball.init();
		ball.bRandom();
		
		ball.loop();
		
		ball.resultPrint();

		
	}
}
