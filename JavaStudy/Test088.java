/*==========================================================
					■■■ 배열 ■■■
			     - 배열의 배열(2차원 배열)
==========================================================*/
// ○ 실습 문제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5X5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
1   2  3  4  5			i=0
5   1  2  3  4			i=1
4   5  1  2  3			i=2
3   4  5  1  2			i=3
2   3  4  5  1			i=4
계속하려면 아무 키나 누르세요...
*/
public class Test088
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=n;
				n++;
			}
				if(n==5){
					n=1;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("%3d",arr[i][j]);	
			}
			System.out.println();
		}
	}
}
//실행결과
/*

*/