/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
				         - break 
==========================================================*/

// ○ 실습 문제
// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 1000 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력 : -10
// 임의의 정수 입력 : 0
// 임의의 정수 입력 : 2019
// 임의의 정수 입력 : 10
// >> 1~ 10 까지의 합 : 55
// 계속하시겠습니까?(Y/N) : y

// 임의의 정수 입력 : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까?(Y/N) : N
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		// 내 Version
		/*
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num=0,sum=0;
			int c;

			while(true){
				do{
				System.out.print("임의의 정수 입력 : ");
				num=Integer.parseInt(br.readLine());
				}while((num<1||num>1000));
				for(int i=1;i<=num;i++)
				{
						sum+=i;
				}
				System.out.printf(">> 1 ~ %d 까지의 합 : %d\n",num,sum);
				System.out.print("계속하시겠습니까?(Y/N) : ");
				c = (char)System.in.read();
				System.in.skip(2);
				if(c=='y'|| c=='Y'){
					sum=0;
				}
				else{
					break;
				}
			}
		*/
		// 강사님 Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s, i;		//-- 사용자 입력값, 누적합, 루프 변수
		char ch;			//-- 계속 여부 입력값
		while(true){		//-- 무한 루프(무한 반복)
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1||n>1000);

			s = 0;
			for (i=1; i<=n; i++)
			{
				s += i;
			}
			System.out.printf("\n>> 1 ~ %d 까지의 합 : %d\n",n,s);
			
			System.out.print("계속하시겠습니까?(Y/N) : ");
			ch = (char)System.in.read();
			// 입력값이 소문자 y가 아니다. 입력값이 대문자 Y가 아니다.
			// ch!='y'						ch!='Y'
			if(ch!='y'&&ch!='Y')
			{
				//반복문을 멈추고 빠져나간다. 반복문 while(true)를 빠져나갈 수 있는 코드 작성 필요
				// 위와 같은 의사표현을 했다면 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				// 멈춘다 그리고 빠져나간다~!!! check~!!!
			}
			System.in.skip(2);
		}
	}
}
// 실행 결과
/*
임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까?(Y/N) : y
임의의 정수 입력 : 20
>> 1 ~ 20 까지의 합 : 210
계속하시겠습니까?(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .
*/