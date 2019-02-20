/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
				   - 반복문 (while문 ) 실습
==========================================================*/ 

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수 까지의 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 276
// >> 1~276 까지의 정수의 합 : xxxx
// >> 1~276 까지의 짝수의 합 : xxxx
// >> 1~276 까지의 홀수의 합 : xxxx
import java.io.BufferedReader;			//java.io에서 BufferedReader가져옴
import java.io.InputStreamReader;		//java.io에서 InputStreamReader가져옴
import java.io.IOException;				//java.io에서 IOException가져옴
public class Test052					//Test052클래스 생성
{
	public static void main(String[] args) throws IOException						//readLine()메소드를 사용해 입력받으면 IOException이 발생하기 때문에 예외처리 해준다.
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  	//BufferedReader로 입력을 받을 것이기 때문에 정의해 준다.
		int n;																		//임의의 정수로 받는 값
		int sum1=0,sum2=0,sum3=0;													//정수의 합, 짝수의 합, 홀수의 합
		System.out.print("임의의 정수 입력 : ");									//사용자에게 안내 메세지를 출력한다.
		n = Integer.parseInt(br.readLine());										//n이라는 정수형 변수에 readLine()메소드를 활용해 임의의 정수값을 받는다.
		int i=1;																	//1부터 사용자로부터 입력받은 값까지 반복문을 실행시킬 것이기에 초기값 1을 받는다.
		while(i<=n){																//i가 n보다 작을경우 반복문을 계속 실행시켜준다.
			sum1+=i;																//정수의 합에는 다 더해줘야 하기때문에 계속 +시켜준다.					
			sum2+=(i%2==0?i:0);														//삼항연산자를 활용하여 i가 2의 배수면 i를 더해주고 아니면 0을 더해준다.
			sum3+=(i%2!=0?i:0);														//삼항연산자를 활용하여 i가 2의 배수가아니면 i를 더해주고 아니면 0을 더해준다.
			i++;																	//i를 계속 증가시켜준다. i<=n을 만족하지 않을때 까지
		}
		System.out.printf("1 ~ %d 까지의 정수의 합 : %d\n",n,sum1);		//정수의 합 출력
		System.out.printf("1 ~ %d 까지의 짝수의 합 : %d\n",n,sum2);		//짝수의 합 출력
		System.out.printf("1 ~ %d 까지의 홀수의 합 : %d\n",n,sum3);		//홀수의 합 출력
	}
}
//실행 결과
/*
임의의 정수 입력 : 100
1 ~ 100 까지의 정수의 합 : 5050
1 ~ 100 까지의 짝수의 합 : 2550
1 ~ 100 까지의 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1000
1 ~ 1000 까지의 정수의 합 : 500500
1 ~ 1000 까지의 짝수의 합 : 250500
1 ~ 1000 까지의 홀수의 합 : 250000
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 150
1 ~ 150 까지의 정수의 합 : 11325
1 ~ 150 까지의 짝수의 합 : 5700
1 ~ 150 까지의 홀수의 합 : 5625
계속하려면 아무 키나 누르십시오 . . .
*/