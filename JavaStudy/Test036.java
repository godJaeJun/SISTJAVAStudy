/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
					   - if ~ else�� �ǽ�
==========================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 4
// �� ��° ���� �Է� : 8
// �� ��° ���� �Է� : 73

// >> ���� ��� : 4 8 73
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test036
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,num3;
		int max=0,mid=0,low=0;
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());

		if(num1>=num2 && num1>=num3)
		{
			max = num1;
			mid = (num2<=num3)?num3:num2;
			low = (num2>=num3)?num3:num2;
		}
		else if(num2>=num1&&num2>=num3)
		{
			max=num2;
			mid = (num1<=num3)?num3:num1;
			low = (num1>=num3)?num3:num1;
		}
		else if(num3>=num1&&num3>=num2)
		{
			max=num3;
			mid = (num2<=num1)?num1:num2;
			low = (num2>=num1)?num1:num2;
		}
		System.out.printf("\n>> ���İ�� : %d %d %d\n",low,mid,max);
		*/
		// ����� Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;	//-- ����ڰ� �Է��ϴ� ������ ������ ���� ����
		int temp;		//-- �ӽ� ���� ����(�� ��)
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3

		// 1. ù ��° ������ �� ��° �������� ũ�ٸ�...
		// �� ������ �ڸ��� �ٲ۴�.
		if(a>b){
			temp = a;
			a = b;
			b = temp;
		}
		// 2. �� ��° ������ �� ��° �������� ũ�ٸ�...
		// �� ������ �ڸ��� �ٲ۴�.
		if(b>c)
		{
			temp = b;
			b = c;
			c = temp;
		}
		// 3. ù ��° ������ �� ��° �������� ũ�ٸ�...
		// �� ������ �ڸ��� �ٲ۴�.
		if(a>b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		System.out.printf("\n>> ���� ��� : %d %d %d\n",a,b,c);
	}
}
//������
/*
ù ��° ���� �Է� : 25
�� ��° ���� �Է� : 17
�� ��° ���� �Է� : 9

>> ���� ��� : 9 17 25
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
ù ��° ���� �Է� : 96
�� ��° ���� �Է� : 84
�� ��° ���� �Է� : 72

>> ���� ��� : 72 84 96
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
/*
ù ��° ���� �Է� : 15
�� ��° ���� �Է� : 10
�� ��° ���� �Է� : 10

>> ���� ��� : 10 10 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/