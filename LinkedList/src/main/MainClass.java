package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		/*
			ArrayList : 검색, 대입
		
			LinkedList : 실시간 추가, 삭제의 처리 빠르다		
		*/
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("tigers");		
		String str = new String("lions");
		alist.add(str);
		
		alist.add("twins");
		
		LinkedList<String> list = new LinkedList<String>( alist );
		
		for (String s : list) {
			System.out.println(s);			
		}
		
		if(alist.isEmpty()) {
			System.out.println("array list가 비었습니다");
		}
		
		// 맨앞의 요소(element)를 추가
		list.addFirst("bears");
	//	alist.add(0, "world");
		
		for (String s : list) {
			System.out.println(s);			
		}
		
		// 맨뒤의 요소(element)를 추가
		list.addLast("hello");
		
		// iterator : 반복자 == pointer(주소)	0x4 0x8 0x12
		
		Iterator<String> it;
		it = list.iterator();
		
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
		
		
	
	}

	
}







