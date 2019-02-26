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
1   2  3  4  5			
5   1  2  3  4			
4   5  1  2  3			
3   4  5  1  2			
2   3  4  5  1		
계속하려면 아무 키나 누르세요...
*/
public class Test088
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[5][5];
		int n=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{	
				n = n==6?1:n;
				arr[i][j]=n;
				n = j!=4 ? ++n:n;
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
		*/
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];
		
		// 초기화
		//n->12345/51234/45123/34512/23451 00 11 22 33 44 
		for(int i=0;i<arr.length;i++)		//0 1 2 3 4
		{
			for(int j=i,n=1;n<=5;n++)//0 1 2 3 4
			{
				arr[i][j]=n;
				j++;
				if(j==5) j=0;
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
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/