/*==========================================================
			■■■ 메소드 재귀호출 (재귀 메소드) ■■■
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
//실행 결과
/*

*/

