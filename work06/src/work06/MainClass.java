package work06;

public class MainClass {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}			
	}
	
	public static void action(Robot ro) {
		if(ro instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)ro;
			dr.dance();
		}
		else if(ro instanceof SingRobot) {
			((SingRobot)ro).sing();
		}
		else if(ro instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)ro;
			dr.draw();
		}		
	}	
}

class Robot {		
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
