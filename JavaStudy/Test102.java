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
	
		int i,j;

		System.out.print("Source Data : ");
		
		// 향상된 for문 -> forEach 구문 
		for (int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();

		// Selection Sort 구현
		for(i=0;i<a.length-1;i++)	// 0 1 2 3 (4) -> 비교 기준 데이터의 인덱스
		{
			for (j=i+1; j<a.length; j++) // 0 - 1 2 3 4 ,1 - 2 3 4,2 - 3 4, 3 - 4
			{
				if(a[i]>a[j])		
				{
					// 자리 바꾸기
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
				}
			}
		}

		// 결과물 출력 
		System.out.print("Sorted Data : ");
		for(int n:a)
		{
			System.out.print(n+ " ");
		}
		System.out.println();
	}
}
//실행결과
/*
Source Data : 52 42 12 62 60 70 3 9 100 2 1 77
Sorted Data : 1 2 3 9 12 42 52 60 62 70 77 100
계속하려면 아무 키나 누르십시오 . . .
*/