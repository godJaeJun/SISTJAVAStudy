/*==========================================================
			���� ������(Operator) ����
			- ���� ������ == ���� ������
==========================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �������� ������� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader �� readLine() �� Ȱ���ϰ�
// ������ ���� �����ڸ� Ȱ���� �� �ֵ��� �Ѵ�.

// 4�� 100 400���� ������ �� ��������.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� -> ����
// ����Ϸ��� �ƹ� Ű��

// ������ ���� �Է� : 2011
// 2011�� -> ���
// ����Ϸ��� �ƹ� Ű��

// �� ������ �Ǻ� ����
//    ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//    400�� ����̸� ����~!!!
//    �׷��� ������ ���
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		String n;

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());
		// (year %4==0 && year%100!=0 || year%400==0)? "����":"���";
		n = year % 400 == 0 ? "����" : year % 4 ==0 ? (year %100==0? "���" : "����"): "���" ;
		System.out.printf("%d�� -> %s\n",year,n);
		
	}
}
//������
/*
������ ���� �Է� : 2011
2011�� -> ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/