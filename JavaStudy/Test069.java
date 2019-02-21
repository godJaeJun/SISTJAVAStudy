/*==========================================================
			■■■ 지역변수와 전역변수 ■■■
			- 지역 변수의 초기화 테스트 실습
==========================================================*/

// Test068.java 와 비교~!!!

public class Test069
{
	// 전역 변수 선언
	int a;
	//-- 전역 변수는 사용하는 과정에서 초기화를 수행하지 않았을 경우
	//   자동으로 0으로 초기화 지원

	boolean b;
	
	char c;

	double d;

	public static void main(String[] args)
	{
		// Test069 인스턴스 생성
		Test069 ob = new Test069();

		System.out.println("ob.a : "+ob.a);	
		//--==>> ob.a : 0

		System.out.println("ob.b : "+ob.b);
		//--==>> ob.b : false

		System.out.println("ob.c : "+ob.c);
		//--==>> ob.b : 

		System.out.println("ob.d : "+ob.d);
		//--==>> ob.b : 0.0
	}
}
//실행결과
/*
ob.a : 0
ob.b : false
ob.c :
ob.d : 0.0
계속하려면 아무 키나 누르십시오 . . .
*/