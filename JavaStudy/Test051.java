/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
				   - 반복문 (while문 ) 실습
==========================================================*/ 
// ○ 실습 문제
// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20
// >> 10 ~ 20 까지의 합 :xxxx
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		int sum=0;
		int n=0,m=0;
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
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
		System.out.printf(">>%d ~ %d 까지의 합 : %d\n",num1,num2,sum);
	}
}
//실행 결과
/*

*/