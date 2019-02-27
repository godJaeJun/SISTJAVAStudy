// 2. Sungjuck 클래스
//    - 인원수를 입력받아, 입력받은 인원 수 만큼
//      이름, 국어점수, 영어점수, 수학점수를 입력받고
//      총점과 평균을 산출하는 클래스로 설계할 것~!!!
//    - 속성 : 인원수, Record 형태의 배열
//    - 기능 : 인원수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력
// 실행 예)
// 인원수 입력(1~100) : 102
// 인원수 입력(1~100) : -10
// 인원수 입력(1~100) : 3
// 1번째 학생의 이름 입력 : 김정규
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70
// 2번째 학생의 이름 입력 : 김성희
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62
// 3번째 학생의 이름 입력 : 김선아
// 국어 점수 : 98
// 영어 점수 : 88
// 수학 점수 : 78
import java.util.Scanner;
class Sungjuck
{
	int num;
	Record[] st;
	Scanner sc = new Scanner(System.in);

	void pInput(){
		do{
		System.out.print("인원수 입력(1~100) : ");
		num = sc.nextInt();
		}while(num<1||num>100);

		st = new Record[num];
	}

	void sInput(){
		for(int i=0;i<num;i++)
		{	
			int[] score = new int[3];
			st[i] = new Record();
			/*
			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			st[i].name = sc.next();
			System.out.print("국어 점수 : ");
			st[i].sub1 = sc.nextInt();
			System.out.print("영어 점수 : ");
			st[i].sub2 = sc.nextInt();
			System.out.print("수학 점수 : ");
			st[i].sub3 = sc.nextInt();
			*/

			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			st[i].setName(sc.next());
			System.out.print("국어 점수 : ");
			score[0] = sc.nextInt();
			System.out.print("영어 점수 : ");
			score[1] = sc.nextInt();
			System.out.print("수학 점수 : ");
			score[2] = sc.nextInt();
			st[i].setScore(score);
		}
	}
	void sa()
	{
		/*
		for(int i=0;i<num;i++)
		{
			st[i].sum = st[i].sub1+st[i].sub2+st[i].sub3;
			
			st[i].avg = st[i].sum/3.0;
		}
		for (int i = 0; i < num; i++) {
			st[i].rank = 1;
			for(int j=0;j<num;j++)
			{
				if(st[i].avg<st[j].avg)
				{
					st[i].rank+=1;
				}
			}
        }
		*/
		for(int i=0;i<num;i++)
		{
			int[] score = new int[3];
			score = st[i].getScore();
			st[i].setSum(score[0]+score[1]+score[2]);
			st[i].setAvg(st[i].getSum()/3.0);
		}
		for(int i=0; i<num;i++)
		{
			int rank = 1;
			for(int j=0;j<num;j++)
			{
				if(st[i].getAvg()<st[j].getAvg())
				{
					rank++;
				}
			}
			st[i].setRank(rank);
		}
	}

	//결과 출력
	void print()
	{
		/*
		System.out.println();
		for(int i=0;i<num;i++)
		{
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",st[i].name,st[i].sub1,st[i].sub2,st[i].sub3,st[i].sum,st[i].avg,st[i].rank);
		}
		*/
		System.out.println();
		for(int i=0;i<num;i++)
		{
			int[] score = new int[3];
			score = st[i].getScore();
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",st[i].getName(),score[0],score[1],score[2],st[i].getSum()
				,st[i].getAvg(),st[i].getRank());
		}
	}
	
}