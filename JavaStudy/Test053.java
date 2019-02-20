/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
				   - 반복문 (while문 ) 실습
==========================================================*/ 

// ○ 과제
// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1~9단 사이의 수를 입력받은 상황이 아니라면
// 프로그램을 종료해버릴 수 있도록 처리한다.

// 실행 예)
// 원하는 단(구구단) 입력 :7
// 7*1 = 7 
// ... 7*9=63
// 계속하려면 아무 키나...

// 원하는 단(구구단) 입력 : 11
// 1부터 9까지의 정수만 입력 가능합니다.
// 계속하려면 아무 키나...
import java.io.BufferedReader;			//java.io에서 BufferedReader가져옴
import java.io.InputStreamReader;		//java.io에서 InputStreamReader0가져옴
import java.io.IOException;				//java.io에서 IOException가져옴
public class Test053					//Test053클래스 생성
{	
	public static void main(String[] args) throws IOException	//readLine()메소드를 이용할 것이기 때문에 IOException 예외처리를 해준다.
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//BufferedReader를 이용하여 정수값을 받을 것이기에 정의해준다.
		int dan;				//사용자에게 입력받을 단
		int i=1;				//단에 곱해질 수
		System.out.print("원하는 단(구구단) 입력 : ");	//사용자에게 안내메세지를 출력한다.
		dan = Integer.parseInt(br.readLine());			//dan을 사용자에게 입력받는다.

		if(dan>=1&&dan<=9)								//입력받은 dan이 1보다 크거나 같고 9보다 작거나 같을 때 안에 있는 반복문을 실행시킨다.
		{
			while(i<=9){								//i가 1부터 9까지 반복한다 10보다 작을때 반복
				System.out.printf("%d * %d = %d\n",dan,i,(dan*i));		//사용자에게 구구단을 보여준다.
				i++;
			}
		}
		else{											//1부터 9사이가 아닌 수를 입력했을 경우 else문을 통하여
			System.out.println("1부터 9까지의 정수만 입력 가능합니다.");		//안내메세지를 출력한다.
		}
	}
}
//실행결과
/*
원하는 단(구구단) 입력 : 9
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 : 7
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 : 2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
계속하려면 아무 키나 누르십시오 . . .

*/