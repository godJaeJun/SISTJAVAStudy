/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
					   - �ݺ��� (while�� ) �ǽ�
==========================================================*/

// �� �ǽ� ����
// 1���� 100������ ���� �߿���
// ¦������ ���� ����Ͽ� ������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ���ǹ��� ������� �ʵ��� �ϸ�
// while�ݺ����� ����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// 1���� 100������ ���� �� ¦���� �� : 
// ����Ϸ��� �ƹ� Ű�� ��������...
public class Test044
{
	public static void main(String[] args)
	{
		int num = 1;
		int sum = 0;
		while(num<=100)
		{
			sum += (num%2==0?num:0);
			num++;
		}
		System.out.println("1���� 100������ ���� �� ¦���� �� : "+sum);
	}
}
// ������
/*
1���� 100������ ���� �� ¦���� �� : 2550
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/