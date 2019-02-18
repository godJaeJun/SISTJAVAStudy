/*==========================================================
			���� ���� �帧�� ��Ʈ�� (���) ����
						- if�� �ǽ�
==========================================================*/

// �� �ǽ� ����
// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : ���ȯ
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ���ȯ�Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� �������� ...

// �� ����� ��� ������ �������� ó���Ѵ�.
// 90�� ~ 100�� : A		80�� ~ 89�� : B
// 70�� ~ 79��  : C     60�� ~ 69�� : D
// 60�� �̸�    : F

// ��, BufferedReader �� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test031
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int s1,s2,s3, sum, avg;
		char d;					//���
		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� ���� : ");
		s1 = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		s2 = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		s3 = Integer.parseInt(br.readLine());
		sum = s1+s2+s3;
		avg = sum/3;
		
		if(avg>=90){
			d = 'A';
		}
		else if(avg>=80){
			d= 'B';
		}
		else if(avg>=70){
			d= 'C';
		}
		else if(avg>=60){
			d= 'D'; 
		}
		else{
			d= 'F';
		}

		System.out.printf("\n����� �̸��� %s�Դϴ�.\n",name);
		System.out.printf("���� ������ %d,\n���� ������ %d,\n���� ������ %d,\n",s1,s2,s3);
		System.out.printf("������ %d�̰�, ����� %d�Դϴ�.\n",sum,avg);
		System.out.printf("����� %c �Դϴ�.\n",d);
		*/
		
		// ����� Version (*������ �ʱ�ȭ �ʼ�) char a = 'A'���� ������ �ʱ�ȭ�� ���� ������ else if()������ ������� Error�� �߻�!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat;
		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());
		
		// ���� ����
		int tot = kor + eng + mat;
		
		// ��� ����
		double avg = tot / 3.0;
		
		// ��� ����
		char grade;
		if(avg >= 90)
			grade = 'A';
		else if(avg >=80)
			grade = 'B';
		else if(avg >=70)
			grade = 'C';
		else if(avg >=60)
			grade = 'D';
		else
			grade = 'F';


		System.out.printf("\n����� �̸��� %s�Դϴ�.\n",name);
		System.out.printf("���� ������ %d,\n���� ������ %d,\n���� ������ %d,\n",kor,eng,mat);
		System.out.printf("������ %d�̰�, ����� %.2f�Դϴ�.\n",tot,avg);
		System.out.printf("����� %c �Դϴ�.\n",grade);	
	}
}

//������
/*
�̸� �Է� : ������
���� ���� : 90
���� ���� : 80
���� ���� : 70

����� �̸��� �������Դϴ�.
���� ������ 90,
���� ������ 80,
���� ������ 70,
������ 240�̰�, ����� 80�Դϴ�.
����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . . 
*/