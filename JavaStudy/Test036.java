/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
					   - if ~ else문 실습
==========================================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 작성한다.

// 실행 예)
// 첫 번째 정수 입력 : 4
// 두 번째 정수 입력 : 8
// 세 번째 정수 입력 : 73

// >> 정렬 결과 : 4 8 73
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test036
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,num3;
		int max=0,mid=0,low=0;
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		num3 = Integer.parseInt(br.readLine());

		if(num1>=num2 && num1>=num3)
		{
			max = num1;
			mid = (num2<=num3)?num3:num2;
			low = (num2>=num3)?num3:num2;
		}
		else if(num2>=num1&&num2>=num3)
		{
			max=num2;
			mid = (num1<=num3)?num3:num1;
			low = (num1>=num3)?num3:num1;
		}
		else if(num3>=num1&&num3>=num2)
		{
			max=num3;
			mid = (num2<=num1)?num1:num2;
			low = (num2>=num1)?num1:num2;
		}
		System.out.printf("\n>> 정렬결과 : %d %d %d\n",low,mid,max);
		*/
		// 강사님 Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;	//-- 사용자가 입력하는 임의의 정수를 담을 변수
		int temp;		//-- 임시 저장 변수(빈 컵)
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3

		// 1. 첫 번째 정수가 두 번째 정수보다 크다면...
		// 두 정수의 자리를 바꾼다.
		if(a>b){
			temp = a;
			a = b;
			b = temp;
		}
		// 2. 두 번째 정수가 세 번째 정수보다 크다면...
		// 두 정수의 자리를 바꾼다.
		if(b>c)
		{
			temp = b;
			b = c;
			c = temp;
		}
		// 3. 첫 번째 정수가 두 번째 정수보다 크다면...
		// 두 정수의 자리를 바꾼다.
		if(a>b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n",a,b,c);
	}
}
//실행결과
/*
첫 번째 정수 입력 : 25
두 번째 정수 입력 : 17
세 번째 정수 입력 : 9

>> 정렬 결과 : 9 17 25
계속하려면 아무 키나 누르십시오 . . .
*/
/*
첫 번째 정수 입력 : 96
두 번째 정수 입력 : 84
세 번째 정수 입력 : 72

>> 정렬 결과 : 72 84 96
계속하려면 아무 키나 누르십시오 . . .

*/
/*
첫 번째 정수 입력 : 15
두 번째 정수 입력 : 10
세 번째 정수 입력 : 10

>> 정렬 결과 : 10 10 15
계속하려면 아무 키나 누르십시오 . . .
*/