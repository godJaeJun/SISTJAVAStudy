/*==========================================================
				���� ����(Sort) �˰��� ����
				  -- ���� ����(Selection Sort)
==========================================================*/

/*
�� ����
   : �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
   : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
     -> ��������... �˻��ϱ� ����

�� ������ ����
   : ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����, ...
*/
public class Test102
{
	public static void main(String[] args)
	{
		int[] a = {52,42,12,62,60,70,3,9,100,2,1,77};
		/*
		42 52 12 62 60 0 1
		=====
		12 52 42 62 60 0 2
		==    ==     
		12 52 42 62 60 0 3
		==       ==  
		12 52 42 62 60 0 4
		==          == 
		
		1ȸ��------------------------
		
		*/
		/*
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}
		
		System.out.println("***���İ��***");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/

		int i,j;

		System.out.print("Source Data : ");
		
		/*
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/

		// ���� for�� -> forEach ����
		for (int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		
	}
}
//������
/*

*/