package report01;

public class report01 {

	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
		
	}
	
	

	//두 점 (x,y)와 (x1,y1)간의 거리를 구한다. getter
static double getDistance(int x,int y, int x1, int y1) {
	//승수를 계산하는 함수 			pow -> power 
	//root를 계산하는 함수 		sqrt 

	double x_1 =Math.pow(x1-x, 2);
	double y_1 =Math.pow(y1-y, 2);
	double result = Math.sqrt(x_1+y_1);
	
	return result;
	
	
	//	double d = Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y, 2));
//	return d;
}

}