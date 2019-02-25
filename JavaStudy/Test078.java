/*==========================================================
			■■■ 클래스와 인스턴스 ■■■
  - 생성자(Constructor)와 초기화 블럭(Initialized Block)
==========================================================*/
public class Test078
{
	int n;
	int m;
	
	/*클래스에서 독립적으로 연산은 불가능하다.
	n = 10;
	m = 20;
	*/
	
	// 생성자(Constructor)
	Test078()
	{
		n = 100;
		m = 200;
		System.out.println("생성자 실행...");
	}

	//초기화 블럭(Initialized Block) --생성자보다 먼저 실행
	{
		n = 10;
		m = 20;
		System.out.println("초기화 블럭 실행...");
	}
	
	Test078(int n, int m)
	{
		this.n = n;
		this.m = m;

		System.out.println("인자 잇는 생성자 실행...");
	}
	void write()
	{
		System.out.println("n : " + n + ", m : " + m);
	}
	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		//--==>> 초기화 블럭 실행...
		//      생성자 실행...
		//    n : 100, m : 200
		Test078 ob2 = new Test078(1234,5678);
		ob2.write();
		//--==>> 초기화 블럭 실행...
		//		인자 잇는 생성자 실행...
		//		n : 1234, m : 5678
	}
}
//실행결과
/*
초기화 블럭 실행...
생성자 실행...
n : 100, m : 200
초기화 블럭 실행...
인자 잇는 생성자 실행...
n : 1234, m : 5678
계속하려면 아무 키나 누르십시오 . . .
*/