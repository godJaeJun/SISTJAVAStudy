/*==========================================================
			■■■ 자바의 기본 프로그래밍 ■■■
		  - 자바의 기본 입출력 : java.util.Scanner
==========================================================*/
// ※ java.util.Scanner
//    단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//    디폴트(default)로 사용되는 단락 문자는 공백이다.
//    작성된 다음 토큰은 『next()』 메소드를 사용
//    다른 형태의 값으로 변환할 수 있다. 

import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc= new Scanner(System.in);
		
		// ○ 주요 변수 생성
		String name;			//--이름
		int kor,eng,mat,tot;	//--국어,영어,수학,총점
		
		// ○ 연산 및 처리
		System.out.print("이름 국어점수 영어점수 수학점수 입력(공백구분) : ");
		// 예) 조현우 90 80 70

		// ※ 사용자가 입력한 데이터를 각 변수에 담아내기
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor+eng+mat;		//--총점 산출
		// ○ 결과 출력
		System.out.println();
		System.out.printf("이름 : %s%n",name);
		System.out.printf("총점 : %d%n",tot);
	}
}
//실행결과
/*
이름 국어점수 영어점수 수학점수 입력(공백구분) : 이재준 90 80 70

이름 : 이재준
총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/