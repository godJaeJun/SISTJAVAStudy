/*==========================================================
				���� Ŭ���� ��� ����
				  - ���(Inheritance)
==========================================================*/

// �� �ǽ� ����
//    ������ ���� ���α׷��� �����Ѵ�.
//    ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Super class
class AClass
{
	protected int x, y;
	protected char op;

	AClass()
	{
	
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n",x,op,y,result);
	}
}

class BClass extends AClass
{
	// �� Version
	/*
	BClass(int x,int y, char op)
	{
		this.x = x;
		this.y = y;
		this.op = op;
	}

	void re(){
		double result=0;
		switch(op){
			case '+':
				result = x+y;
				break;
			case '-':
				result = x-y;
				break;
			case '*':
				result = x*y;
				break;
			case '/':
				result = (x*1.0)/y;
				break;
		}
		write(result);
	}
	*/
	// ����� Version
	public boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");	//20 15
		String temp = br.readLine();							//"20 15"
		String[] str = temp.split("\\s");						//\\s => ������ ����
		// �� ���ڿ�.split("������");
		// ex) "��� ���� �ٳ��� ���� ����".split("\\s");
		//		��ȯ ->{���,����,�ٳ���,����,����}
		// ex) "10 20 30 40".split("\\s");
		//		��ȯ ->{"10","20","30","40"}
		//-------------------------------------------->String[] str = {"20","15"}
		
		if(str.length!=2)
			return false;	//-- false(����)�� ��ȯ�ϸ� input() �޼ҵ� ����
	
		//�� �� ���ǹ��� ������ ��� �Ʒ��� �ڵ���� �����ִ� ��Ȳ������
		//   �� �̻� �������� �ʰ� ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.
		
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		/*
		if(op!='+'&&op!='-'&&op!='*'&&op!='/')
			return false;
		
		return true;
		*/

		if(op=='+'||op=='-'||op=='*'||op=='/')
			return true;

		return false;
	}

	public double calc()
	{
		double result=0; 

		switch(op)
		{
			case '+' :
				result = x+y;
				break;
			case '-' :
				result = x-y;
				break;
			case '*' :
				result = x*y;
				break;
			case '/': 
				result = (double)x/y; 
				break;
		}
		return result;
	}
}
public class Test108
{
	public static void main(String[] args) throws IOException
	{
		/*
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print("������ �Է�(+ - * /) : ");
		char op = sc.next().charAt(0);

		BClass b = new BClass(x,y,op);
		b.re();
		*/
		BClass ob = new BClass();
		
		if(!ob.input())
		{
			System.out.println("Error...");
			return;
		}
		ob.write(ob.calc());
	}
}
//������
/*
������ �� ���� �Է�(���� ����) : 1 2
������ �Է�(+ - * /) : +
>> 1 + 2 = 3.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �� ���� �Է�(���� ����) : 1 3
������ �Է�(+ - * /) : -
>> 1 - 3 = -2.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/