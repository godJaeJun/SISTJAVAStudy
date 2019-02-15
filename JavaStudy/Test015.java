/*==========================================================
			■■■ 자바 기본 프로그래밍 ■■■
		   -자바의 기본 입출력 : System.in.read()
==========================================================*/

// 실행 예)
// 한 문자 입력 : G
// 한 자리 정수 입력 : 7

// >> 입력한 문자 : G
// >> 입력한 정수 : 7
// 계속하려면 아무 키나 누르세요...

/*
※ 『System.in.read()』 메소드는 한 문자만 가져온다.
	단, 하나의 문자를 입력받아 입력받은 문자의
	ASCII Code 값을 반환하게 된다.
*/

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언
		char ch;			//-- 입력받은 문자를 담을 변수
		int n;				//-- 입력받은 정수를 담을 변수
	
		// ○ 연산 및 처리
		// 사용자에게 안내 메세지 출력
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		System.in.read();
		System.in.read();

		System.out.print("한 자리 정수 입력 : ");
		n = System.in.read() - 48;
		
		// ○ 결과 출력
		System.out.println("\n>> 입력한 문자 : "+ch);
		System.out.println(">> 입력한 정수 : "+n);
	}
}