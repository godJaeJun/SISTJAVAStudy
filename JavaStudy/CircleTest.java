import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{
	int r;

	final double PI = 3.141592;
	//BufferedReader �ν��Ͻ��� Ŭ�������ٰ� ������ �ع����� 
	//ȣ���� �Ҷ� CircleTest�� ȣ���Ѱ͸����ε� BufferedReader�� ���̻����ع����Ƿ� ��ȿ��
	//���� �޼ҵ� ���ο� �ν��Ͻ� �����ϴ°��� ����

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	double calLength()
	{		
		double result = ( 2 * r * PI);

			return result;
	}
	double calArea()
	{
			return( r * r * PI);
	}
	void print(double a,double b)
	{
			System.out.println(">>�������� "+r+"�� ����");
			System.out.printf(">>���� : %.2f\n",a);
			System.out.printf(">>�ѷ� : %.2f\n",b);
	}
	
}