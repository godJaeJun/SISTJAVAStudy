/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
						- if ~ else�� �ǽ�
==========================================================*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int n;
		/*
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		*/
		// X
		/*	
		if(n%2==0)
		{
			System.out.println(n + "-> ¦��");
		}
		else if(n==0)
		{
			System.out.println(n + "-> ��");
		}
		else
		{
			System.out.println(n + "-> Ȧ��");
		}
		*/
		// X
		/*
		if(n%2!=0)
		{
			System.out.println(n + "-> Ȧ��");
		}
		else if(n%2==0)
		{
			System.out.println(n + "-> ¦��");
		}
		else if(n==0)
		{
			System.out.println(n + "-> ��");
		}
		*/
		// O
		/*
		if(n==0)
		{
			System.out.println(n + "-> ��");
		}
		else if(n%2==0)
		{
			System.out.println(n + "-> ¦��");
		}
		else if(n%2!=0)
		{
			System.out.println(n + "-> Ȧ��");
		}
		else
		{
			System.out.println("������ �Ұ����� ��Ȳ");
		}
		*/
		System.out.print("���̽�ũ�� ���� ����(1.����, 2.����) : ");
		n = Integer.parseInt(br.readLine());

		/*
		if(n==1)
		{
			System.out.println("���� ���̽�ũ�� ����~!!!");
		}
		else
		{
			System.out.println("���� ���̽�ũ�� ����~!!!");
		}
		*/
		if(n==1)
		{
			System.out.println("���� ���̽�ũ�� ����~!!!");
		}
		else if(n==2)
		{
			System.out.println("���� ���̽�ũ�� ����~!!!");
		}
		else
		{
			System.out.println("���� �Ұ�~!!!");
		}
	}
}
// * else�� �������� ���༭ ���ܸ� ó���ϴ� ���� �ٶ���
//������
/*
���̽�ũ�� ���� ����(1.����, 2.����) : 1
���� ���̽�ũ�� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/