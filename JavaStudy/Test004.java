/*================================= =========================
				■■■자바의 개요 및 특징■■■
			          -키워드 및 식별자
					   -변수와 자료형
				        Test004.java
==========================================================*/

public class Test004
{
	public static void main(String[] args)
	{
		//double height = 171.6;
		//int age = 27;
		//char degree = 'A';

		String name = "이재준";
		//String name = "권홍비" //-- 컴파일 에러
		
		// ※ 스코프 영역 안에서 변수명은 식별자~!!!

		//String #name = "김경환";
		//-- 『$』와『_』를 제외한 다른 특수문자는 
		// 변수의 이름으로 활용할 수 없다.
		// 하지만 사용 가능한 이들 특수문자들 마저도
		// 함부로 사용 하는 것은 고려해야 한다.

		String _tel="1111";
		String 주소 = "서울시 마포구";
		//-- 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		//	 실무적인 측면에서 접근한다면
		//   절대로 한글 단어를 변수명으로 사용해서는 안된다.

		int $age=23;

		//결과 출력
		System.out.println("name : "+ name);
		System.out.println("_tel : "+ _tel);
		System.out.println("주소 : "+주소);
		System.out.println("$age : "+$age);
	}
}

//실행 결과
/*


*/
