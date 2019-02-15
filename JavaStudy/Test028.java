/*==========================================================
			���� ������(Operator) ����
			- ���� ������ == ���� ������
==========================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, �Է� �����ʹ� BufferedReader �� readLine()�� ���� �Ѱܹ��� �� �յ��� �Ѵ�.
// ����, ���� ������(���� ������)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 -> ����
// ����Ϸ��� �ƹ� Ű��...
// ������ ���� �Է� : 257
// 257 -> ���
// ����Ϸ��� �ƹ� Ű��...
// ������ ���� �Է� : 0
//  0 -> ��
// ����Ϸ��� �ƹ� Ű��...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		// �� Version
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int num;
		String strNum;
		
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		strNum = num<0 ? "����" : num==0 ? "��" : "���";

		System.out.printf("%d -> %s\n",num,strNum);
		*/

		// ����� Version

		// �ֿ� ���� ����
		
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//-- ����� �Է°��� ���� ����
		String strResult;	//-- �������� ������� ������ �Ǻ� ����� ���� ����

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		/*
		n �� 0���� ũ�� -> true  -> ���
		n �� 0���� �۴� -> false -> n�� 0���� �۴� -> ���� ->false -> ��
		*/

		strResult = n>0 ? "���" : (n<0 ? "����" : "��");

		// ��� ���
		System.out.println();
		System.out.println(n +" ->" + strResult);
	}
}
//���� ���
/*
������ ���� �Է� : -12
-12 -> ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/