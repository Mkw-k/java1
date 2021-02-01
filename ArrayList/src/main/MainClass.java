package main;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	collection : 수집 
		 	
		 	List :  목록 
		 		ArrayList
		 		 	배열처럼 사용할 수 있는 리스트 
		 		 	선형구조 				O-O-O-O-O
		 		 	검색속도가 빠르다 
		 		 	index로 접근한다 
		 		
		 		LinkedList
		 			추가/삭제 속도가 빠르다 
		 			실시간일땐 빠르다 (게임같은거 예시:총알)
		 		
		 		
		 	Map  : 
		 		
		 		HashMap
		 		
		 		TreeMap
		 		
		 	//Set  ==  집합
		 		
		 
		 */
		
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		//추가 
		arrlist.add(111);
		
		Integer in = new Integer(222);
		arrlist.add(in);
		
		arrlist.add(new Integer(333));
		
		int len = arrlist.size();
		System.out.println("목록의 크기 :"+len);
		
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
	
		//삭제
		arrlist.remove(1);
		
		len = arrlist.size();
		System.out.println("목록의 크기 :"+len);
		
		for (Integer n : arrlist) {
			System.out.println(n);
		}
		
		
		//원하는 위치에 추가 
		Integer num = new Integer(200);
		arrlist.add(1, num);
		
		for (Integer n : arrlist) {
			System.out.println(n);
		}
		
		//검색 
		int index = arrlist.indexOf( 333 );
		System.out.println("index:"+index);
		
		index = -1;
		for (int i = 0; i < arrlist.size(); i++) {
			Integer v = arrlist.get(i);
					if(v == 200) {
						index = i;
						break;
					}
		}
		
		
		
		//수정 
		Integer uData = new Integer(555);
		arrlist.set(2, uData);
		
		for (Integer n : arrlist) {
			System.out.println(n);
		}
		
		//	ArrayList<String> slist =
		//	추가(끝에추가, 중간추가)
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("오케이1");
		String ok = new String("오케이2");
		slist.add(ok);
		slist.add(new String("오케이3"));
		String ok2 = "오케이4";
		slist.add(ok2);
		slist.add(1, "꼽사리오케이");
		
		for (String s : slist) {
			System.out.println(s);
		}
		
		//  삭제
		slist.remove(2);
		for (String s : slist) {
			System.out.println(s);
		}
		
		//  검색
		index = slist.indexOf("꼽사리오케이");
		System.out.println(index);
		
		int len2 = slist.size();
		System.out.println(len2);
		
		//  수정 
		slist.set(1, "오케이2");
		for (String s : slist) {
			System.out.println(s);
		}
		
		
		//	MyClass( number, name, height )
		//	ArrayList<MyClass>
		//	추가(끝에추가, 중간추가)
		//  삭제
		//  검색
		//  수정 
		
		

	}

	
}

	