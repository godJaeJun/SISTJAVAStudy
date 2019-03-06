import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Daliy
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int nalsu, y, m, w;

		do
		{
			System.out.print("���������� �Է��ϼ��� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�������� �Է��ϼ��� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		if((y%4==0 && y%100!=0) || y%400==0)
		{
			days[1] = 29;
		}
		
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		for(int i=0;i<(m-1);i++)
		{
			nalsu+=days[i];
		}

		nalsu +=1;

		w = nalsu%7;
		System.out.println();
		System.out.println("\t [ "+ y+"�� "+m+"�� ]");
		System.out.println();
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");	//�� ĭ ����
		System.out.println("============================");

		for (int i=0; i<w; i++)
		{
			System.out.print("    ");	// �� ĭ ����
		}

		for (int i=1; i<=days[m-1];i++)
		{
			System.out.printf("%4d",i);
			w++;						//-- ��¥�� �����ϴ� ��ŭ ���ϵ� �Բ� ������ �� �ֵ��� ó��
			if(w%7==0)//�Ͽ���
			{
				System.out.println();	// ����
			}
		}

		if(w%7!=0)
			System.out.println();		

		System.out.println("============================");
	}
}