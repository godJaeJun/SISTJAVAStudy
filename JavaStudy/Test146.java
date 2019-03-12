/*==========================================================
			■■■ 예외(Exception) 처리 ■■■ 
==========================================================*/

// Test145.java 파일과 비교~!!!

class Demo2
{
	// 주요 속성 구성
	private int value;
	
	// setter
	public void setValue(int value) throws Exception
	{
		if(value<=0)
			throw new Exception("value 는 0보다 작거나 같을 수 없습니다.");
			//-- 새로운 예외 발생~!!! throws가아닌 throw

		this.value=value;
	}

	// getter
	public int getValue()
	{
		return value;
	}
}

public class Test146
{
	public static void main(String[] args)//throws Exception
	{
		Demo2 ob = new Demo2();
		
		try
		{
			ob.setValue(-10);		
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
//실행 결과
/*
java.lang.Exception: value 는 0보다 작거나 같을 수 없습니다.
계속하려면 아무 키나 누르십시오 . . .	
*/