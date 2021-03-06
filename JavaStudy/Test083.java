/*==========================================================
					■■■ 배열 ■■■
				 - 배열의 기본적인 활용
==========================================================*/

//○ 과제
// 사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
// 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수 : 10
// 데이터 입력(공백구분) : 45 92 75 13 2 65 25 63 90 1
// >> 가장 큰 수 -> 92
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;	//Scanner를 가져옴.

public class Test083		//Test083클래스 생성
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		//Scanner 인스턴스 생성
		int num;									//사용자에게 받을 입력할 데이터의 갯수 변수
		int max;									//최댓값을 비교하고 출력할 max변수
		System.out.print("입력할 데이터의 갯수 : ");//사용자에게 안내메세지를 출력한다.
		num = sc.nextInt();							//num변수에 숫자 정수형을 입력받는다.	
		int[] number = new int[num];				//입력받은 num변수만큼의 number배열을 생성해준다.
		System.out.print("데이터 입력(공백구분) : ");//안내메세지 출력
		for(int i=0;i<num;i++)						//사용자에게 입력을 받고 최댓값을 구해줄 반복문
		{
			number[i] = sc.nextInt();				//number배열의 i번째 공간에 숫자를 입력받는다.
		}

		max=number[0];								//최댓값을 배열의 가장 첫번째 값으로 설정한다.

		for(int i=1;i<num;i++)						//두번째 값부터 끝까지 비교하기 위해 i를 1부터 끝까지 돌려준다.
		{
			if(max<=number[i])						//만약 입력받은 숫자가 최댓값 max보다 크면
			{					
				max=number[i];						//max를 해당 배열값으로 변경시켜준다.
			}
		}
		System.out.println(">> 가장 큰 수 -> "+max);	//최댓값을 출력
	}
}
//실행결과
/*
입력할 데이터의 갯수 : 10
데이터 입력(공백구분) : 45 92 75 13 2 65 25 63 90 1
>> 가장 큰 수 -> 92
계속하려면 아무 키나 누르십시오 . . .
*/