package work06;

public class MainClass {
	public static void main(String[] args) {
		/*
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0;i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("sum="+sum);
		*/
		
		/*
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		
		for(int i = 0;i < arr.length; i++) {
			for(int j = 0;j < arr[i].length; j++) {
				total = total + arr[i][j];
			}			
		}
		
		average = (float)total / (arr.length * arr[0].length);
		
		System.out.println("total="+total);
		System.out.println("average="+average);
		*/
		
		/*
		// 큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money="+money);
		for(int i = 0;i < coinUnit.length; i++) {
			System.out.println( coinUnit[i] + "원:" + (money / coinUnit[i]) );
			money = money % coinUnit[i];
		}
		*/

		// a b c -> 
		char[] abcCode ={ 
				'`','~','!','@','#', '$','%','^','&','*',
				'(',')','-','_','+', '=','|','[',']','{',
				'}',';',':',',','.', '/'
		};
		
		// 					0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t', 'y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		for(int i = 0;i < src.length(); i++) {
			char c = src.charAt(i);
			int asc = (int)c;
			
			// 알파벳의 경우
			if(asc >= 97 && asc <= 122) {
				asc = asc - 97;	// 97 -> 0
				result = result + abcCode[asc];
			}			
			// 숫자의 경우
			if(asc >= 48 && asc <= 57) {
				asc = asc - 48;	// 48 -> 0
				result = result + numCode[asc];
			}
		}

		System.out.println("원본:" + src);
		System.out.println("암호화:" + result);
		
		// 복호화
		String baseCode = "";
		
		for(int i = 0;i < result.length(); i++) {
			char c = result.charAt(i);
			int asc = (int)c;
			
			// 알파벳 -> 숫자가 암호화
			int index = 0;
			if(asc >= 97 && asc <= 122) {
				
				for(int j = 0;j < numCode.length; j++) {
					if(c == numCode[j]) {	// c == 'w'
						index = j;
						break;
					}					
				}
				
				index = index + 48;	// 0 -> 48
				baseCode = baseCode + (char)index;				
			}
			else {	// 기호 -> 알파벳이 암호화
				
				for(int j = 0;j < abcCode.length; j++) {
					if(c == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;				
				baseCode = baseCode + (char)index;
			}			
		}
		System.out.println("복호화:" + baseCode);
		
	}
}











