// 2. Sungjuck Ŭ����
//    - �ο����� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//      �̸�, ��������, ��������, ���������� �Է¹ް�
//      ������ ����� �����ϴ� Ŭ������ ������ ��~!!!
//    - �Ӽ� : �ο���, Record ������ �迭
//    - ��� : �ο��� �Է�, �� ������ �Է�, ����/��� ����, ��� ���
// ���� ��)
// �ο��� �Է�(1~100) : 102
// �ο��� �Է�(1~100) : -10
// �ο��� �Է�(1~100) : 3
// 1��° �л��� �̸� �Է� : ������
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70
// 2��° �л��� �̸� �Է� : �輺��
// ���� ���� : 82
// ���� ���� : 72
// ���� ���� : 62
// 3��° �л��� �̸� �Է� : �輱��
// ���� ���� : 98
// ���� ���� : 88
// ���� ���� : 78
import java.util.Scanner;
class Sungjuck
{
	int num;
	Record[] st;
	Scanner sc = new Scanner(System.in);

	void pInput(){
		do{
		System.out.print("�ο��� �Է�(1~100) : ");
		num = sc.nextInt();
		}while(num<1||num>100);

		st = new Record[num];
	}

	void sInput(){
		for(int i=0;i<num;i++)
		{	
			int[] score = new int[3];
			st[i] = new Record();
			/*
			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			st[i].name = sc.next();
			System.out.print("���� ���� : ");
			st[i].sub1 = sc.nextInt();
			System.out.print("���� ���� : ");
			st[i].sub2 = sc.nextInt();
			System.out.print("���� ���� : ");
			st[i].sub3 = sc.nextInt();
			*/

			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			st[i].setName(sc.next());
			System.out.print("���� ���� : ");
			score[0] = sc.nextInt();
			System.out.print("���� ���� : ");
			score[1] = sc.nextInt();
			System.out.print("���� ���� : ");
			score[2] = sc.nextInt();
			st[i].setScore(score);
		}
	}
	void sa()
	{
		/*
		for(int i=0;i<num;i++)
		{
			st[i].sum = st[i].sub1+st[i].sub2+st[i].sub3;
			
			st[i].avg = st[i].sum/3.0;
		}
		for (int i = 0; i < num; i++) {
			st[i].rank = 1;
			for(int j=0;j<num;j++)
			{
				if(st[i].avg<st[j].avg)
				{
					st[i].rank+=1;
				}
			}
        }
		*/
		for(int i=0;i<num;i++)
		{
			int[] score = new int[3];
			score = st[i].getScore();
			st[i].setSum(score[0]+score[1]+score[2]);
			st[i].setAvg(st[i].getSum()/3.0);
		}
		for(int i=0; i<num;i++)
		{
			int rank = 1;
			for(int j=0;j<num;j++)
			{
				if(st[i].getAvg()<st[j].getAvg())
				{
					rank++;
				}
			}
			st[i].setRank(rank);
		}
	}

	//��� ���
	void print()
	{
		/*
		System.out.println();
		for(int i=0;i<num;i++)
		{
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",st[i].name,st[i].sub1,st[i].sub2,st[i].sub3,st[i].sum,st[i].avg,st[i].rank);
		}
		*/
		System.out.println();
		for(int i=0;i<num;i++)
		{
			int[] score = new int[3];
			score = st[i].getScore();
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",st[i].getName(),score[0],score[1],score[2],st[i].getSum()
				,st[i].getAvg(),st[i].getRank());
		}
	}
	
}