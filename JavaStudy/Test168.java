/*==========================================================
			■■■ 자바의 기본 입출력(I/O) ■■■ 
==========================================================*/

// Reader 실습

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in         : 자바의 표준 입력 스트림 → 바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로 변환
		//					   (변환기, 번역기 역할 수행)
		// Reader            : 문자 기반 스트림 객체
		Reader rd = new InputStreamReader(System.in);
		
		System.out.println("문자열 입력(종료:Ctrl+z)");
		
		while( (data = rd.read())!= -1 )
		{
			ch = (char)data;
			
			//System.out.print(ch);
			
			System.out.write(ch);	//-- 한글 깨짐
		}
	}
}
//실행결과
/*

*/