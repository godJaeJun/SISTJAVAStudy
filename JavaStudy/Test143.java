/*==========================================================
			■■■ 예외(Exception) 처리 ■■■ 
==========================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{
	private String[] data = new String[3];

	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int n = 0;

		System.out.print("이름 입력[종료 : Ctrl+z] : ");

		while((str=br.readLine()) != null)
		{
			data[n++] = str;
			System.out.print("이름 입력[종료 : Ctrl+z] : ");
		}
	
		System.out.println("입력된 내용...");
		for(String s : data)
		{
			if(s != null)
				System.out.println(s);
		}
	}
	public static void main(String[] args) throws IOException
	{
		Test143 ob = new Test143();
		ob.proc();
	}
}
//실행결과
/*								
이름 입력[종료 : Ctrl+z] : dㅣ재준
이름 입력[종료 : Ctrl+z] : 이이이
이름 입력[종료 : Ctrl+z] : ㅁㅁㅁ
이름 입력[종료 : Ctrl+z] : ^Z
입력된 내용...
dㅣ재준
이이이
ㅁㅁㅁ
계속하려면 아무 키나 누르십시오 . . .				
*/

/*
이름 입력[종료 : Ctrl+z] : a
이름 입력[종료 : Ctrl+z] : a
이름 입력[종료 : Ctrl+z] : a
이름 입력[종료 : Ctrl+z] : a
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test143.proc(Test143.java:24)
        at Test143.main(Test143.java:38)
계속하려면 아무 키나 누르십시오 . . .
*/