/*==========================================================
			■■■ 연산자(Operator) ■■■
				-비트 단위 연산자
==========================================================*/

public class Test023
{
	public static void main(String[] args)
	{
		int a = 13, b =7;
		int c,d,e;

		c = a & b;	//1101 & 0111 => 0101 => 5 
		d = a | b;  //1101 | 0111 => 1111 => 15
		e = a ^ b;  //1101 ^ 0111 => 1010 => 10

		System.out.printf("a & b = %d\na | b = %d\na ^ b = %d\n",c,d,e);
	}
}
//실행결과
/*
a & b = 5
a | b = 15
a ^ b = 10
계속하려면 아무 키나 누르십시오 . . .
*/