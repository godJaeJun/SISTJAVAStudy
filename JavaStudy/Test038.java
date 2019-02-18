/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
					   - if ~ else문 실습
==========================================================*/

// ○ 과제
// 사용자로부터 알파벳 한 문자를 입력받아
// 이를 판별하여 입력받은 알파벳이 모음일 경우만
// 결과를 출력하는 프로그램을 구현한다.
// 단, 대소문자를 모두 적용할 수 있도록 처리한다.
// 또한, 알파벳 이외의 문자가 입력되었을 경우
// 입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : e
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : B
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : 1
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...
//'a, e, i, o, u' 모음의 종류
// 97,101,105,111,117
import java.io.IOException;	//IOException을 불러온다.
public class Test038
{
	public static void main(String[] args) throws IOException	//IOException예외처리
	{
		//안내 메세지를 출력한다.
		System.out.print("알파벳 한 문자 입력 : ");	
		// 알파벳을 입력받는다.
		int c = System.in.read();
		
		// 입력받은 정수형 변수가 ASCII코드로 알파벳에 해당할 때 if문 안으로 들어간다.
		if((c>=65&&c<=90)||(c>=97&&c<=122)){
			if(c>=65&&c<=90){			//65~90는 대문자 이므로 소문자로 통일 시켜주기 위해 32를 더해준다.
				c = c+32;
			}
			if(c==97 || c==101 || c==105 || c==111 || c==117){	//소문자일때 ASCII 97 101 105 111 117은 a i e o u이므로 이 조건에 만족할 시
				System.out.println(">> 모음 OK~!!!");			//모음을 출력한다.
			}
		}
		else{	//알파벳이 아닌 다른 문자를 입력했을 경우
			System.out.println(">> 입력 오류~!!!");	//입력오류를 출력한다.
		}
	}
}
//실행결과
/*
알파벳 한 문자 입력 : A
>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : b
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : e
>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : 1
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/