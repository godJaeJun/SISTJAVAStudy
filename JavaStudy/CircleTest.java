import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{
	int r;

	final double PI = 3.141592;
	//BufferedReader 인스턴스를 클래스에다가 생성을 해버리면 
	//호출을 할때 CircleTest를 호출한것만으로도 BufferedReader도 같이생성해버리므로 비효율
	//따라서 메소드 내부에 인스턴스 생성하는것을 권장

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	double calLength()
	{		
		double result = ( 2 * r * PI);

			return result;
	}
	double calArea()
	{
			return( r * r * PI);
	}
	void print(double a,double b)
	{
			System.out.println(">>반지름이 "+r+"인 원의");
			System.out.printf(">>넓이 : %.2f\n",a);
			System.out.printf(">>둘레 : %.2f\n",b);
	}
	
}