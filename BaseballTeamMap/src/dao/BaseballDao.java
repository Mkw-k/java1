package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import file.DataProc;


public class BaseballDao {
	Scanner sc = new Scanner(System.in);
	
//	PitcherDto pit[] = new PitcherDto[30];
//	BatterDto bat[] = new BatterDto[30];
	
//	private HumanDto human[] = new HumanDto[30];
//	private List<HumanDto> list = new ArrayList<HumanDto>();
	
	private Map<Integer, HumanDto> map = new HashMap<Integer, HumanDto>();
	
	private int memberNum;
//	private int memberCount;
	
	private DataProc dp;
	
	public BaseballDao() {
		
		dp = new DataProc("lions");
		dp.createFile();
		
		dataLoad();	
				
		/*
		int lastIndexNumber = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				lastIndexNumber = i;
			}
		}
		
		if(lastIndexNumber > 0) {
			memberNum = 1001 + ( human[lastIndexNumber].getNumber() % 1000 );
			memberCount = lastIndexNumber + 1;
		}else {		
			memberNum = 1001;
			memberCount = 0;	// human[] 관리하기 위한 변수
		}
		*/
		
		/*
		// 데이터가 없는 경우
		if(list.isEmpty()) {
			memberNum = 1001;
		}
		else {
			int lastIndexNumber = list.get( list.size() - 1 ).getNumber();
			if(lastIndexNumber > 0) {
				memberNum = 1001 + ( lastIndexNumber % 1000 );
			}		
		}
		*/
		
		// 데이터가 없는 경우
		if(map.isEmpty()) {
			memberNum = 1001;
		}
		else {			
			Iterator<Integer> it = map.keySet().iterator();
			HumanDto array[] = new HumanDto[map.size()];
			int w = 0;
			while(it.hasNext()) {
				int key = it.next();
				HumanDto h = map.get(key);				
				array[w] = h;
				w++;
			}	
			
			int max = array[0].getNumber();
			for (int i = 0; i < array.length; i++) {
				if(max < array[i].getNumber()) {
					max = array[i].getNumber();
				}
			}		
						
			int lastIndexNumber = max;
			if(lastIndexNumber > 0) {
				memberNum = 1001 + ( lastIndexNumber % 1000 ) + 1;
			}			
		}		
	}
	
	public void insert() {
		// 투수/타자 ?
		System.out.print("투수(1)/타자(2) = ");
		int pos = sc.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		HumanDto human = null;
		
		if(pos == 1) { // 투수
			
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			human = new PitcherDto(memberNum, name, age, height, win, lose, defence);
			
		}
		else {	// 타자
			
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			human = new BatterDto(memberNum + 1000, name, age, height, batcount, hit, hitAvg);
		}
		
	//	human[memberCount] = hu;
	//	list.add(human);
		map.put(human.getNumber(), human);
		
		memberNum++;	// 선수 등록 번호
	//	memberCount++;	// 관리 배열의 index		
	}
	
	public void delete() {
		System.out.print("삭제하고 싶은 선수명 = ");
		String name = sc.next();
		
		int key = search(name.trim());	// "이병규 " != "이병규" 
		if(key == 0) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		
		/*
		if(human[index] instanceof PitcherDto) {
			PitcherDto p = (PitcherDto)human[index];
			p.setNumber(0);
			p.setName("");
			p.setAge(0);
			p.setHeight(0.0);
			p.setWin(0);
			p.setLose(0);
			p.setDefence(0.0);			
		}
		else if(human[index] instanceof BatterDto) {
			BatterDto b = (BatterDto)human[index];
			b.delete();
		}
		*/
	//	HumanDto h = list.remove(index);
	//	System.out.println(h.getName() + "선수의 데이터를 삭제 하였습니다");
		
		HumanDto h = map.remove(key);
		System.out.println(h.getName() + "선수의 데이터를 삭제 하였습니다");
	}
	
	public void select() {
		System.out.print("검색하고 싶은 선수명 = ");
		String name = sc.next();
		
		/*
		int count = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				if(name.equals(human[i].getName())) {
					count++;
				}
			}
		}
		
		if(count < 1) {
			System.out.println("검색한 선수는 없습니다");
			return;
		}
		*/
		
		
		
		/*
		HumanDto man[] = new HumanDto[count];
		int n = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				if(name.equals(human[i].getName())) {
					man[n] = human[i];
					n++;
				}
			}
		}
		
		// 검색된 선수명단
		for (int i = 0; i < man.length; i++) {
			System.out.println(man[i].toString());
		}
		*/		
		
		/*
		List<HumanDto> findList = new ArrayList<HumanDto>();
		
		for (int i = 0; i < list.size(); i++) {
			String memName = list.get(i).getName();
			if(name.equals(memName)) {
				HumanDto h = list.get(i);
				findList.add( h );				
			}
		}
		
		if(findList.isEmpty()) {
			System.out.println("검색한 선수는 찾을 수 없습니다");
			return;
		}
		
		System.out.println("검색된 선수 명단입니다 >> ");
		for (int i = 0; i < findList.size(); i++) {
			HumanDto h = findList.get(i);
			System.out.println(h.toString());
		}	
		*/
		
		Map<Integer, HumanDto> findMap = new HashMap<Integer, HumanDto>();
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			HumanDto h = map.get(key);
			if(name.equals(h.getName())) {
				findMap.put(key, h);
			}
		}
		
		if(findMap.size() == 0) {
			System.out.println("검색한 선수는 찾을 수 없습니다");
			return;
		}
		
		Iterator<Integer> itf = findMap.keySet().iterator();
		while(itf.hasNext()) {
			int key = itf.next();
			HumanDto h = findMap.get(key);
			System.out.println(h.toString());
		}		
		
	}
	
	public void update() {
		System.out.print("수정하고 싶은 선수명 = ");
		String name = sc.next();
		
		int key = search(name.trim());	
		if(key == 0) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		
	//	HumanDto human = list.get(index);
		HumanDto human = map.get(key);
				
		if(human instanceof PitcherDto) {
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			PitcherDto p = (PitcherDto)human;
			p.setDefence(defence);					
		}
		else if(human instanceof BatterDto) {
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			BatterDto b = (BatterDto)human;
			b.setHitAvg(hitAvg);			
		}		
		
		System.out.println("성공적으로 수정되었습니다");
	}
	
	public int search(String name) {		
	//	int index = -1;
		
		/*
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				if(name.equals(human[i].getName())) {
					index = i;
					break;
				}
			}
		}
		*/
		
		/*
		for (int i = 0; i < list.size(); i++) {
			HumanDto h = list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
			}
		}
		*/
		// key -> value
		
		Iterator<Integer> it = map.keySet().iterator(); //set형태에 따라서 그에 해당하는 값이  Iterator 되는지?
		int memNum = 0;
		while(it.hasNext()) {			
			int key = it.next();
			HumanDto h = map.get(key);	
			
			
			
			if(name.equals(h.getName())) {
				memNum = key;
				break;
			}
		}		
		
		return memNum;
	}
	
	public void allprint() {
		/*
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				System.out.println(human[i].toString());
			}
		}
		*/
		
		/*
		for (HumanDto h : list) {
			System.out.println(h.toString());
		}
		*/
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			HumanDto h = map.get(key);
			System.out.println(h.toString());
		}
		
	}
	
	public void dataSave() {
		// 1001-홍길동-24-180-10-2-
		/*
		int len = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				len++;
			}
		}
		*/
		
		/*
		String datas[] = new String[len];
		int w = 0;
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				datas[w] = human[i].alldata(); 
				w++;
			}
		}
		*/
		
		/*
		String datas[] = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			HumanDto h = list.get(i);
			datas[i] = h.alldata();
		}
		*/
		
		String datas[] = new String[map.size()];
		
		// 편집 2000보다 크면 1000번대로 수정 
		Map<Integer, HumanDto> memMap = new HashMap<Integer, HumanDto>();
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();			
			HumanDto h = map.get(key);
			
			int num = h.getNumber();
			if(num > 2000) {
				num = num - 1000;
			}						
			
			memMap.put(num, h);			
		}		
		
		// 정렬하는 map
		TreeMap<Integer, HumanDto> tmap = new TreeMap<Integer, HumanDto>( memMap );
		it = tmap.keySet().iterator();
		int w = 0;
		while(it.hasNext()) {
			int key = it.next();
			datas[w] = tmap.get(key).alldata();
			w++;
		}		
		
		dp.fileSave(datas);		
	}
	
	public void dataLoad() {
		String datas[] = dp.fileLoad();
				
		for (int i = 0; i < datas.length; i++) {			
			String data[] = datas[i].split("-");
			int pos = Integer.parseInt(data[0]);
			
			HumanDto human = null;
			if(pos < 2000) {	// 투수
				human = new PitcherDto(	Integer.parseInt(data[0]),						
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											Integer.parseInt(data[4]), 
											Integer.parseInt(data[5]), 
											Double.parseDouble(data[6]));
			}
			else {				// 타자
				human = new BatterDto(	Integer.parseInt(data[0]),						
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											Integer.parseInt(data[4]), 
											Integer.parseInt(data[5]), 
											Double.parseDouble(data[6]));
			}	
			
		//	list.add(human);		
			
			map.put(human.getNumber(), human);
		}
		
	}
	
	
}







