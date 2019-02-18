/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
					   - switch문 실습
==========================================================*/


// ○ 실습 문제
// 1 부터 3 까지의 정수 중 하나를 사용자로부터 입력받아
// 입력받은 정수만큼 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두가지 방법으로 구현할 수 있도록 한다.

// 1.switch문의 일반 모델을 활용한다.
// 2.switch문의 기본 모델을 활용하되,
//  『break』를 딱 한번만 사용할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무 키나 누르세요...


// 실행 예)
// 임의의 정수 입력(1~3) : 7
// 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("임의의 정수 입력(1~3) : ");
		num = Integer.parseInt(br.readLine());
		/*
		switch(num)
		{
			case 3:
				System.out.print("★★★\n");
				break;
			case 2:
				System.out.print("★★\n");
				break;
			case 1:
				System.out.print("★\n");
				break;
			default:
				System.out.print("입력 오류~!!!\n");
				break;
		}
		*/
		switch(num)
		{
			case 3:
				System.out.print("★");
			case 2:
				System.out.print("★");
			case 1:
				System.out.print("★\n");
				break;		
			default:
				System.out.print("입력 오류~!!!\n");
		}
	}
}
//실행결과
/*
임의의 정수 입력(1~3) : 3
★★★
계속하려면 아무 키나 누르십시오 . . .
*/