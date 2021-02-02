package main;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class YouClass {

	public static void main(String[] args) {
			//	MyClass( number, name, height )
			//	ArrayList<MyClass>
			//	추가(끝에추가, 중간추가)
			//  삭제
			//  검색
			//  수정 
		
		ArrayList<MyClass> mcls = new ArrayList<MyClass>();
		mcls.add(new MyClass(1, "홍길동", 123.5));
		mcls.add(new MyClass(2, "성춘향", 157.5));
		mcls.add(0, new MyClass(1, "고길동", 135.7));
		
		for (MyClass m : mcls) {
			System.out.println(m);
		}
		
		mcls.remove(1);
		
		for (MyClass m : mcls) {
			System.out.println(m);
		}
		
	
		int index = method(mcls);
		MyClass data = mcls.get(index);
		System.out.println("찾으시는 데이터는 >>");
		System.out.println(data);
		
		
		
		mcls.set(0, new MyClass(1, "홍길동", 172.5));
		for (MyClass m : mcls) {
			System.out.println(m);
		}
		
		
		
	}
	
	//검색
	public static int method(ArrayList<MyClass> mcls) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 사람의 이름 입력 = ");
		String name = sc.next();
		
		int count = -1; 
		int index = -1;
		for (MyClass cls : mcls) {
			if(cls.getName()==name) {
				index = count+1;
				return index;
			}else {
				count++;
			}
			
		}
	
		return -1;
	}
	

}

	class MyClass {
		int number;
		String name;
		double height;
		
		
		
		@Override
		public String toString() {
			return "MyClass [number=" + number + ", name=" + name + ", height=" + height + "]";
		}
		public MyClass(int number, String name, double height) {
			super();
			this.number = number;
			this.name = name;
			this.height = height;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
		
		
	}

