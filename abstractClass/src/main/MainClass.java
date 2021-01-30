package main;

import abstractcls.abstractClass;
import my.MyClass;
import you.YouClass;

public class MainClass {

	public static void main(String[] args) {
		/*
		    Abstract Class : 추상 -> AWT -> swing
		    				  추상메소드를 하나이상 포함하고 있는 클래스 
		    				  abstract method : 내용은 없고 선언만 되어 있는 메소드
		    				  
		    public void method(){  <- proto type (매개변수는 머고 리턴값은 머야) : 메소드의 사양
		    	처리 
		    }
		    
		    public abstract void method();
		    
		    
		 
		 */

//		abstractClass ac = new abstractClass();
		
		MyClass mycls = new MyClass();
		mycls.method();
		mycls.abstractmethod();
		
		abstractClass acls = new MyClass();
		acls.method();
		acls.abstractmethod();
		
		abstractClass bcls = new abstractClass() {
			
			@Override
			public void abstractmethod() {
				System.out.println("bcls abstractmethod()");
				
			}
		};
		bcls.method();
		bcls.abstractmethod();
		
		abstractClass absArr[] = new abstractClass[3];
		absArr[0] = new YouClass();
		absArr[1] = new MyClass();
		absArr[2] = new MyClass();
		
		for (int i = 0; i < absArr.length; i++) {
			absArr[i].method();
			absArr[i].abstractmethod();
		
			if(absArr[i] instanceof YouClass) {
			//	YouClass y = (YouClass)absArr[i];
			//	y.func();
				
				((YouClass)absArr[i]).func();
			}
		}
	}

}
