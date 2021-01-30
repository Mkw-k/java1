import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// 1. 숫자 몇개를 정렬?
		// 2. 숫자 갯수에 맞도록 입력
		// 3. 오름/내림
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개의 숫자 = ?");
		int count = sc.nextInt();
		
		int[] num1 =  new int[count];
		
		for (int i = 0; i < num1.length; i++) {
			System.out.println(i+1+"번째 숫자 데이터를 입력하세요");
			num1[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(num1));
		
		System.out.print("(1)오름차순 (2)내림차순");
		int select = sc.nextInt();
		
	
		int tmp=num1[0];
		for (int i = 0; i < num1.length-1; i++) {
			for (int j = i+1; j < num1.length; j++) {
				if(select ==1) {
					if(num1[i]>num1[j]) {
						tmp = num1[i];
						num1[i] = num1[j];
						num1[j] = tmp;
					}
					else if(select ==2){
						if(num1[i]<num1[j]) {
							tmp = num1[i];
							num1[i] = num1[j];
							num1[j] = tmp;
						}
				}
			}
		}
		}
	
	}
}
