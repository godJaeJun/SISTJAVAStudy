/*==========================================================
					���� �迭 ����
				 - �迭�� ����� �ʱ�ȭ
				 - �迭�� �⺻���� Ȱ��
==========================================================*/

// �� �ǽ� ����
// ��char�� �ڷ����� �迭�� ����� ���ĺ� �빮�ڸ� ä���
// ä���� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// A B C D ... W X Y Z
// ����Ϸ��� �ƹ� Ű��...
public class Test081
{
	public static void main(String[] args)
	{
		/* 
		char[] arr = new char[26];

		for(int i=0;i<arr.length;i++){
			arr[i] = (char)(i+65);
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/
		char[] arr = new char[26];

		for (int i=0,ch=65;i<arr.length;i++,ch++)
		{
			arr[i] = (char)ch;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
//������
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/