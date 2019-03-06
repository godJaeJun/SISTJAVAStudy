/*==========================================================
			■■■ 자바의 주요(중요) 클래스 ■■■ 
					 - Wrapper 클래스
==========================================================*/


public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		long aa = 1111L;
	
		Byte b2 = new Byte(b);		//-- boxing
		Integer i2 = new Integer(i);//-- boxing
		System.out.println(b2);		//--==>> 3
		System.out.println(i2);		//--==>> 256
		
		print(b2);
		print(i2);
		print(aa);

		byte b3 = b2.byteValue();	//-- unboxing
		int i3 = i2.intValue();		//-- unboxing

		// check~!!!
		int i4 = b2.byteValue();	//-- unboxing 
		//byte b4 = i2.intValue();  //--==>> 에러 발생
		byte b4 = i2.byteValue();
		

		System.out.println("b3 :"+b3);
		System.out.println("i3 :"+i3);
		
		// check~!!!
		System.out.println("i4 :"+i4);
		System.out.println("b4 :"+b4);	//0이나옴 제대로안됨
	}
	
	// ※ java.lang.Number 클래스(추상클래스)는
	//    모든 Wrapper 클래스들의 부모 클래스(슈퍼 클래스,상위 클래스)이다.
	//    b2, i2 자료형이 Number n 에 넘어오면서
	//    업 캐스팅이 일어나게 된다. (Auto-Boxing 선행)
	public static void print(Number n)
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}

}
//실행 결과
/*

*/