/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
					   - switch�� �ǽ�
==========================================================*/

/*
�� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
   switch(����)
   {
		case ���1 : ����1; [break;]
		case ���2 : ����2; [break;]
				   .
				   .
		[default : ����n+1;][break;]
   }
   switch ���� �����ġ��� case�� ���������
   byte, short, int, long ���̾�� �Ѵ�.

   case �� �ڿ� ��break;���� ���� ������ ���
   ���� case ���� ������ ����ؼ� �����ϰ� �ȴ�.(�⺻��)
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor,eng,mat;
		int sum;
		double avg;
		char grade= 'F';
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();
		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor+eng+mat;
		avg = sum/3.0;
		
		switch((int)avg/10)
		{
			case 10: case 9:
				grade = 'A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';
				break;
		}
		System.out.printf("\n����� �̸��� %s�Դϴ�.\n",name);
		System.out.printf("���� ������ %d,\n���� ������ %d,\n���� ������ %d,\n",kor,eng,mat);
		System.out.printf("������ %d�̰�, ����� %.2f�Դϴ�.\n",sum,avg);
		System.out.printf("����� %c �Դϴ�.\n",grade);	
		
	}
}
//������
/*
// >> ����� �̸��� �������Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� �������� ...
*/