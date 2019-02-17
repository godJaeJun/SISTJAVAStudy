/*==========================================================
			■■■ 연산자(Operator) ■■■
			- 삼항 연산자 == 조건 연산자
==========================================================*/

// ○ 실습 문제
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가... 윤년인지 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader 의 readLine() 을 활용하고
// 연산은 조건 연산자를 활용할 수 있도록 한다.

// 4나 100 400으로 나눴을 때 떨어진다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 -> 윤년
// 계속하려면 아무 키나

// 임의의 연도 입력 : 2011
// 2011년 -> 평년
// 계속하려면 아무 키나

// ※ 윤년의 판별 조건
//    연도가 4의 배수이면서 100의 배수가 아니거나
//    400의 배수이면 윤년~!!!
//    그렇지 않으면 평년
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		String n;

		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		n= (year %4==0 && year%100!=0 || year%400==0)? "윤년":"평년";
		System.out.printf("%d년 -> %s\n",year,n);
		
	}
}
//실행결과
/*
임의의 연도 입력 : 2011
2011년 -> 평년
계속하려면 아무 키나 누르십시오 . . .
*/