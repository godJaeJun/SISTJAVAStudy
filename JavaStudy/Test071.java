/*================================
���� Ŭ������ �ν��Ͻ� ���� 
=================================*/

//�۽ǽ� ����
//���� ���̿� �ѷ� ���ϱ�

//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����������(������) �����Ѵ�.
//(Ŭ������ : CircleTest�� CircleTest.java)

//���� ���� = ������ * ������ * 3.141592
//���� �ѷ� = ������ * 2 * 3.141592

//���� ��)
//������ �Է� : xxx

//>>�������� xx�� ����
//>>���� : xxx.xx
//>>�ѷ� : xxx.xx
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		CircleTest ob = new CircleTest();
		
		ob.input();
		double length = ob.calLength();
		double area = ob.calArea();
		ob.print(area,length);
	}
}

//������
/*
������ �Է� : 5
>>�������� 5�� ����
>>���� : 78.54
>>�ѷ� : 31.42
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/