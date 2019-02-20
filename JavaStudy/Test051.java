/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
				   - 반복문 (while문 ) 실습
==========================================================*/ 
// ○ 실습 문제
// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20
// >> 10 ~ 20 까지의 합 :xxxx
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		int sum=0;
		int n=0,m=0;
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		
		if(num1>=num2){
			n=num2;
			m=num1;
		}
		else{
			n=num1;
			m=num2;
		}
		while(n<=m){
			sum+=n;
			n++;
		}
		System.out.printf(">>%d ~ %d 까지의 합 : %d\n",(num1>num2?num2:num1),m,sum);
		*/

		// 강사님 Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ○ 주요 변수 선언
		int n, su1, su2, result=0;
		// -- 루프변수, 첫 번째 입력값, 두 번째 입력값, 결과값(누적합 연산결과)

		// ○ 연산 및 처리
		// ★ 사용자에게 안내메세지 출력 및 입력값 담아내기
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());
		
		// ★ 누적합 연산에 들어가기 앞서
		// 입력받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, su1이 su2보다 클 경우 두 수의 자리를 바꿀 수 있도록 처리
		if(su1>su2)
		{
			//두 수의 자리 바꿈
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;
		}
		// 반복문에 진입하기 전
		// 작은 수를 따로 저장해둔다.
		// (이 작은 수는 출력 과정에서 필요한 값이며...
		//  별도로 저장해 두지 않을 경우 반복문을 수행하는 동안
		//  그 값이 계속 변할 것이기 때문...)
		n = su1;

		while(n<=su2){
			result+=n;
			n++;
		}


		// ○ 결과 출력
		System.out.printf(">>%d ~ %d 까지의 합 : %d\n",su1,su2,result);
	}
}
//실행 결과
/*
첫 번째 정수 입력 : 1
두 번째 정수 입력 : 100
>>1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 1
두 번째 정수 입력 : 10
>>1 ~ 10 까지의 합 : 55
계속하려면 아무 키나 누르십시오 . . .
*/