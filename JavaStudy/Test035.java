/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
					   - if ~ else�� �ǽ�
==========================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ 2�� �������, 3�� �������
// 2�� 3�� �������, 2�� 3�� ����� �ƴ��� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 8
// >>8 -> 2�� ���~!!!
// ����Ϸ��� �ƹ� Ű�� ��������..

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test035
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		if ((num%2==0)&&(num%3==0))
		{
			System.out.println(">>"+num+" 2�� 3�� ����Դϴ�~!!!");
		}
		else if((num%2==0)||(num%3==0))
		{
			System.out.println(">>"+num+ ((num%3!=0)?" 2�� ���~!!!":" 3�� ���~!!!"));
		}
		else
		{
			System.out.println(">>"+num+" 2�� 3�� ����� �ƴմϴ�~!!!");
		}
	}
}
//������
/*

*/