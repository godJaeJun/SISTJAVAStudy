import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test138_1
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Calendar �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();
		
		// �ֿ� ���� ����
		int y,m;				//-- ��, ��
		int w;					//-- ����
		int i;					//-- ��������

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է�   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		
		// ����ڷκ��� �Է¹��� ������ ��(y), ��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����
		cal.set(y,m-1,1);
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//   �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.

		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// Ȯ��
		//System.out.println(w);
		//--==>> 6 -> 2019�� 3�� ���� -> �ݿ��� -> 2019�� 3�� 1�� : �ݿ���
		
		// ��� ���  -> �޷� �׸���
		System.out.println();
		System.out.println("\t [ "+y+"�� "+m+"�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=====================================");
		for(i=1;i<w;i++)
			System.out.print("    ");	//���� 4ĭ
		
		// Calendar Ŭ������ ��getActualMaximum()�� �޼ҵ� check~!!!
		for(i=1;i<=cal.getActualMaximum(Calendar.DATE);i++)
		{
			System.out.printf("%4d",i);
			w++;		//-- �ݺ����� �����ϸ� ��¥�� ������ �� ����
						//   ���ϵ� �Բ� ������ �� �ֵ��� ó��.

			if(w%7==1)	//-- ������ ������ �Ͽ����� �� �� ���� ���� �� ���
				System.out.println();	// ����
		}
		if(w%7!=1)
			System.out.println();		// ����

		System.out.println("=====================================");
	}
}
/*
���� �Է� : 2019
�� �Է�   : 3

         [ 2019�� 3�� ]

  ��  ��  ȭ  ��  ��  ��  ��
=====================================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
=====================================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/