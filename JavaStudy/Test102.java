/*==========================================================
				■■■ 정렬(Sort) 알고리즘 ■■■
				  -- 선택 정렬(Selection Sort)
==========================================================*/

/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     -> 보기좋게... 검색하기 위함

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ...
*/
public class Test102
{
	public static void main(String[] args)
	{
		int[] a = {52,42,12,62,60,70,3,9,100,2,1,77};
		/*
		42 52 12 62 60 0 1
		=====
		12 52 42 62 60 0 2
		==    ==     
		12 52 42 62 60 0 3
		==       ==  
		12 52 42 62 60 0 4
		==          == 
		
		1회전------------------------
		
		*/
		/*
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}
		
		System.out.println("***정렬결과***");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/

		int i,j;

		System.out.print("Source Data : ");
		
		/*
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/

		// 향상된 for문 -> forEach 구문
		for (int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		
	}
}
//실행결과
/*

*/