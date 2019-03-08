/*==========================================================
			■■■ 자바의 주요(중요) 클래스 ■■■ 
				    - Calendar 클래스
==========================================================*/

// ○ 실습 문제
//    오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//    확인하여 결과를 출력하는 프로그램을 구현한다.
//    단, Calendar 클래스를 활용하여 처리한다.

// 실행 예)
// 오늘 날짜 : 2019-3-8 금요일
// 몇 일 후의 날짜를 확인하고 하십니까? : 200

// ========[확인결과]========
// 200일 후 : 2019-xx-xx x요일
// ==========================
// 계속하려면 아무 키나 누르세요...

// ※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
//    『날짜객체.add(Calendar.DATE,날 수);』

import java.util.Calendar;
import java.util.Scanner;

public class Test139
{
	public static void main(String[] args)
	{
		// Scanner 클래스 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		String[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		// Calendar 클래스 인스턴스 생성
		Calendar cal = Calendar.getInstance();
		
		int y,m,d,w;				//-- 연, 월, 일, 요일
		int num;					//-- 사용자로부터 입력받은 날 수

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		// 현재 연, 월, 일, 요일 확인(가져오기 : get())
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n",y,m,d,week[w-1]);
		
		System.out.print("몇 일 후의 날짜를 확인하고 하십니까? : ");
		num = sc.nextInt();
		
		cal.add(Calendar.DATE,num);
		//cal.set(Calendar.DATE,cal.get(Calendar.DATE)+num);
		//y = cal.get(Calendar.YEAR);
		//m = cal.get(Calendar.MONTH)+1;
		//d = cal.get(Calendar.DATE);
		//w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("\n========[확인결과]========");
		//System.out.printf("%d일 후 : %d-%d-%d %s\n",num,y,m,d,week[w-1]);
		System.out.printf("%d일 후 : %tF %tA \n",num,cal,cal);
		System.out.println("============================");
	}
}
/*7664
오늘 날짜 : 2019-3-8 금요일
몇 일 후의 날짜를 확인하고 하십니까? : 10

========[확인결과]========
10일 후 : 2019-3-18 월요일
============================
계속하려면 아무 키나 누르십시오 . . .
*/