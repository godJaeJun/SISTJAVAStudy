/*==========================================================
					���� �迭 ����
			     - �迭�� �迭(2���� �迭)
==========================================================*/
// �� �ǽ� ����
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5X5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
1   2  3  4  5			
5   1  2  3  4			
4   5  1  2  3			
3   4  5  1  2			
2   3  4  5  1		
����Ϸ��� �ƹ� Ű�� ��������...
*/
public class Test088
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[5][5];
		int n=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{	
				n = n==6?1:n;
				arr[i][j]=n;
				n = j!=4 ? ++n:n;
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("%3d",arr[i][j]);	
			}
			System.out.println();
		}
		*/
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];
		
		// �ʱ�ȭ
		//n->12345/51234/45123/34512/23451 00 11 22 33 44 
		for(int i=0;i<arr.length;i++)		//0 1 2 3 4
		{
			for(int j=i,n=1;n<=5;n++)//0 1 2 3 4
			{
				arr[i][j]=n;
				j++;
				if(j==5) j=0;
			}
		}

		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
//������
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/