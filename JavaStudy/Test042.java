/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
					   - switch문 실습
==========================================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며
// 연산 결과는 편의상 정수 형태로 처리하도록 한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    : 28
// 연산자 입력(+ - * /) : +
//
//>> 10 + 28 = 38
//계속하려면 아무 키나 누르세요...
// 43 45 42 47
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test042
{
	public static void main(String[] args) throws IOException
	{
		/*내 Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		int m;
		
		System.out.print("첫 번째 정수 입력    : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력    : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		m = System.in.read();

		switch(m){
			case 43:															// +의 ASCII코드
				System.out.printf("\n>> %d + %d = %d\n",num1,num2,(num1+num2));
				break;
			case 45:															// -의 ASCII코드
				System.out.printf("\n>> %d - %d = %d\n",num1,num2,(num1-num2));
				break;
			case 42:															// *의 ASCII코드
				System.out.printf("\n>> %d * %d = %d\n",num1,num2,(num1*num2));
				break;
			case 47:															// /의 ASCII코드
				System.out.printf("\n>> %d / %d = %d\n",num1,num2,(num1/num2));
				break;
			default:
				System.out.printf("\n>> 입력오류~!!!\n");
				break;
		}
		*/
		//강사님 Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result;			//두개의 정수, 결과값
		char op;					//연산자

		System.out.print("첫 번째 정수 입력    : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력    : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		switch(op)
		{
			case '+': result = a+b; break;
			case '-': result = a-b; break;
			case '*': result = a*b; break;
			case '/': result = a/b; break;
			default : return;				//메소드의 종료	-> main()메소드 종료 -> 프로그램의 종료
		}
		
		// ※ 『return』 : 1.값의 반환
		//				   2. 메소드 종료
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
		
	}
}
//실행결과
/*
첫 번째 정수 입력    : 10
두 번째 정수 입력    : 20
연산자 입력(+ - * /) : +

>> 10 + 20 = 30
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력    : 10
두 번째 정수 입력    : 2
연산자 입력(+ - * /) : -

>> 10 - 2 = 8
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력    : 10
두 번째 정수 입력    : 2
연산자 입력(+ - * /) : *

>> 10 * 2 = 20
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력    : 10
두 번째 정수 입력    : 2
연산자 입력(+ - * /) : /

>> 10 / 2 = 5
계속하려면 아무 키나 누르십시오 . . .
*/ 