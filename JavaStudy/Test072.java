/*================================
���� Ŭ������ �ν��Ͻ� ���� 
=================================*/

//�۽ǽ� ����
//����ڷκ��� ������ ������ �Է¹޾�
//1���� �Է¹��� �� ���������� �����Ͽ�
//������� ����ϴ� ���α׷��� �����Ѵ�.

//��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//����, �Է� ó�� �������� BufferedReader �� readLine()�� ����ϸ�,
//�Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
//�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է�(1~1000) : 1002
//������ ���� �Է�(1~1000) : -20
//������ ���� �Է�(1~1000) : 100
//>> 1~ 100������ ��: 5050
//����Ϸ��� �ƹ� Ű�� ��������

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class AddCal
{
	int a,sum=0;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		do
		{
		System.out.print("������ ���� �Է�(1~1000) : ");
		a = Integer.parseInt(br.readLine());
		}
		while( a < 1 || a > 1000);
	}

	void calSum()
	{	
		for (int n=1;n<=a;n++ )
		{
			sum += n;
		}
	}
	void print()
	{
		System.out.printf(">>1~ %d������ �� : %d\n",a,sum);
	}
}
		


public class Test072
{
	public static void main(String[] args) throws IOException
	{
		AddCal ob = new AddCal();

		ob.input();
		ob.calSum();
		ob.print();
		
	}

}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	//�ֿ� ���� ����(������� �Է°��� ��Ƶ� ����)
	int su;
	//�Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		do
		{
		System.out.print("������ ���� �Է�(1~1000) : ");
		su = Integer.parseInt(br.readLine());
		}while(su<1 || su>1000);
		
		
	}
	//���� �޼ҵ� ����
	int calculate()
	{	
		int result=0; 
		for (int i=1;i<=su ;i++ )
			result += i;
		return result;
	}
	//��� ��� �޼ҵ� ����
	void print(int sum)
	{
		System.out.printf("1~%d������ �� : %d\n",su,sum);
	}


//import java.io.IOException;
//main() �޼ҵ带 �����ϰ� �ִ� �ܺ� Ŭ����

}

public class Test072
{
	public static void main(String[] args)throws IOException
	{
		//HapŬ���� �ν��Ͻ� ����

		Hap ob = new Hap();
	
		//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� throws IOException ó��
		 ob.input();

		//������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ�� �� int�� ����� ��ȯ ��޾Ƴ��� �ֵ��� ó��
		int s = ob.calculate();

		//������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ�� �� �Ű����� ����
		ob.print(s);

	}

}


//������
/*

������ ���� �Է�(1~1000) : 500
1~500������ �� : 125250
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/