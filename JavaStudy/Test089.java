   

// ����ڷκ��� ������ ������ �Է¹޾�
// �� ������ ������ŭ ����(1~100)�� �߻����� �迭�� ���
// �迭�� ����ִ� �����͵� ��
// ���� ū ���� ���� ���� ���� �����Ͽ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �߻���ų ������ ���� �Է� : 3
// 52 13 67 -> �������� �߻��� ������... -> �迭�� ��Ƴ���(�迭 ����)
// ���� ū �� : 67, ���� ���� �� : 13
import java.util.Random;
import java.util.Scanner;
public class Test089
{
	public static void main(String[] args)
	{
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		//�ȳ� �޼��� ���
		System.out.print("�߻���ų ������ ���� �Է� : ");
		int size = sc.nextInt();
		
		// size ������ ��Ƴ� �� ��ŭ�� �迭�� �����
		// (�迭 ���� �� �޸� �Ҵ�)
		int[] arr = new int[size];

		// ������ ����(����)�� �߻���Ű�� ���ؼ���
		// ���� �߻� ���� ��ü�� �ʿ��ϴ�.
		// -> ��java.util.Random��
		Random rd= new Random();

		//�׽�Ʈ
		//System.out.println("�߻��� ���� : " + rd.nextInt(100));	//0~99
		//��Random�� Ŭ������ ��nextInt()�� �޼ҵ�
		// 0 ~ �Ű������� �Ѱܹ��� ����-1 ������ �� ��
		// ������ ����(����) 1���� �߻���Ų��.
		
		for(int i=0;i<size;i++)
		{
			arr[i] = rd.nextInt(100)+1; //1~100 ������ ���� �� 1�� �߻�~!!!
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		int max=arr[0];		//�ִ�
		int min=arr[0];		//�ּڰ�

		for(int i=1;i<size;i++)
		{
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.printf("���� ū �� : %d, ���� ���� �� : %d\n",max,min);

	}
}
//������
/*
�߻���ų ������ ���� �Է� : 10
  41   2  45  83  32  62  46  80  93  27
���� ū �� : 93, ���� ���� �� : 2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/