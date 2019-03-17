import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Vending {
	// ������ �����ϱ� ���� ��ü
	static Socket client;
	static int money=0;
	static String[] fruit = {"���","����","������","�ٳ���"}; 
	static int[] m = {300,400,500,600};

	static{

		try{
			client = new Socket("192.168.0.17", 9000);
		}
		catch (UnknownHostException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
	 }

	public static void message(String data)
	{
		try{
			// client�� ���� - ������ �̿��ؼ� getOutputStream()�� ����
			PrintWriter pw = new PrintWriter(client.getOutputStream());

			pw.println(data);

			pw.flush(); // ��� �Ѱ���
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void menuSelect()
	{
		int select;
		Scanner sc =new Scanner(System.in);

		while(true){
			System.out.println("���Ͻô� �޴��� �������ּ���.\n");
			System.out.println("1.���(300)\n2.����(400)\n3.������(500)\n4.�ٳ���(600)");
			System.out.print("���� ���� : ");
			select = sc.nextInt();	
			menuGo(select);
		}
	}

	public static void menuGo(int num)
	{
		System.out.println(fruit[num-1]+"���ԿϷ�!!!");
		jungsan(num);
	}

	public static void jungsan(int num)
	{
		message(fruit[num-1]+"�ǸſϷ�!!!");
		money += m[num-1];
		
		message("������ �����Ǹűݾ� : "+money+"��");
	}

	public static void main(String[] args) {

		System.out.println("���Ǳ⿡ ���Ű� ȯ���մϴ�.");
		message("���Ǳ����");
		menuSelect();
	}
}