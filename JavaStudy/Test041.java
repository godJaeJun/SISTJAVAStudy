/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
					   - switch�� �ǽ�
==========================================================*/


// �� �ǽ� ����
// 1 ���� 3 ������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
// �Է¹��� ������ŭ ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �ΰ��� ������� ������ �� �ֵ��� �Ѵ�.

// 1.switch���� �Ϲ� ���� Ȱ���Ѵ�.
// 2.switch���� �⺻ ���� Ȱ���ϵ�,
//  ��break���� �� �ѹ��� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� ��)
// ������ ���� �Է�(1~3) : 1
// ��
// ����Ϸ��� �ƹ� Ű�� ��������...


// ���� ��)
// ������ ���� �Է�(1~3) : 7
// �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("������ ���� �Է�(1~3) : ");
		num = Integer.parseInt(br.readLine());
		/*
		switch(num)
		{
			case 3:
				System.out.print("�ڡڡ�\n");
				break;
			case 2:
				System.out.print("�ڡ�\n");
				break;
			case 1:
				System.out.print("��\n");
				break;
			default:
				System.out.print("�Է� ����~!!!\n");
				break;
		}
		*/
		switch(num)
		{
			case 3:
				System.out.print("��");
			case 2:
				System.out.print("��");
			case 1:
				System.out.print("��\n");
				break;		
			default:
				System.out.print("�Է� ����~!!!\n");
		}
	}
}
//������
/*
������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/