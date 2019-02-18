/*==========================================================
			���� �ڹ��� �⺻ ���α׷��� ����
		      - �ڹ��� �⺻ ����� : printf()
==========================================================*/


public class Test016{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");	//--��\n������

		// ���� ��� �޼ҵ�
		System.out.printf("121231231312312");
		System.out.printf("123232131231311\n");		//--��\n������
		System.out.printf("123123123123123123%n");  //--��%n������
		
		System.out.printf("%d + %d = %d\n",10,20,30);

		//--==>>
		//AAABBBCCC
		//121231231312312123232131231311
		//123123123123123123
		//10 + 20 = 30
		//����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		
		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123);	// 10��ŭ�� ����Ȯ�� �� ������ ���� ���� ����
		System.out.printf("%010d\n",123);
		
		//123
		//		 123
		//0000000123
		
		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365);
		System.out.printf("%d\n",+365);

		//+365
		//+365
		//365
		
		//System.out.printf("%-d\n",365); //--��Ÿ�� ���� �߻�
		System.out.printf("-%d\n",365);	  //--���� ǥ�� �� �տ� - ��ȣ�� �ٿ��ش�.
		System.out.printf("%d\n",-365);	  //--����� �ٸ��� ������ ��°���
		//-365
		//-365
		
		//�ڡڡڡڱ���� �� �صμ���
		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n",365);
		//(365)
		//365

		//System.out.printf("%d\n",'A');	//--��Ÿ�� ���� �߻�

		System.out.printf("%c\n",'A');		//��%c�� ���� ��� ��
		//System.out.printf("%c\n","ABCD");	//--��Ÿ�� ���� �߻�
		
		System.out.printf("%s\n","ABCD");	//��%s�� ���ڿ� ��� ��
		//--==>> A
		//		 ABCD

		System.out.printf("%h\n",365);
		System.out.printf("%o\n",24);

		//16d
		//30

		System.out.printf("%s\n","true");
		System.out.printf("%b\n",true);
		//true
		//true
	
		System.out.printf("%f\n",123.23);
		System.out.printf("%.2f\n",123.23);
		System.out.printf("%.2f\n",123.236);	//check~!!!
		System.out.printf("%8.2f\n",123.236);	//check~!!! __123.24
		System.out.printf("%2.2f\n",123.1234);	//check~!!!
		
		//123.230000
		//123.23
		//123.24
		//  123.24
		//123.12
 	}
}
//������
/*
AAABBBCCC
121231231312312123232131231311
123123123123123123
10 + 20 = 30
123
       123
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
true
123.230000
123.23
123.24
  123.24
123.12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/