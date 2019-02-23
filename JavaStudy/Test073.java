/*=====================================
■■■ 클래스와 인스턴스 ■■■
-클래스 설계 실습
======================================*/

//○실습 문제
//사용자로부터 임의의 두 정수와 연산자를 입력받아
//사칙 연산을 수행하는 프로그램을 구현한다.
//단, 클래스와 인스턴스의 개념을 활용하여 작성 할 수 있도록 한다.

//실행 예)
//임의의 두 정수 입력(공백 구분) : 10 5
//임의의 연산자 입력(+ - * /)	 :+
//>> 10 + 5 = 15
//계속하려면 아무 키나 누르세요...
/*import java.util.Scanner;
import java.io.IOException;
class Cal
{
	int a,b,sum;
	char c;

	void input()throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /)	: ");
		c = (char)System.in.read();
		System.in.skip(2);

		
	}
	void cal()
	{	
		if (c=='+')
			sum = a + b;
	
		else if(c=='-')
			sum = a - b;

		else if(c=='*')
			sum = a * b;

		else if(c=='/')
			sum = a / b;
		else
			System.out.print("판별 불가");

	}
	void print()
		{
		if(c=='+'&&c=='-'&&c=='*'&&c=='/')
		System.out.printf("%d %c %d = %d\n",a,c,b,sum);
		else
		System.out.println();
		}

	
		
	

		
}


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Cal ob = new Cal();

		ob.input();
		ob.cal();
		ob.print();

	}
}*/
import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	//○ 주요 속성 구성
	int su1, su2;
	char op;

	//○ 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /)	 :");
		op =(char)System.in.read();
	
	}

	//○ 메소드 정의(기능 : 연산)
	int cal()
	{
		int result = 0;
		switch(op)
		{
			case'+':result=su1+su2; break;
			case'-':result=su1-su2; break;
			case'*':result=su1*su2; break;
			case'/':result=su1/su2; break;
		}		
		return result;
		
	}
	//○ 메소드 정의(기능:출력)
	void print(int r)
	{	
		System.out.printf(">>%d %c %d = %d\n",su1,op,su2,r);

	}
}



public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//Calculate 클래스 기반의 인스턴트 생성
		Calculate ob = new Calculate();

		ob.input();
		int result = ob.cal();
		ob.print(result);
	}
}

//실행 결과
/*
임의의 두 정수 입력(공백 구분) : 5 6
임의의 연산자 입력(+ - * /)      :+
>>5 + 6 = 11
계속하려면 아무 키나 누르십시오 . . .
*/