/*==========================================================
				■■■ 클래스 고급 ■■■
				 - 인터페이스(Interface) 
==========================================================*/

// ○ 실습 문제
//    성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백구분) : 1921004 이원영
// 국어 영어 수학 점수 입력   (공백구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백구분) : 1921005 이재준
// 국어 영어 수학 점수 입력   (공백구분) : 85 70 65

// 1921004 이원영  90 100 85     275   91
//				   수  수 우   
// 1921005 이재준  85  70 65     220   73
//				   우  미 양

// 계속하려면 아무 키나 누르세요...

// 90 ~ 100 : 수
// 80 ~ 89  : 우
// 70 ~ 79  : 미
// 60 ~ 69  : 양
// 나머지   : 가

//Scanner를 불러온다.
import java.util.Scanner;

// 속성만 존재하는 클래스 -> 자료형 활용
class Record
{
	String hak, name;		//-- 학번, 이름
	int kor,eng,mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk
{
	public void set();		//-- set()   추상메소드 정의
	public void input();	//-- input() 추상메소드 정의
	public void print();	//-- print() 추상메소드 정의
}	

// 문제 해결 과정에서 설계해야 할 클래스
class SungjuckImpl implements Sungjuk
{
	Record[] r;									
	
	@Override									
	public void set()
	{
		Scanner sc = new Scanner(System.in);	
		int num=0;								
		do{										
		System.out.print("인원 수 입력(1~10) : "); 
		num = sc.nextInt();						
		}while(num<1||num>10);					

		r = new Record[num];					
	}

	@Override									
	public void input()
	{
		Scanner sc = new Scanner(System.in);		

		for(int i=0;i<r.length;i++)				
		{
			r[i] = new Record();				
			System.out.print((i+1)+"번째 학생의 학번 이름 입력(공백구분) : ");
			r[i].hak = sc.next();				
			r[i].name = sc.next();				
			System.out.print("국어 영어 수학 점수 입력   (공백구분) : ");
			r[i].kor = sc.nextInt();			
			r[i].eng = sc.nextInt();			
			r[i].mat = sc.nextInt();			

			r[i].tot = r[i].kor+r[i].eng+r[i].mat;	
			r[i].avg = r[i].tot/3;					
		}
	}

	@Override
	public void print()							
	{
		System.out.println();					
		int a[] = new int[3];					
		
		for(int i=0;i<r.length;i++)				
		{
			a[0] = r[i].kor;					
			a[1] = r[i].eng;					
			a[2] = r[i].mat;					
			System.out.printf("%s %s\t%4d%4d%4d\t%d\t%d\n",r[i].hak,r[i].name,r[i].kor,
				r[i].eng,r[i].mat,r[i].tot,r[i].avg);	
			System.out.printf("\t\t  ");				
			for(int j=0;j<3;j++)						
			{
				if(a[j]>=90&&a[j]<=100)					
				{
					System.out.printf("수  ");
				}
				else if(a[j]>=80)						
				{
					System.out.printf("우  ");
				}
				else if(a[j]>=70)						
				{
					System.out.printf("미  ");
				}
				else if(a[j]>=60)						
				{
					System.out.printf("양  ");
				}
				else{									
					System.out.printf("가  ");
				}
			}
			System.out.println();						
		}
	}
}

public class Test116
{
	public static void main(String[] args)
	{
		
		Sungjuk ob;										

		ob = new SungjuckImpl();						
	
		ob.set();										
		ob.input();										
		ob.print();
	}
}
//실행결과
/*
인원 수 입력(1~10) : 3
1번째 학생의 학번 이름 입력(공백구분) : 1921004 이원영
국어 영어 수학 점수 입력   (공백구분) : 100 90 80
2번째 학생의 학번 이름 입력(공백구분) : 1921005 이재준
국어 영어 수학 점수 입력   (공백구분) : 80 70 60
3번째 학생의 학번 이름 입력(공백구분) : 1921006 이이이
국어 영어 수학 점수 입력   (공백구분) : 50 60 100

1921004 이원영   100  90  80    270     90
                  수  수  우
1921005 이재준    80  70  60    210     70
                  우  미  양
1921006 이이이    50  60 100    210     70
                  가  양  수
계속하려면 아무 키나 누르십시오 . . .
*/