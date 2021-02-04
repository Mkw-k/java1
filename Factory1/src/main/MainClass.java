package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;

public class MainClass {
	public static void main(String[] args) {
		
		Animal a1 = AnimalFactory.create("멍멍이");
		Animal a2 = AnimalFactory.create("야옹이");
		Animal a3 = AnimalFactory.create("황소");
		
		a1.printDescript();
		a2.printDescript();
		a3.printDescript();
		
		((Dog)a1).dogMethod();
		
		Cat c = (Cat)a2;
		c.catMethod();
		
		((Cow)a3).cowMethod();
		
		String aniName[] = { "야옹이", "멍멍이", "멍멍이", "야옹이", "황소" };
		
		List<Animal> list = new ArrayList<Animal>();
		
		for (int i = 0; i < aniName.length; i++) {
			Animal a = AnimalFactory.create(aniName[i]);
			list.add(a);
		}
		
		/*
		Animal a = AnimalFactory.create("멍멍이");
		list.add(a);		
		a = AnimalFactory.create("야옹이");
		list.add(a);		
		a = AnimalFactory.create("황소");
		list.add(a);
		*/
		
		for (int i = 0; i < list.size(); i++) {
			Animal ani = list.get(i);
			ani.printDescript();
			
			if(ani instanceof Dog) {
				((Dog)ani).dogMethod();
			}
			else if(ani instanceof Cow) {
				((Cow)ani).cowMethod();
			}
			else if(ani instanceof Cat) {
				((Cat)ani).catMethod();
			}
		}
		
		
	}
}








