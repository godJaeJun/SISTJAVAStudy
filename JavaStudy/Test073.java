/*=====================================
���� Ŭ������ �ν��Ͻ� ����
-Ŭ���� ���� �ǽ�
======================================*/

//�۽ǽ� ����
//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
//��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ� �� �� �ֵ��� �Ѵ�.

//���� ��)
//������ �� ���� �Է�(���� ����) : 10 5
//������ ������ �Է�(+ - * /)	 :+
//>> 10 + 5 = 15
//����Ϸ��� �ƹ� Ű�� ��������...
/*import java.util.Scanner;
import java.io.IOException;
class Cal
{
	int a,b,sum;
	char c;

	void input()throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /)	: ");
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
			System.out.print("�Ǻ� �Ұ�");

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
	//�� �ֿ� �Ӽ� ����
	int su1, su2;
	char op;

	//�� �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /)	 :");
		op =(char)System.in.read();
	
	}

	//�� �޼ҵ� ����(��� : ����)
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
	//�� �޼ҵ� ����(���:���)
	void print(int r)
	{	
		System.out.printf(">>%d %c %d = %d\n",su1,op,su2,r);

	}
}



public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//Calculate Ŭ���� ����� �ν���Ʈ ����
		Calculate ob = new Calculate();

		ob.input();
		int result = ob.cal();
		ob.print(result);
	}
}

//���� ���
/*
������ �� ���� �Է�(���� ����) : 5 6
������ ������ �Է�(+ - * /)      :+
>>5 + 6 = 11
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/