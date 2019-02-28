/*
※ 문제 인식 및 분석
   - 서기 1년 1월 1일 : 월요일
   - 연도가 4의 배수이면서 100의 배수가 아니거나,
     400의 배수이면 2월은 29일(윤년),
	 나머지 2월은 28일(평년)
   - 2019년 7월 달력을 그린다고 가정하면
     1. 1. 1. ~ 2018.6.30 까지의 전체 날 수를 구한다,
	 그 날 수에 +1 연산을 수행하면... (2019년 7월 1일의 요일 확인)
	 7월의 달력 그릴 준비 끝~!!!
  
   - 요일 = 전체날수 % 7
     요일 = 0 -> 일요일
	        1 -> 월요일
			   .
			   .
			6 -> 토요일
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test100_1
{
	public static void main(String[] args)throws IOException;
	{
		
	}
} 