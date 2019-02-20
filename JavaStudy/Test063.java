/*==========================================================
			■■■ 실행 흐름의 컨트롤 (제어문) ■■■
				   - 반복문 (for문) 실습
				      - 별찍기 실습 
==========================================================*/
// ○과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.
/*
    *
   ***
  *****  
 *******
*********
 *******
  *****
   ***
    *
*/
public class Test063
{
	public static void main(String[] args)
	{
		//과제 2개를 합친 Version 
		/*
		for(int i=0;i<4;i++){			// 출력결과의 줄수가 총 5줄이기 때문에 0~4까지 반복한다.
			for(int j=4-i;j>0;j--){		// 안에서는 두가지의 반복문이 실행되는데 첫번째 반복문은 j의 시작점이 4-i로 처음은 4 그다음은 3 그다음은 2 그다음은 1
				System.out.print(" ");  // 순으로 감소하게 한다. 이것은 앞에 부분의 공백을 처리해 주는 부분으로 한바퀴 돌수록 공백이 줄기 때문에 이렇게 처리해준다.
			}							
			for(int j=0;j<2*i+1;j++){	// 이것은 별을 찍어주는 공백을 찍어주는 for문뒤에 시작해준다. 2*i+1은 즉 처음에는 i가 0이므로 결과가 1이나온다 맨위의 꼭짓점
				System.out.print("*");  // *을 찍어주는 것이다 두번째 바퀴에는 3개 다음은 5개 즉 별의 개수만큼 반복한다는 뜻이다.
			}
			System.out.println();		// 한줄을 찍어주고 개행을 처리한다.
		}
		for (int i=5;i>0;i--) 
		{
			for (int j=5-i;j>0;j--) //두번째 for문은 공백을 찍어주기 위한 for문 이므로 처음에는 돌지 않고 두번째 부터
			{								//계속 돌아야 한다 그러므로 초기값 5-i값을 줘서 0,1,2,3 총 4번 수행되게 만든다.
				System.out.print(" ");		//공백 출력
			}
			for (int k=i*2-1;k>0;k--) //두번째 for문은 별을 출력하기 위한 for문 이므로 처음에는 9번 7번 찍어줘야하므로
			{						  //초기값을 k=i*2-1로 지정해줘서 총 5번 9 7 5 3 1 만큼 별을 찍게한다.
			System.out.print("*");	  //별출력
			}
			System.out.println();	  //한줄을 찍었으면 개행한다.
		}
		//for문 두개로 푸는 Version
		*/
		for(int i=1;i<10;i++)		//i를 1부터 9까지 증가시켜 반복한다. 이유는 총 9줄이기 때문에
		{	
            for(int j=1;j<10;j++)   //별을찍는 칸을 나타낸다. 총 칸수가 9칸이다 최대 별의 개수:9개 
			{
                if(i<=5)			//5줄까지는 피라미드를 찍어야 하기 때문에 i<=5라는 조건을 걸어준다.
				{					   //별이 찍히는 규칙으로 5-i가 j보다 작고 j가 5+i보다 작을 때  
                    if(5-i<j && j<5+i) //즉 j가 5-i보다는 크고 5+i보다는 작을 때 별을 찍어준다.
					{				   
                        System.out.print("*");	//별 출력
                    }			
					else						//위의 조건이 아닐 경우
					{
                        System.out.print(" ");	//공백을 출력시켜준다.
                    }
                }
				else				//6줄 부터는 역피라미드를 찍어야 하기 때문에 else조건을 건다.
				{					//역피라미드는 피라미드와 반대로 점점 별의 개수가 작아진다.
                    if(i-5<j && j<15-i)	//j가 i-5보다 크고 j가 15(3*5) - i보다 작을 경우 별을찍어준다.
					{					//15-i는 이for문 자체가 i가 5부터 돌기 때문에 별을 9번 찍어주려면 j가 1~9까지 돌
										//수 있는 조건 식을 줘야 했다.
                        System.out.print("*");	//별 출력
                    }
					else						//아닐 경우
					{
                        System.out.print(" ");	//공백을 출력시킨다.
                    }
                }
            }
            System.out.println();				//한줄을 출력했으면 개행시켜준다.
        }	
}
//실행 결과
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/             