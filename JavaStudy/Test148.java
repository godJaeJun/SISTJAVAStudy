/*==========================================================
			■■■ 예외(Exception) 처리 ■■■ 
				   - 다른 예외 다시 던지기
==========================================================*/
public class Test148
{
	public int getValue(int value) throws Exception
	{
		int a = 0;

		try
		{
			a = getData(-2);
			//--ⓐ 유형의 빨간 폭탄 잡아내기 
		}
		catch (Exception e)
		{
			// ⓐ 유형의 빨간 폭탄 처리
			System.out.println("printStackTrace......(getValue)");
			e.printStackTrace();
			
			// 예외 발생 -> ⓑ 유형의 파란 폭탄
			throw new Exception("value 가 음수입니다.");
		}

		return a;
	}

	public int getData(int data) throws Exception
	{
		if(data<0)
			throw new Exception("data가 0보다 작습니다.");
			//-- 예외 발생 ⓐ 유형의 빨간 폭탄

		return data+10;
	}

	public static void main(String[] args)
	{
		Test148 ob = new Test148();
		
		try{
			// ⓑ 유형의 파란 폭탄 잡아내기
			int a = ob.getValue(-2);	
			System.out.println("a : "+a);
		}
		catch(Exception e)
		{
			// ⓑ 유형의 파란 폭탄 처리
			System.out.println("printStackTrace.......(main)");
			e.printStackTrace();
		}
	}
}
// 실행결과
/*
printStackTrace......(getValue)
java.lang.Exception: data가 0보다 작습니다.
        at Test148.getData(Test148.java:32)
        at Test148.getValue(Test148.java:13)
        at Test148.main(Test148.java:44)
printStackTrace.......(main)
java.lang.Exception: value 가 음수입니다.
        at Test148.getValue(Test148.java:23)
        at Test148.main(Test148.java:44)
계속하려면 아무 키나 누르십시오 . . .
*/