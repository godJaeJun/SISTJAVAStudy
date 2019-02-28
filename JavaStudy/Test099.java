/*==========================================================
					���� �迭 ����
			    	  - �迭�� ����
==========================================================*/ 

// �� �ǽ� ����
// ������ �迭(a,b)�� ����ִ� ���ڵ��� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �ߺ��� ���ŵ� ������ �������� ����� �� �ֵ��� �Ѵ�.
// ����, �迭 ���� ������ ������� ó���� �� �ֵ��� �Ѵ�.

// ex) ������ �� �迭
// int[] a = {2,3,7,10,11}
// int[] b = {3,6,10,14}

// ���� ��)
// ù ��° �迭 ��Ҹ� �Է��ϼ���(���� ����) : 
// �� ��° �迭 ��Ҹ� �Է��ϼ���(���� ����) :
// 2 3 7 10 11 6 14
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
public class Test099
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		int[] temp;
		int i,j;

		System.out.print("ù ��° �迭 ��Ҹ� �Է��ϼ���(���� ����) : ");
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("�� ��° �迭 ��Ҹ� �Է��ϼ���(���� ����) : ");
		for(i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		
		temp = (int[])b.clone();

		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					temp[j] = temp[j]+1; 
				}
			}
		}
		
		
		// ���
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		for(i=0;i<b.length;i++)
		{
				if(temp[i]==b[i])
					System.out.print(b[i]+ " ");
		}
		System.out.println();
		*/
		// ������ �� �迭

		// ����� ���
		int[] a = {2,3,7,10,11};
		int[] b = {3,6,10,14};

		// ��� ��
		/*
		// - ���� a �� ��ü ��� ���
		for(int i=0; i<a.length;i++)
		{
			System.out.printf("%3d",a[i]);		
		}

		// - ���� b �� ��� ���
		//   ��, ���� b�� ���� a �� ��ҿ� �ߺ��Ǵ� �����͸� 
		//   �����ϸ鼭 ���
		
		for(int i=0; i<b.length;i++)		// 4ȸ�� -> 3, 6, 10, 14
		{
			boolean flag = false;

			for (int j=0; j<a.length; j++)	// 5ȸ��
			{
				if (b[i] == a[j])
				{
					flag = true;			//-- �ߺ� Ȯ��
					break;					//-- �����. �׸��� ����������. (j���� �ݺ��� Ż��)
				}
			}
			if(flag)						// flag �� true ���....
			{
				continue;					//-- �޺κ� �����ϰ�... ����ض�...
			}
			System.out.printf("%3d", b[i]); //-- �޺κ�~!!!
		}
		System.out.println();
		*/

		// ��� ��
		// - �ӽ� �迭�� �����
		int[] temp = new int[a.length+b.length];
		
		// - ������� �ӽù迭�� �ߺ����� ���� �迭 ��Ҹ� ä�� ����
		int n;	//-- ���� ���� ��ġ �߿�~!!! check~!!!
		for (n=0; n<a.length; n++)
		{
			temp[n] = a[n];
		}

		for (int k=0; k<b.length; k++)
		{
			boolean flag = false;

			for(int m=0; m<a.length;m++)
			{
				if(b[k] == a[m])
				{
					flag = true;
					break;
				}
			}
			if(flag)
				continue;

			temp[n] = b[k];
			n++;
		}

		// - �׷��� ������ �ӽ� �迭�� ��� 
	    for(int h=0;h<n;h++)
			System.out.printf("%3d",temp[h]);
		System.out.println();
	}// end main()
}
//���� ���
/*
  2  3  7 10 11  6 14
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/