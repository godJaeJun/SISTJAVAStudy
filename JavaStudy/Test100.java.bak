/*==========================================================
					■■■ 만년달력 ■■■
==========================================================*/

// 실행 예)
// 『연도』를 입력하세요 : 2019
// 『월』을 입력하세요   : 7
/*
	[ 2019년 7월]

일 월 화 수 목 금 토
====================
   1   2  3  4  5  6
7  8   9  10 11 12 13
14 15 16 17 18 19 20
21 22 23 24 25 26 27
28 29 30 31
=====================
*/


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test100
{
	public static void main(String[] args) throws IOException
	{
		/*
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		int year,month;
		int nalsu=1;
		int[] aa = {31,28,31,30,31,30,31,31,30,31,30,31};
		int cnt=0;

		// 안내메세지와 연도와 월 입력받기
		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("『월』을 입력하세요   : ");
		month = sc.nextInt();
		
		// 윤년 구분하기
		if(year%4==0&&year%100!=0||year%400==0)
		{
			aa[1] = 29;
		}
		else
		{
			aa[1] = 28;
		}
		
		// 입력받은달 전년까지의 합 구해서 더해준다.
		nalsu += (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		// 입력받은달 전달까지의 합 구해서 더해준다.
		for(int i=0;i<(month-1);i++)
			nalsu += aa[i];
	
		System.out.printf("\n\t\t[ %d년 %d월 ]\n",year,month);
		System.out.println("\n일\t월\t화\t수\t목\t금\t토");
		System.out.println("=================================================");	
		
		for(int j=0;j<nalsu%7;j++)
		{
			System.out.printf("  \t");
				cnt++;
		}

		for(int i=1;i<=aa[month-1];i++)
		{
			System.out.printf("%2d\t",i);
			cnt++;
			// 한줄출력 공백
			if(cnt%7==0)
				System.out.println();
		}
		System.out.println("\n=================================================");
		*/
		// BuffreredReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언 및 초기화
		// 각 달이 담고있는 마지막 날짜(매 월의 최대 날짜)
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		// 확인
		//System.out.println(days.length);

		int nalsu, y, m, w;

		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("『월』을 입력하세요 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		//-------------------------------여기까지 수행하면 유효한 년도, 월 입력한 상태~!!!

		if((y%4==0 && y%100!=0) || y%400==0)
		{
			days[1] = 29;
		}

		//-- else 구문은
		//   현재 days[1] 가 28로 입력되어 있는 상태이기 때문에
		//   생략이 가ㅏ능한 구문이 된다.

		// 1년 1월 1일 ~ 입력받은년도 이전년도의 12월 31일 까지의
		// 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// 입력받은년도(해당년도) 1월 1일 ~ 입력한 월의 이전 월 까지의
		// 날 수 누적 연산
		for(int i=0;i<(m-1);i++)
		{
			nalsu+=days[i];
		}
		//입력받은 월의 1일
		nalsu +=1;			//++nalsu
		
		// 확인
		//System.out.println(nalsu);

		//-----------------------여기가지 수행하면 모든 날 수에 대한 종합 완료~!!!

		// 요일 산출
		// : 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = nalsu%7;
		//System.out.println(w);	//--==>> 1 -> 2019년 7월 1일 ->월요일
		
		// 출력(달력 그리기) 
		System.out.println();
		System.out.println("\t [ "+ y+"년 "+m+"월 ]");
		System.out.println();
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");	//두 칸 공백
		System.out.println("============================");
		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<=w; i++)
		{
			System.out.print("    ");	// 네 칸 공백
		}

		// 확인
		//System.out.printf("%4d",1);
		
		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1];i++)
		{
			System.out.printf("%4d",i);
			w++;						//-- 날짜가 증가하는 만큼 요일도 함께 증가할 수 있도록 처리
			if(w%7==0)//일요일
			{
				System.out.println();	// 개행
			}
		}
		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이 경우에는 추가 개행을 하지 않도록 처리
		if(w%7!=0)
			System.out.println();		

		System.out.println("============================");
	}
}
//실행결과
/*
『연도』를 입력하세요 : 2019
『월』을 입력하세요   : 2

                [ 2019년 2월 ]

일      월      화      수      목      금      토
=================================================
                                         1       2
 3       4       5       6       7       8       9
10      11      12      13      14      15      16
17      18      19      20      21      22      23
24      25      26      27      28
=================================================
계속하려면 아무 키나 누르십시오 . . .


『연도』를 입력하세요 : 2019
『월』을 입력하세요 : 8

         [ 2019년 8월 ]


  일  월  화  수  목  금  토
============================
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31
============================
계속하려면 아무 키나 누르십시오 . . .
*/