/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
				   - �ݺ��� (while�� ) �ǽ�
==========================================================*/ 
// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �Է¹޾�
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 20
// >> 10 ~ 20 ������ �� :xxxx
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		int sum=0;
		int n=0,m=0;
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		
		if(num1>=num2){
			n=num2;
			m=num1;
		}
		else{
			n=num1;
			m=num2;
		}
		while(n<=m){
			sum+=n;
			n++;
		}
		System.out.printf(">>%d ~ %d ������ �� : %d\n",(num1>num2?num2:num1),m,sum);
		*/

		// ����� Version
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� �ֿ� ���� ����
		int n, su1, su2, result=0;
		// -- ��������, ù ��° �Է°�, �� ��° �Է°�, �����(������ ������)

		// �� ���� �� ó��
		// �� ����ڿ��� �ȳ��޼��� ��� �� �Է°� ��Ƴ���
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());
		
		// �� ������ ���꿡 ���� �ռ�
		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1�� su2���� Ŭ ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if(su1>su2)
		{
			//�� ���� �ڸ� �ٲ�
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;
		}
		// �ݺ����� �����ϱ� ��
		// ���� ���� ���� �����صд�.
		// (�� ���� ���� ��� �������� �ʿ��� ���̸�...
		//  ������ ������ ���� ���� ��� �ݺ����� �����ϴ� ����
		//  �� ���� ��� ���� ���̱� ����...)
		n = su1;

		while(n<=su2){
			result+=n;
			n++;
		}


		// �� ��� ���
		System.out.printf(">>%d ~ %d ������ �� : %d\n",su1,su2,result);
	}
}
//���� ���
/*
ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 100
>>1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 10
>>1 ~ 10 ������ �� : 55
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/