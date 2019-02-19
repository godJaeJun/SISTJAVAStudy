/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
					   - switch�� �ǽ�
==========================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
// ���� ����� ���ǻ� ���� ���·� ó���ϵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    : 28
// ������ �Է�(+ - * /) : +
//
//>> 10 + 28 = 38
//����Ϸ��� �ƹ� Ű�� ��������...
// 43 45 42 47
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test042
{
	public static void main(String[] args) throws IOException
	{
		/*�� Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		int m;
		
		System.out.print("ù ��° ���� �Է�    : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		m = System.in.read();

		switch(m){
			case 43:															// +�� ASCII�ڵ�
				System.out.printf("\n>> %d + %d = %d\n",num1,num2,(num1+num2));
				break;
			case 45:															// -�� ASCII�ڵ�
				System.out.printf("\n>> %d - %d = %d\n",num1,num2,(num1-num2));
				break;
			case 42:															// *�� ASCII�ڵ�
				System.out.printf("\n>> %d * %d = %d\n",num1,num2,(num1*num2));
				break;
			case 47:															// /�� ASCII�ڵ�
				System.out.printf("\n>> %d / %d = %d\n",num1,num2,(num1/num2));
				break;
			default:
				System.out.printf("\n>> �Է¿���~!!!\n");
				break;
		}
		*/
		//����� Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result;			//�ΰ��� ����, �����
		char op;					//������

		System.out.print("ù ��° ���� �Է�    : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		switch(op)
		{
			case '+': result = a+b; break;
			case '-': result = a-b; break;
			case '*': result = a*b; break;
			case '/': result = a/b; break;
			default : return;				//�޼ҵ��� ����	-> main()�޼ҵ� ���� -> ���α׷��� ����
		}
		
		// �� ��return�� : 1.���� ��ȯ
		//				   2. �޼ҵ� ����
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
		
	}
}
//������
/*
ù ��° ���� �Է�    : 10
�� ��° ���� �Է�    : 20
������ �Է�(+ - * /) : +

>> 10 + 20 = 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է�    : 10
�� ��° ���� �Է�    : 2
������ �Է�(+ - * /) : -

>> 10 - 2 = 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է�    : 10
�� ��° ���� �Է�    : 2
������ �Է�(+ - * /) : *

>> 10 * 2 = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է�    : 10
�� ��° ���� �Է�    : 2
������ �Է�(+ - * /) : /

>> 10 / 2 = 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/ 