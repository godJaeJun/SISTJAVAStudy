/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
				         - break 
==========================================================*/

// �� �ǽ� ����
// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1 ~ 1000 ���� �ȿ�����
// �����ϵ��� �ۼ��Ѵ�.

// ���� ��)
// ������ ���� �Է� : -10
// ������ ���� �Է� : 0
// ������ ���� �Է� : 2019
// ������ ���� �Է� : 10
// >> 1~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�?(Y/N) : y

// ������ ���� �Է� : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ͻðڽ��ϱ�?(Y/N) : N
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		// �� Version
		/*
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num=0,sum=0;
			int c;

			while(true){
				do{
				System.out.print("������ ���� �Է� : ");
				num=Integer.parseInt(br.readLine());
				}while((num<1||num>1000));
				for(int i=1;i<=num;i++)
				{
						sum+=i;
				}
				System.out.printf(">> 1 ~ %d ������ �� : %d\n",num,sum);
				System.out.print("����Ͻðڽ��ϱ�?(Y/N) : ");
				c = (char)System.in.read();
				System.in.skip(2);
				if(c=='y'|| c=='Y'){
					sum=0;
				}
				else{
					break;
				}
			}
		*/
		// ����� Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s, i;		//-- ����� �Է°�, ������, ���� ����
		char ch;			//-- ��� ���� �Է°�
		while(true){		//-- ���� ����(���� �ݺ�)
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1||n>1000);

			s = 0;
			for (i=1; i<=n; i++)
			{
				s += i;
			}
			System.out.printf("\n>> 1 ~ %d ������ �� : %d\n",n,s);
			
			System.out.print("����Ͻðڽ��ϱ�?(Y/N) : ");
			ch = (char)System.in.read();
			// �Է°��� �ҹ��� y�� �ƴϴ�. �Է°��� �빮�� Y�� �ƴϴ�.
			// ch!='y'						ch!='Y'
			if(ch!='y'&&ch!='Y')
			{
				//�ݺ����� ���߰� ����������. �ݺ��� while(true)�� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				// ���� ���� �ǻ�ǥ���� �ߴٸ� �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break;
				// ����� �׸��� ����������~!!! check~!!!
			}
			System.in.skip(2);
		}
	}
}
// ���� ���
/*
������ ���� �Է� : 10
>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�?(Y/N) : y
������ ���� �Է� : 20
>> 1 ~ 20 ������ �� : 210
����Ͻðڽ��ϱ�?(Y/N) : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/