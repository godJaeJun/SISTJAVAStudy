/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
					   - if ~ else문 실습
==========================================================*/

// ○ 과제(2019-02-18)
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, if ~ else 조건물을 활용할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000 -> 윤년
// 계속하려면 아무 키나...

// 실행 예)
// 임의의 연도 입력 : 2012
// 2012 -> 윤년
// 계속하려면 아무 키나...

// 실행 예)
// 임의의 연도 입력 : 2018
// 2018 -> 평년
// 계속하려면 아무 키나...

// 실행 예)
// 임의의 연도 입력 : 2018
// 2018 -> 평년
// 계속하려면 아무 키나...

// ※ 윤년의 판별 조건
// 연도가 4의 배수이면서 100의 배수가 아니거나 
// 400의 배수이면 윤년~!!!
// 그렇지 않으면 평년~!!!

import java.io.IOException;			//IOException을 가져온다.
import java.io.BufferedReader;		//BufferedReader를 가져온다.
import java.io.InputStreamReader;	//InputStreamReader를 가져온다.
//Test033 클래스 생성
public class Test033
{	//메인 메소드							
	public static void main(String[] args) throws IOException	//IOException 예외 처리 
	{															//IOException은 BufferedReader의 readLine()이나 System.in.read()를 사용해 입력받을때 생기는 예외이다.
			//BufferedReader인스턴스 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			
			//입력받을 년도
			int year;
			
			//안내 메세지 출력
			System.out.print("임의의 연도 입력 : ");

			//년도를 입력 받는다 문자열 형태로 입력받기 때문에 parseInt로 정수형으로 변환시켜준다.
			year = Integer.parseInt(br.readLine());
			
			// 연도가 4의 배수이면서 100의 배수가 아닐때와 연도가 400의 배수인 것을 or 논리연산을 통해 둘 중에 하나만 참이어도 윤년이 나오게 한다.
			if((year % 4 == 0 && year % 100 !=0) || (year % 400 ==0)){
				System.out.println(year + "-> 윤년");		//윤년 메세지 출력
			}
			else if(year%4 !=0&&year%400!=0)//4의 배수도 아니고 400의 배수도 아닌 것은 평년!
			{
				//평년 메세지 출력
				System.out.println(year + "-> 평년");			
			}
			else{//사용자가 년도를 잘못입력했거나 했을때는 판별이 불가능하기에 else에 넣어준다. 위 두개의 조건이 아닐경우 else로 오게한다.
				System.out.println("판별 불가능한 년도 입니다.");
			}
	}
}

//실행결과
/*
임의의 연도 입력 : 2012
2012-> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 1998
1998-> 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2014
2014-> 평년
계속하려면 아무 키나 누르십시오 . . .
*/