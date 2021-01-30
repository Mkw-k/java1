
public class MainClass {

	public static void main(String[] args) {
	/*
	  	String : wrapper class
	  			 char[] 
	  			 문자열 저장, 편집, 정보취득
	  
	 */
		
		String str; 
		//String class명 
		//str : 변수(== 객체(object))
		
//		char cstr[] = {'a', 'b', 'c'};
		
		str = "안녕하세요";
		System.out.println("str = "+str);
		
		String str1 = new String("안녕하세요");
		
		String str2 = "반갑습니다";
		
		//문자열의 결합 
		String str3 = str1 + str2;
		System.out.println("str3 = "+str3);
		
		str3 = str3 + "건강하세요";
		System.out.println(str3);
		
		
		/*
		  	함수 
		  	
		  	r = (int)(Math.random() * 3 )
		  	 	 나오는값 = 함수명(들어가는값)
		  	 	  나오는값 = 함수명(들어가는값, 들어가는값)
		  	 	 나오는값 = 함수명(들어가는값, 들어가는값, 들어가는값)
		 */

		//비교함수 
		//equals
		
		String str4 = "world";
		String str5 = "worl";
		
		str5 = str5+ "d"; 
		System.out.println("str5 ="+str5);
		System.out.println(str4 == str5); //대상의 주소값을 비교함   
		
		boolean b = str4.equals(str5); // 대상의 내용을 비교함 
	    System.out.println("b = "+b);
	
	//문자위치탐색함수
	//intdexOf 
	//lastIndexOf
	
	String str6 = "avcavav";
	int index =str6.indexOf("c");
	System.out.println("index = "+index);
	
	
	int lastIndex = str6.lastIndexOf("a");
	System.out.println("lastIndex = "+lastIndex);
	
//int Index1 = str6.IndexOf("f");
	
//	System.out.println("Index = "+Index1);
	
	//문자열의 길이 
	//length
	//배열 		array.length 
	//문자열 		str.length()

	int len = str6.length();
	System.out.println("str6의 문자열의 길이 = " +len);
	
	//수정 
	//replace
	String str7 = "A*B*C*D";
	String reStr = str7.replace("*", "-");
	System.out.println(reStr);
	
	str7 = "나는 반드시 성공할 수 있  습니다.";
	reStr = str7.replace("  ", " ");
	System.out.println(reStr);

	
	//문자열을 자른다.
	//split 
	/*
	  aaaa-bbb-ccccc
	  aaaa bbb ccccc
	   홍길동-24-2001/12/23-서울시     '-' == token 
	   안신-21-2002/10/11-대구시 
	   
	   홍길동 
	  24 
	  2001/10/23 
	   서울시 
	 */
	
	String str8 =  "홍길동-24-2001/12/23-서울시-181.1";
	
	String split[] = str8.split("-");
	
	System.out.println(split.length);
	System.out.println(split[0]);
	System.out.println(split[1]);
	System.out.println(split[2]);
	System.out.println(split[3]);
	System.out.println(split[4]);
	
	// 문자열의 범위로 자른다 
	// substring 
	String str9 = "안녕 반가워요 건강해요";
	String substr = str9.substring(0, 6); //시작위치, 이 위치 전까지 
	System.out.println(substr);
	
	// 문자열 --> 대문자 
	String str10 = "abcDEF";
	String upstr = str10.toUpperCase();
	System.out.println(upstr);
	
	// 문자열 --> 소문자
	String lowStr = str10.toLowerCase();
	System.out.println(lowStr);
	
	
	// 문자열의 앞뒤의 공백을 삭제 
	// trim 
	String str11 = "   java java  java     ";
			String trimstr= str11.trim();
	System.out.println(trimstr);
	
	// index 숫자를 입력하면 문자 돌려주는 
	// charAt
	String str12 = "가나다라마";
	char c = str12.charAt(1);
	System.out.println("" + c);
	
	// 문자열 탐색 
	// contains
	String str13 = "서울시 마포구 서교동";
	boolean b1 = str13.contains("강남");
	System.out.println(b1);
}
}




