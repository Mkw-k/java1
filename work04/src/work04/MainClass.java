package work04;

import cls.Circle;
import cls.Point3D;
import cls.Rectangle;
import my.MyClass;
import you.YouClass;


public class MainClass {

	public static void main(String[] args) {
		
		Circle circle = new Circle(3.0);
		System.out.println(circle.calcArea());
		
		Rectangle rect = new Rectangle(20, 20);
		System.out.println("정사각형? = " + rect.isSquare());
		System.out.println(rect.calcArea());
		
		
		// 부모instance	자식클래스	
		MyClass my = new YouClass();
		
		Object obj1 = new MyClass();
		Object obj2 = new YouClass();
		
		((MyClass)obj1).method();
		
		
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		
		System.out.println("p1 == p2 ? = " + p1.equals(p2) );
		
		
		
	}

}





