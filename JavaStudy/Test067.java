/*==========================================================
			���� �޼ҵ� ���ȣ�� (��� �޼ҵ�) ����
==========================================================*/
public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	
	public static void showHi(int cnt)
	{	
		System.out.println("HI"); 
		if(cnt==1)
			return;
		showHi(--cnt);
	}	
}
//���� ���
/*

*/
