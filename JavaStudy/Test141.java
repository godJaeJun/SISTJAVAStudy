/*==========================================================
			���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 
				     - Random Ŭ����
==========================================================*/
/*
�� java.util.Random Ŭ������
   
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.

*/

// �ζ� ��ȣ ������ (���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 2 39 40 41 42 45 
// 1 2 8 16 28 42
//.. 5�� �ݺ�
//	1
//  1 2
//  1 2 
import java.util.Random;
import java.util.Arrays;
class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� -> �ζ� ��ȣ�� ��Ƶ� �迭�� 6��
	private int[] num = new int[6];

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;
		jump:
		while (cnt<6)	// cnt -> 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;	// 1 ~ 45
			
			for (int i=0; i<cnt; i++)
			{
				if(num[i] == n)
				{
					continue jump;		
				}
			}

			num[cnt++] = n;
		}
		sorting();
	}

	// ���� �޼ҵ�
	private void sorting()
	{
		Arrays.sort(num);
	}
}
public class Test141
{
	public static void main(String[] args)
	{
		/*
		Random r = new Random();
		int[][] lotto = new int[5][6];
		int temp = 0;
		
		for(int k=0;k<lotto.length;k++)
		{
			for (int i=0;i<lotto[k].length;i++)
			{
				lotto[k][i] = r.nextInt(45)+1;
				for (int j=0;j<i;j++)
				{
					if(lotto[k][i]==lotto[k][j])
					{
						i--;
						break;
					}
				}
			}
		}

		for(int k=0;k<lotto.length;k++)
		{
			for(int i=0;i<lotto[k].length-1;i++)	
			{
				for (int j=i+1; j<lotto[k].length; j++) 
				{
					if(lotto[k][i]>lotto[k][j])		
					{
						// �ڸ� �ٲٱ�
						lotto[k][i] = lotto[k][i] ^ lotto[k][j];
						lotto[k][j] = lotto[k][j] ^ lotto[k][i];
						lotto[k][i] = lotto[k][i] ^ lotto[k][j];
					}
				}
			}
		}

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.printf("%3d",lotto[i][j]);
			}
			System.out.println();
		}
		*/
		
		// Lotto Ŭ���� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5����
		for (int i=1; i<=5;i++)
		{
			lotto.start();
			
			// ��� ���
			for (int n :lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}
}
// ������
/*
   6   8  25  30  33  39
  10  15  16  18  24  41
  13  18  26  28  31  41
   9  15  29  40  41  42
   1   6  17  22  28  41
*/