/*==========================================================
			���� �ڹ� �⺻ ���α׷��� ����
		   -�ڹ��� �⺻ ����� : System.in.read()
==========================================================*/

// ���� ��)
// �� ���� �Է� : G
// �� �ڸ� ���� �Է� : 7

// >> �Է��� ���� : G
// >> �Է��� ���� : 7
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
�� ��System.in.read()�� �޼ҵ�� �� ���ڸ� �����´�.
	��, �ϳ��� ���ڸ� �Է¹޾� �Է¹��� ������
	ASCII Code ���� ��ȯ�ϰ� �ȴ�.
*/

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ����
		char ch;			//-- �Է¹��� ���ڸ� ���� ����
		int n;				//-- �Է¹��� ������ ���� ����
	
		// �� ���� �� ó��
		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();
		System.in.read();
		System.in.read();

		System.out.print("�� �ڸ� ���� �Է� : ");
		n = System.in.read() - 48;
		
		// �� ��� ���
		System.out.println("\n>> �Է��� ���� : "+ch);
		System.out.println(">> �Է��� ���� : "+n);
	}
}