/*================================= =========================
			■■■ 자바 기본 프로그래밍 ■■■
					 -변수와 자료형
		   -자바의 기본 입출력 : BufferedReader 
==========================================================*/

// 사용자로부터 이름과 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 이재준
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

//===[결과]===
// 이름 : 한승원
// 총점 : 240
//=============
//계속하려면 아무 키나 누르세요...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//주요 변수 선언
		String name;		//이름 
		int sub1,sub2,sub3,total;  //국어 영어 수학 총점

		//연산 및 출력
		System.out.print("이름을 입력하세요 : ");
		// 1. 이름을 입력받는다.
		name = br.readLine();
		System.out.print("국어 점수 입력 : ");
		// 2. 국어점수를 입력받는다.
		sub1 = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력 : ");
		// 3. 영어점수를 입력받는다.
		sub2 = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 입력 : ");
		// 4. 수학점수를 입력받는다.
		sub3 = Integer.parseInt(br.readLine());
		
		// 5. 총합을 계산한다.
		total=sub1+sub2+sub3;
		
		// 6. 출력
		System.out.println("\n===[결과]===");
		System.out.printf("이름 : %s\n총점 : %d\n=============\n",name,total);
		*/

		//강사님 Version
		//InputStreamReader 인스턴스 생성 + BufferedReader 인스턴스 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//주요 변수 선언
		String strName;				//--이름 변수
		int nKor,nEng,nMat,nTot;	//--국어,영어,수학,총점

		//추가 변수 선언
		String strTemp;

		// 연산 및 처리
		// 사용자에게 안내 메세지 출력 ( 이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");
		
		// 사용자가 입력한 값( 외부 데이터 )을 변수에 담아내기
		strName = br.readLine();

		// 사용자에게 안내 메세지 출력 ( 국어점수 입력 안내 )
		System.out.print("국어 점수 입력 : ");

		// 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();			//-- 문자열 임시 저장
		nKor = Integer.parseInt(strTemp);	//-- 임시저장 데이터 형 변환 후 국어점수 변수에 담아내기
		
		// 사용자에게 안내 메세지 출력 ( 영어점수 입력 안내)
		System.out.print("영어 점수 입력 : ");
		strTemp = br.readLine();			//--문자열 임시 저장
											//  (기존 국어점수에 덮어쓰기)
		nEng = Integer.parseInt(strTemp);	//--임시저장 데이터 형 변환 후
											//  영어점수 변수에 담아내기
		// 사용자에게 안내 메세지 출력 ( 수학점수 입력 안내)
		System.out.print("수학 점수 입력 : ");

		// 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();			//--문자열 임시 저장
											//  (기존 영어점수에 덮어쓰기)
		nMat = Integer.parseInt(strTemp);	//--임시저장 데이터 형 변환 후
											//  수학점수 변수에 담아내기
		
		// 입력된 데이터들을 종합하여 총점 산출하기
		nTot = nKor + nEng + nMat;		
		
		// 결과 출력
		//System.out.println();	//개행
		System.out.println("\n===[결과]===");
		System.out.println("이름 : "+strName);
		System.out.println("총점 : "+nTot);
		System.out.println("==============");
		
	}
}

//실행결과
/*
이름을 입력하세요 : 이재준
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

===[결과]===
이름 : 이재준
총점 : 240
=============
계속하려면 아무 키나 누르십시오 . . .
*/