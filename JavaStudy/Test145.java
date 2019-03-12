/*==========================================================
			■■■ 예외(Exception) 처리 ■■■ 
==========================================================*/

// Test146.java 파일과 비교~!!!

class Demo
{
	private int value;
	
	//setter
	public void setValue(int Value)
	{
		if(value<=0)
			return;			//메소드의 종료

		this.value = value;
	}
	
	//getter
	public int getValue()
	{
		return value;
	}
}

public class Test145
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
		
	}
}
//실행 결과
/*
	
*/