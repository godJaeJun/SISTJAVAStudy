/*==========================================================
					■■■ 배열 ■■■
			    	  - 배열의 복사
==========================================================*/ 

// ○ 실습 문제
// 임의의 배열(a,b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2,3,7,10,11}
// int[] b = {3,6,10,14}

// 실행 예)
// 첫 번째 배열 요소를 입력하세요(공백 구분) : 
// 두 번째 배열 요소를 입력하세요(공백 구분) :
// 2 3 7 10 11 6 14
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
public class Test099
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		int[] temp;
		int i,j;

		System.out.print("첫 번째 배열 요소를 입력하세요(공백 구분) : ");
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.print("두 번째 배열 요소를 입력하세요(공백 구분) : ");
		for(i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		
		temp = (int[])b.clone();
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					temp[j] =0; 
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		for(i=0;i<temp.length;i++)
		{
			if(temp[i]!=0){
				System.out.print(b[i]+ " ");
			}
		}
		System.out.println();
	}
}
//실행 결과
/*

*/