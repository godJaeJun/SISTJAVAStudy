/*==========================================================
			■■■ 자바의 주요(중요) 클래스 ■■■ 
				     - Random 클래스
==========================================================*/
/*
○ java.util.Random 클래스는
   
   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산들을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.

*/

// 로또 번호 생성기 (난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 2 39 40 41 42 45 
// 1 2 8 16 28 42
//.. 5줄 반복
//	1
//  1 2
//  1 2 
import java.util.Random;
import java.util.Arrays;
class Lotto
{
	// 배열 변수 선언 및 메모리 할당 -> 로또 번호를 담아둘 배열방 6개
	private int[] num = new int[6];

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;
		
		jump:
		while (cnt<6)	// cnt -> 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;	// 1 ~ 45
			
			for (int i=0; i<cnt; i++)
			{
				if(num[i] == n)
				{
					continue jump;		
				}
			}

			num[cnt++] = n;
		}
		sorting();
	}

	// 정렬 메소드
	private void sorting()
	{
		Arrays.sort(num);
	}
}
public class Test141
{
	public static void main(String[] args)
	{
		/*
		Random r = new Random();
		int[][] lotto = new int[5][6];
		int temp = 0;
		
		for(int k=0;k<lotto.length;k++)
		{
			for (int i=0;i<lotto[k].length;i++)
			{
				lotto[k][i] = r.nextInt(45)+1;
				for (int j=0;j<i;j++)
				{
					if(lotto[k][i]==lotto[k][j])
					{
						i--;
						break;
					}
				}
			}
		}

		for(int k=0;k<lotto.length;k++)
		{
			for(int i=0;i<lotto[k].length-1;i++)	
			{
				for (int j=i+1; j<lotto[k].length; j++) 
				{
					if(lotto[k][i]>lotto[k][j])		
					{
						// 자리 바꾸기
						lotto[k][i] = lotto[k][i] ^ lotto[k][j];
						lotto[k][j] = lotto[k][j] ^ lotto[k][i];
						lotto[k][i] = lotto[k][i] ^ lotto[k][j];
					}
				}
			}
		}

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.printf("%3d",lotto[i][j]);
			}
			System.out.println();
		}
		*/
		
		// Lotto 클래스 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5게임
		for (int i=1; i<=5;i++)
		{
			lotto.start();
			
			// 결과 출력
			for (int n :lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}
}
// 실행결과
/*
   6   8  25  30  33  39
  10  15  16  18  24  41
  13  18  26  28  31  41
   9  15  29  40  41  42
   1   6  17  22  28  41
*/