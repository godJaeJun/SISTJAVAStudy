/*==========================================================
				���� Ŭ���� ��� ����
				 - �������̽�(Interface) 
==========================================================*/

// �� �ǽ� ����
//    ���� ó�� ���α׷��� �����Ѵ�.
//    ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���鱸��) : 1921004 �̿���
// ���� ���� ���� ���� �Է�   (���鱸��) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���鱸��) : 1921005 ������
// ���� ���� ���� ���� �Է�   (���鱸��) : 85 70 65

// 1921004 �̿���  90 100 85     275   91
//				   ��  �� ��   
// 1921005 ������  85  70 65     220   73
//				   ��  �� ��

// ����Ϸ��� �ƹ� Ű�� ��������...

// �Ӽ��� �����ϴ� Ŭ���� -> �ڷ��� Ȱ��

// 90 ~ 100 : ��
// 80 ~ 89  : ��
// 70 ~ 79  : ��
// 60 ~ 69  : ��
// ������   : ��

import java.util.Scanner;

class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor,eng,mat;		//-- ����, ����, ���� ����
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjuckImpl implements Sungjuk
{
	Record[] r;
	
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		int num=0;
		do{
		System.out.print("�ο� �� �Է�(1~10) : ");
		num = sc.nextInt();
		}while(num<1||num>10);

		r = new Record[num];
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<r.length;i++)
		{
			r[i] = new Record();
			System.out.print((i+1)+"��° �л��� �й� �̸� �Է�(���鱸��) : ");
			r[i].hak = sc.next();
			r[i].name = sc.next();
			System.out.print("���� ���� ���� ���� �Է�   (���鱸��) : ");
			r[i].kor = sc.nextInt();
			r[i].eng = sc.nextInt();
			r[i].mat = sc.nextInt();

			r[i].tot = r[i].kor+r[i].eng+r[i].mat;
			r[i].avg = r[i].tot/3;
		}
	}

	@Override
	public void print()
	{
		int a[] = new int[3];
		
		for(int i=0;i<r.length;i++)
		{
			a[0] = r[i].kor;
			a[1] = r[i].eng;
			a[2] = r[i].mat;
			System.out.printf("%s  %s\t%3d %3d %3d\t%d\t%d\n",r[i].hak,r[i].name,r[i].kor,r[i].eng,r[i].mat,r[i].tot,r[i].avg);
			System.out.printf("\t\t ");
			for(int j=0;j<3;j++)
			{
				if(a[j]>=90&&a[j]<=100)
				{
					System.out.printf("��  ");
				}
				else if(a[j]>=80)
				{
					System.out.printf("��  ");
				}
				else if(a[j]>=70)
				{
					System.out.printf("��  ");
				}
				else if(a[j]>=60)
				{
					System.out.printf("��  ");
				}
				else{
					System.out.printf("��  ");
				}
			}
			System.out.println();
		}
	}
}

public class Test116
{
	public static void main(String[] args)
	{
		
		Sungjuk ob;

		ob = new SungjuckImpl();
	
		ob.set();
		ob.input();
		ob.print();
	}
}
//������
/*

*/