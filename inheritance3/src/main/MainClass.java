package main;

import cls.ChildOne;
import cls.ChildThree;
import cls.ChildTwo;
import cls.SuperClass;

public class MainClass {

	public static void main(String[] args) {
		
		SuperClass sc1 = new ChildOne();
		SuperClass sc2 = new ChildTwo();
		SuperClass sc3 = new ChildThree();
		
		SuperClass scArr[] = new SuperClass[5];
		scArr[0] = new ChildOne();
		scArr[1] = new ChildTwo();
		scArr[2] = new ChildThree();
		scArr[3] = new ChildThree();
		scArr[4] = new ChildTwo();
		
		
//		for (int i = 0; i < scArr.length; i++) {
//			scArr[i].method();
//		}
		
//		ChildOne o = (ChildOne)scArr[0];
//		o.oneFunc();
		
		//instanceof 부모클래스의 인스턴스로 생성된 자식 클래스의 인스턴스를 찾아주는 예약어 
		
		for (int i = 0; i < scArr.length; i++) {
			if(scArr[i] instanceof ChildOne) {
				System.out.println("scArr[0]는 ChiildOne으로 생성되었습니다");
			}
			else if(scArr[i] instanceof ChildTwo) {
				System.out.println("scArr["+i+"]는 ChiildTwo으로 생성되었습니다");
			}
			else if(scArr[i] instanceof ChildThree) {
				System.out.println("scArr["+i+"]는 ChiildThree으로 생성되었습니다");
			}
		}
		
		
		ChildOne oneArr[] = new ChildOne[3];
		ChildTwo TwoArr[] = new ChildTwo[3];
//		ChildTwo ThreeArr[] = new ChildThree[3];
		
		

	}

}
