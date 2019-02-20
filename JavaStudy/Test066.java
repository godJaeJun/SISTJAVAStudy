/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
				         - return 
==========================================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test066
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int n, s;

		System.out.print("임의의 정수 입력(10 이상) : ");
		n = Integer.parseInt(br.readLine());
		
		if(n<10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다~!!!");
			return;
		}

		s = 0;
		for (int i=1; i<=n; i++)
		{
			s+=i;
		}
		System.out.println("결과 : "+s);
	}
}
//실행 결과
/*
임의의 정수 입력(10 이상) : 1
10 이상의 정수를 입력해야 합니다~!!!
계속하려면 아무 키나 누르십시오 . . .
*/