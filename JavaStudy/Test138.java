/*==========================================================
			���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 
				    - Calendar Ŭ����
==========================================================*/

/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �� ������
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   ��GregorianCalendar�� Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� ���� �ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
   ���� ���� �ִ�.

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �ش� �� ���� �޷��� �׷��ִ� (����ϴ�) ���α׷��� �����Ѵ�.
//    ��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2019
// ��   �Է� : -2
// ��   �Է� : 16
// ��   �Է� : 7
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Test138
{
	public static void main(String[] args)
	{
			Calendar rightNow = new GregorianCalendar();
			Scanner sc = new Scanner(System.in);
			int m=0,y=0;
			int i;

			do{
			System.out.print("���� �Է� : ");
			y = sc.nextInt();
			}while(y<1);

			do{
			System.out.print("��   �Է� : ");
			m = sc.nextInt();
			}while(m<1||m>12);

			rightNow.set(Calendar.YEAR,y);
			rightNow.set(Calendar.MONTH,m-1);
			rightNow.set(Calendar.DATE,1);
		
			int start = rightNow.get(Calendar.DAY_OF_WEEK);
			int lastDay = rightNow.getActualMaximum(Calendar.DATE);
			
			System.out.println();
			System.out.println("\t [ "+ y+"�� "+m+"�� ]");
			System.out.println();
			System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");	//�� ĭ ����
			System.out.println("============================");

			for (i=1; i<start; i++)
			{
			System.out.print("    ");			// �� ĭ ����
			}
			
			
			for(int j=rightNow.get(Calendar.DATE);j<=lastDay;j++)
			{
				System.out.printf("%4d",j);
				if(i==7)
				{
					System.out.println();
					i=0;
				}
				i++;
			}
			if(i!=7)
			{
				System.out.println();
			}
			System.out.println("============================");
	}
}