package cls;

//		상속 금지!
public /*final*/ class SuperClass {
			
	//		Over Ride 금지!
	public /*final*/ void method() {
	}
}


class ChildClass extends SuperClass{
	public void method() { // Over Ride
		}
}