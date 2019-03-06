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
	Record[] r;									// Record형태의 배열을 생성해준다.
	
	@Override									// set() 메소드 오버라이딩
	public void set()
	{
		Scanner sc = new Scanner(System.in);	// Scanner 인스턴스 생성
		int num=0;								// 사용자에게 입력받을 변수 선언(인원수)
		do{										// 한번은 입력받아야 하기 때문에 do while문을 사용한다.
		System.out.print("인원 수 입력(1~10) : "); // 인원 수 입력 안내메세지
		num = sc.nextInt();						// 인원 수를 입력받는다.
		}while(num<1||num>10);					// 사용자가 1~10사이의 정수를 입력받을 때 까지 반복문을 수행.

		r = new Record[num];					// 사용자에게 입력받은 정수만큼 레코드형태의 배열의 방을 만들어준다.
	}

	@Override									// input() 메소드 오버라이딩
	public void input()
	{
		Scanner sc = new Scanner(System.in);	// Scanner 인스턴스 생성	

		for(int i=0;i<r.length;i++)				// for문으로 입력받은 수만큼 반복문을 실행시켜준다.
		{
			r[i] = new Record();				// 반복이 될때마다 Record인스턴스를 생성해 배열방안에 넣어준다.
			System.out.print((i+1)+"번째 학생의 학번 이름 입력(공백구분) : ");
			r[i].hak = sc.next();				// 학번을 입력받는다.
			r[i].name = sc.next();				// 이름을 입력받는다.
			System.out.print("국어 영어 수학 점수 입력   (공백구분) : ");
			r[i].kor = sc.nextInt();			// 국어점수를 입력받는다.
			r[i].eng = sc.nextInt();			// 영어점수를 입력받는다.
			r[i].mat = sc.nextInt();			// 수학점수를 입력받는다.

			r[i].tot = r[i].kor+r[i].eng+r[i].mat;	// 총합을 계산해준다.
			r[i].avg = r[i].tot/3;					// 평균을 계산해준다.
		}
	}

	@Override
	public void print()							// print() 메소드 오버라이딩
	{
		System.out.println();					// 개행
		int a[] = new int[3];					// 사용자의 국어 영어 수학 점수를 저장할 배열을 선언해준다.
		
		for(int i=0;i<r.length;i++)				// 인원수 만큼 반복문 수행
		{
			a[0] = r[i].kor;					// 국어점수를 넣어주고
			a[1] = r[i].eng;					// 영어점수를 넣어주고
			a[2] = r[i].mat;					// 수학점수를 넣어준다.
			System.out.printf("%s %s\t%4d%4d%4d\t%d\t%d\n",r[i].hak,r[i].name,r[i].kor,
				r[i].eng,r[i].mat,r[i].tot,r[i].avg);	// 출력문
			System.out.printf("\t\t  ");				// tab으로 글자위치를 맞춘다.
			for(int j=0;j<3;j++)						// 3번 반복을 수행하면서 국영수의 등급을 찍어준다.
			{
				if(a[j]>=90&&a[j]<=100)					// 90~100은 수
				{
					System.out.printf("수  ");
				}
				else if(a[j]>=80)						// 80~89는 우
				{
					System.out.printf("우  ");
				}
				else if(a[j]>=70)						// 70~79는 미
				{
					System.out.printf("미  ");
				}
				else if(a[j]>=60)						// 60~69는 양
				{
					System.out.printf("양  ");
				}
				else{									// 나머지는 가
					System.out.printf("가  ");
				}
			}
			System.out.println();						// 개행
		}
	}
}

public class Test116
{
	public static void main(String[] args)
	{
		
		Sungjuk ob;										

		ob = new SungjuckImpl();						// 업 캐스팅 수행(Sungjuck인터페이스가 SungjuckImpl의 상위이기 때문에)
	
		ob.set();										// 다운 캐스팅을 안해도 되는것이 이미set input print가 정의되어 있다.
		ob.input();										// 만약 정의되어있지 않은 메소드를 사용할때는 다운캐스팅을 수행한다.
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