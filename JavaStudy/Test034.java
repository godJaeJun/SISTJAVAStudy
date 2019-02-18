/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
					   - if ~ else�� �ǽ�
==========================================================*/

// �� �ǽ� ����
// ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 14
// ������ �Է�(+ - * /) : +

//>> 10 + 14 = 24
//����Ϸ��� �ƹ� Ű��...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		//�� Version
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2;	
		char m;			//������
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�(+ - * /) : ");
		m = (char)System.in.read();
		
		if(m == '+')
		{
			System.out.printf("\n>> %d + %d = %d\n",num1,num2,(num1+num2));
		}
		else if(m == '-')
		{
			System.out.printf("\n>> %d - %d = %d\n",num1,num2,(num1-num2));
		}
		else if(m=='*')
		{
			System.out.printf("\n>> %d * %d = %d\n",num1,num2,(num1*num2));
		}
		else if(m=='/')
		{
			System.out.printf("\n>> %d / %d = %d\n",num1,num2,(num1/num2));
		}
		else 
		{
			System.out.println("ó���� �� �����ϴ�.(������ �߸��Է�!)");
		}
		*/
		//����� Version
		// ��� 1
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		char op;
		//int temp;
	
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		// "1234" -> Integer.parseInt(); ->1234
		// "abcd" -> Integer.parseInt(); ->(X)

		if(op == '+')
		{
			System.out.printf("\n>> %d + %d = %d\n",a,b,(a+b));
		}
		else if(op == '-')
		{
			System.out.printf("\n>> %d - %d = %d\n",a,b,(a-b));
		}
		else if(op == '*')
		{
			System.out.printf("\n>> %d * %d = %d\n",a,b,(a*b));
		}
		else if(op == '/')
		{
			System.out.printf("\n>> %d / %d = %d\n",a,b,(a/b));
		}
		else{
			System.out.printf("�Է� ������ ������ �����մϴ�.");
		}
		*/
		// ��� 2
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = System.in.read();

		// �׽�Ʈ(Ȯ��)
		//System.out.print(op);
		// + : 43 , -  : 45, * : 42, / : 47
		if(op == 43)
		{
			System.out.printf("\n>> %d + %d = %d\n",a,b,(a+b));
		}
		else if(op == 45)
		{
			System.out.printf("\n>> %d - %d = %d\n",a,b,(a-b));
		}
		else if(op == 42)
		{
			System.out.printf("\n>> %d * %d = %d\n",a,b,(a*b));
		}
		else if(op == 47)
		{
			System.out.printf("\n>> %d / %d = %d\n",a,b,(a/b));
		}
		else{
			System.out.printf("�Է� ������ ������ �����մϴ�.");
		}
		*/
		// ��� 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result=0;
		char op;
	
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		if(op == '+')
			result = a+b;
		else if(op == '-')
			result = a-b;
		else if(op == '*')
			result = a*b;
		else if(op == '/')
			result = a/b;
		
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
	}
}

//������
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 20
������ �Է�(+ - * /) : +

>> 10 + 20 = 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 5
������ �Է�(+ - * /) : -

>> 10 - 5 = 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/