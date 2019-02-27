/*==========================================================
			 ���� Ŭ������ �ν��Ͻ� ����
				- Ŭ������ �ν��Ͻ� Ȱ��
==========================================================*/ 

// �� �ǽ� ����
// 1 ~ 3 ������ ���� ������ ������ �߻�����
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �յ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ������ -> 1:���� 2:���� 3:��

// ���� ��)
// 1:���� 2:���� 3:�� �� �Է�(1~3) : 4
// 1:���� 2:���� 3:�� �� �Է�(1~3) : -12
// 1:���� 2:���� 3:�� �� �Է�(1~3) : 2
// - ����   : ����
// - ��ǻ�� : ��
// >> �º� ������� : ��ǻ�Ͱ� �̰���ϴ�~!!!

import java.util.Scanner;
import java.util.Random;

class Game
{
	String[] mod = {"����","����","��"};
	int userMod,comMod;
	boolean w;
	String winner;

	void start()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		do{
		System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
		userMod = sc.nextInt();
		}while(userMod<1||userMod>3);
		
		comMod = r.nextInt(3)+1;
		whatWin();
	}
	
	private void whatWin()
	{
		if((userMod==1&&comMod==3) || (userMod==2&&comMod==1) || (userMod==3&&comMod==2))
		{
			w = true;
			winner = "����";
		}
		else if((userMod==3&&comMod==1) || (userMod==1&&comMod==2) || (userMod==2&&comMod==3))
		{
			w = true;
			winner = "��ǻ��";
		}
	}

	void print()
	{
		System.out.println("- ����    : "+mod[userMod-1]);
		System.out.println("- ��ǻ��  : "+mod[comMod-1]);
		
		if(w)
		{
			System.out.println(">> �º� ������� : " + winner + "�� �̰���ϴ�~!!!");
		}
		else 
		{
			System.out.println(">> �º� ������� : �����ϴ�~!!!");
		}
	}
}
/*
class RpsGame
{
	int user;
	int com;

	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3) + 1;
	}

	public void input()
	{
		runCom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void middleCalc()
	{
		String[] str = {"����", "����", "��"};

		System.out.println("- ����   : " + str[user-1]);
		System.out.println("- ��ǻ�� : " + str[com-1]);
	}

	public String resultCals()
	{
		String result = "���º�";
		if((user==1&&com==3)||(user==2&&com==1)||(user==3&&com==2))
		{
			result = "����� �¸��߽��ϴ�~!!!";
		}
		if((com==1&&user==3)||(com==2&&user==1)||(com==3&&user==2))
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�~!!!";
		}
		
		return result;
	}

	public void print(String result)
	{
		System.out.println(">> �º�������� : " +result);
	}
}
*/
public class Test094
{
	public static void main(String[] args)
	{
		Game g = new Game();
		g.start();
		g.print();
	}
}
// ���� ���
/*
1:���� 2:���� 3:�� �� �Է�(1~3) : 1
- ����    : ����
- ��ǻ��  : ����
>> �º� ������� : �����ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:���� 2:���� 3:�� �� �Է�(1~3) : 2
- ����    : ����
- ��ǻ��  : ��
>> �º� ������� : ��ǻ�Ͱ� �̰���ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:���� 2:���� 3:�� �� �Է�(1~3) : 3
- ����    : ��
- ��ǻ��  : ����
>> �º� ������� : ������ �̰���ϴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/