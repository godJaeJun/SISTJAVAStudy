/*==========================================================
			���� ���������� �������� ����
			- ���� ������ �ʱ�ȭ �׽�Ʈ �ǽ�
==========================================================*/

// Test068.java �� ��~!!!

public class Test069
{
	// ���� ���� ����
	int a;
	//-- ���� ������ ����ϴ� �������� �ʱ�ȭ�� �������� �ʾ��� ���
	//   �ڵ����� 0���� �ʱ�ȭ ����

	boolean b;
	
	char c;

	double d;

	public static void main(String[] args)
	{
		// Test069 �ν��Ͻ� ����
		Test069 ob = new Test069();

		System.out.println("ob.a : "+ob.a);	
		//--==>> ob.a : 0

		System.out.println("ob.b : "+ob.b);
		//--==>> ob.b : false

		System.out.println("ob.c : "+ob.c);
		//--==>> ob.b : 

		System.out.println("ob.d : "+ob.d);
		//--==>> ob.b : 0.0
	}
}
//������
/*
ob.a : 0
ob.b : false
ob.c :
ob.d : 0.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/