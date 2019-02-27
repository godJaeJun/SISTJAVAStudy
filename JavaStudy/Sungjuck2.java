import java.util.Scanner;

class Sungjuck2
{
	// �ֿ� �Ӽ� ����
	int inwon;			//-- �ο���
	Record[] recArr;	//-- Record �迭
						//   (�л� 1�� �� Record�迭�� �� 1�� Ȱ��)
	
	// ���(�޼ҵ� ����)
	// �� �ο��� �Է�
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);
		
		// check~!!!
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon ��ŭ ������ ������,
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		recArr = new Record[inwon];
	}

	// ���(�޼ҵ� ����)
	// �� �� ������ �Է� + �� ����/��� ����
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] subTitle = {"���� ���� : ", "���� ���� : ","���� ���� : "};
		
		for (int i=0; i<inwon; i++)	//�ο��� ��ŭ �ݺ�~!!! (==recArr.length)
		{
			// check~!!!
			// Record Ŭ���� ����� �ν��Ͻ� ����
			recArr[i] = new Record();

			System.out.printf("%d��° �л��� �̸� �Է� : ",i+1);
			recArr[i].name = sc.next();
			
			for (int j=0;j<subTitle.length;j++)
			{
				// �ȳ� �޼��� ���
				System.out.print(subTitle[j]);

				// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				recArr[i].score[j] = sc.nextInt();

				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// �� �������� ���� �����ϱ�
				recArr[i].tot += recArr[i].score[j];
			}

			// ��� �����ϱ�
			recArr[i].avg = recArr[i].tot / 3.0;
		}
	}//end input()

	// ���(�޼ҵ� ����)
	// �� ��� ���
	public void print()
	{
		 // ���� ���� �޼ҵ� ȣ�ⱸ�� �߰�~!!!
		 ranking();

		 // ����

		 System.out.println();
		 
		 // �л� 1�� �� �ݺ� ��� ����
		 for(int i=0;i<inwon;i++)	//-- �л� �ο� �� ��ŭ �ݺ�~!!!
		 {
			// �̸� ���
			System.out.printf("%5s", recArr[i].name);

			// ����(����, ����, ����) �ݺ� ���
			for(int j=0;j<3;j++)
				System.out.printf("%4d", recArr[i].score[j]);
			
			// ����, ��� ���
			System.out.printf("%5d",recArr[i].tot);
			System.out.printf("%6.2f",recArr[i].avg);

			// ���� ���
			System.out.printf("%5d",recArr[i].rank);
			
			//����
			System.out.println();
		 }
	}//end print()

	// ���(�޼ҵ� ����)
	// �� ���� ���� �޼ҵ� �߰�~!!!
	private void ranking()
	{
		int i, j;

		// ��� �л����� ���(����)�� 1�� �ʱ�ȭ
		for(i=0;i<inwon;i++)
			recArr[i].rank = 1;

		// ���(����) ����
		for(i=0; i<inwon-1;i++)		//i -> �� ������ �����ϴ� �ε���
		{
			for(j=i+1; j<inwon;j++) //j -> �� ����� �����ϴ� �ε���
			{
				if(recArr[i].avg > recArr[j].avg)	//���� �����Ͱ� �� ������ ���� ũ�ٸ�...
				{
					// �� �������� rank�� 1��ŭ ����
					recArr[j].rank++;
				}
				else if(recArr[j].avg>recArr[i].avg)
				{
					// �� ���� �������� rank�� 1��ŭ ����
					recArr[i].rank++;
				}
			}
		}
	}
}
//���� ���
/*

*/