package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {
	public static void main(String[] args) {
		/*
			HashMap : 사전
					  ("사과":"apple") 
					  key : value -> json
					  Tree 구조	
					  key로 관리
					  
			TreeMap : HashMap + sorting 
		*/
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
	//	Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		// 추가	 key  value     
		hMap.put(11, "십일");
		hMap.put(22, "이십이");
		hMap.put(33, "삼십삼");
		
		String value = hMap.get( 22 );
		System.out.println(value);
				
		// 삭제
		String del = hMap.remove(11);
		System.out.println("삭제데이터 : " + del);
		
		System.out.println("map의 크기 : " + hMap.size()); 
		
		// 검색		
		// 있다/없다
		boolean b = hMap.containsKey(22);
		if(b == true) {
			String s = hMap.get(22);
			System.out.println("value:" + s);
		}
				
		// 수정
		hMap.replace(22, "이십 + 이");
		System.out.println( hMap.get(22) );
		
		hMap.put(22, "이십 플러스 이");	// 중복 키는 허용하지 않고 새로운 값으로 변경
		System.out.println( hMap.get(22) );
		
		// 모든 키 값을 취득
		Iterator<Integer> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println("key:" + k);	
			
			String v = hMap.get(k);
			System.out.println("value:" + v);	
		}
		
		// 좋아하는 과일 5 element
		// key:value -> String
		// "apple":"사과"
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("apple", "사과");
		map.put("pear", "배");
		map.put("grape", "포도");
		map.put("banana", "바나나");
		map.put("orange", "오렌지");
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String k = it1.next();
			String v = map.get(k);
			System.out.println("key:" + k + " value:" + v);			
		}
		
		// TreeMap
		// sorting
		TreeMap<String, String> tMap = new TreeMap<String, String>(map);
		
		// 오름
	//	Iterator<String> itKey = tMap.keySet().iterator();
		
		// 내림
		Iterator<String> itKey = tMap.descendingKeySet().iterator();
		
		System.out.println("---------------------------");
		while(itKey.hasNext()) {
			String k = itKey.next();
			String v = tMap.get(k);
			System.out.println("key:" + k + " value:" + v);			
		}
		
	}
}














