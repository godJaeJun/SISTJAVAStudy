/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
						- if ~ else문 실습
==========================================================*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int n;
		/*
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		*/
		// X
		/*	
		if(n%2==0)
		{
			System.out.println(n + "-> 짝수");
		}
		else if(n==0)
		{
			System.out.println(n + "-> 영");
		}
		else
		{
			System.out.println(n + "-> 홀수");
		}
		*/
		// X
		/*
		if(n%2!=0)
		{
			System.out.println(n + "-> 홀수");
		}
		else if(n%2==0)
		{
			System.out.println(n + "-> 짝수");
		}
		else if(n==0)
		{
			System.out.println(n + "-> 영");
		}
		*/
		// O
		/*
		if(n==0)
		{
			System.out.println(n + "-> 영");
		}
		else if(n%2==0)
		{
			System.out.println(n + "-> 짝수");
		}
		else if(n%2!=0)
		{
			System.out.println(n + "-> 홀수");
		}
		else
		{
			System.out.println("판정이 불가능한 상황");
		}
		*/
		System.out.print("아이스크림 종류 선택(1.딸기, 2.포도) : ");
		n = Integer.parseInt(br.readLine());

		/*
		if(n==1)
		{
			System.out.println("딸기 아이스크림 선택~!!!");
		}
		else
		{
			System.out.println("포도 아이스크림 선택~!!!");
		}
		*/
		if(n==1)
		{
			System.out.println("딸기 아이스크림 선택~!!!");
		}
		else if(n==2)
		{
			System.out.println("포도 아이스크림 선택~!!!");
		}
		else
		{
			System.out.println("판정 불가~!!!");
		}
	}
}
// * else를 마지막에 써줘서 예외를 처리하는 것은 바람직
//실행결과
/*
아이스크림 종류 선택(1.딸기, 2.포도) : 1
딸기 아이스크림 선택~!!!
계속하려면 아무 키나 누르십시오 . . .
*/