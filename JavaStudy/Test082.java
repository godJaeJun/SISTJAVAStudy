/*==========================================================
					���� �迭 ����
				 - �迭�� �⺻���� Ȱ��
==========================================================*/

// �� �ǽ� ����
// ����ڷκ��� �ο� ���� �Է¹ް�
// �̷��� �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹޾�
// �Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ���Ѿ� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ��ȫ�� 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ���ȯ 010-3333-3333

//------------------
//��ü �л� �� : 3��
//------------------
//�̸�		   ��ȭ��ȣ
//���Ѿ�	   010-1111-1111
//��ȫ��	   010-2222-2222
//���ȯ	   010-3333-3333
//����Ϸ��� �ƹ� Ű�� ��������...
import java.util.Scanner;
public class Test082
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int num;
		do{
		System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
		num = sc.nextInt();
		}while(num<1||num>10);
	
		String[] name = new String[num];
		String[] number = new String[num];

		for(int i=0;i<name.length;i++){
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ",(i+1));
			name[i] = sc.next();
			number[i] = sc.next();
		}

		System.out.println("\n--------------------");
		System.out.println("��ü �л� �� : "+num+"��");
		System.out.println("--------------------");
		System.out.println("�̸�\t\t��ȭ��ȣ");
		for(int i=0;i<name.length;i++){
			System.out.println(name[i] + "\t\t" + number[i]);
		}
		System.out.println("--------------------");
		*/
		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// ����ڰ� �Է��ϴ� �л����� ��Ƶ� ���� 
		int memCount = 0;

		do{
		System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
		memCount = sc.nextInt();
		}while(memCount<1||memCount>10);

		// �׽�Ʈ
		//System.out.println("����ڰ� �Է��� �ο� �� : " + memCount);
		
		// �̸� ���� �迭 ���� -> �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] names = new String[memCount];

		// ��ȭ��ȣ ���� �迭 ���� -> �Է¹��� �ο� �� ��ŭ�� �迭�� ����
		String[] tels = new String[memCount];

		// �ݺ����� Ȱ���Ͽ� ������� �Է� �����͸� �迭�� ��Ƴ���
		for(int n=0;n<memCount;n++)	//memCount == names.length == tels.length
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ",(n+1));
			names[n] = sc.next();
			tels[n] = sc.next();
		}
		
		System.out.println("\n--------------------");
		System.out.println("��ü �л� �� : "+memCount+"��");
		System.out.println("--------------------");
		System.out.println("�̸�\t\t��ȭ��ȣ");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i] + "\t\t" + tels[i]);
		}
		System.out.println("--------------------");
	}
}
//������
/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : �Ͽ��� 111-222-333
�̸� ��ȭ��ȣ �Է�[2](���� ����) : �̿��� 222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : ����� 333

--------------------
��ü �л� �� : 3��
--------------------
�̸�            ��ȭ��ȣ
�Ͽ���          111-222-333
�̿���          222
�����          333
--------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/