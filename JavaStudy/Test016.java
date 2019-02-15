/*==========================================================
			■■■ 자바의 기본 프로그래밍 ■■■
		      - 자바의 기본 입출력 : printf()
==========================================================*/


public class Test016{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");	//--『\n』개행

		// 서식 출력 메소드
		System.out.printf("121231231312312");
		System.out.printf("123232131231311\n");		//--『\n』개행
		System.out.printf("123123123123123123%n");  //--『%n』개행
		
		System.out.printf("%d + %d = %d\n",10,20,30);

		//--==>>
		//AAABBBCCC
		//121231231312312123232131231311
		//123123123123123123
		//10 + 20 = 30
		//계속하려면 아무 키나 누르십시오 . . .
		
		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123);	// 10만큼의 공간확보 후 나머지 숫자 우측 정렬
		System.out.printf("%010d\n",123);
		
		//123
		//		 123
		//0000000123
		
		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365);
		System.out.printf("%d\n",+365);

		//+365
		//+365
		//365
		
		//System.out.printf("%-d\n",365); //--런타임 에러 발생
		System.out.printf("-%d\n",365);	  //--음수 표현 시 앞에 - 기호를 붙여준다.
		System.out.printf("%d\n",-365);	  //--양수와 다르게 음수는 출력가능
		//-365
		//-365
		
		//★★★★기억을 꼭 해두세요
		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n",365);
		//(365)
		//365

		//System.out.printf("%d\n",'A');	//--런타임 에러 발생

		System.out.printf("%c\n",'A');		//『%c』 문자 출력 용
		//System.out.printf("%c\n","ABCD");	//--런타임 에러 발생
		
		System.out.printf("%s\n","ABCD");	//『%s』 문자열 출력 용
		//--==>> A
		//		 ABCD

		System.out.printf("%h\n",365);
		System.out.printf("%o\n",24);

		//16d
		//30

		System.out.printf("%s\n","true");
		System.out.printf("%b\n",true);
		//true
		//true
	
		System.out.printf("%f\n",123.23);
		System.out.printf("%.2f\n",123.23);
		System.out.printf("%.2f\n",123.236);	//check~!!!
		System.out.printf("%8.2f\n",123.236);	//check~!!! __123.24
		System.out.printf("%2.2f\n",123.1234);	//check~!!!
		
		//123.230000
		//123.23
		//123.24
		//  123.24
		//123.12
 	}
}
//실행결과
/*
AAABBBCCC
121231231312312123232131231311
123123123123123123
10 + 20 = 30
123
       123
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
true
123.230000
123.23
123.24
  123.24
123.12
계속하려면 아무 키나 누르십시오 . . .
*/