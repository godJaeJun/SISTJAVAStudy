import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Vending {
	// 서버에 접속하기 위한 객체
	static Socket client;
	static int money=0;
	static String[] fruit = {"사과","딸기","복숭아","바나나"}; 
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
			// client는 소켓 - 소켓을 이용해서 getOutputStream()을 만듬
			PrintWriter pw = new PrintWriter(client.getOutputStream());

			pw.println(data);

			pw.flush(); // 즉시 넘겨줌
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
			System.out.println("원하시는 메뉴를 선택해주세요.\n");
			System.out.println("1.사과(300)\n2.딸기(400)\n3.복숭아(500)\n4.바나나(600)");
			System.out.print("과일 선택 : ");
			select = sc.nextInt();	
			menuGo(select);
		}
	}

	public static void menuGo(int num)
	{
		System.out.println(fruit[num-1]+"구입완료!!!");
		jungsan(num);
	}

	public static void jungsan(int num)
	{
		message(fruit[num-1]+"판매완료!!!");
		money += m[num-1];
		
		message("오늘의 누적판매금액 : "+money+"원");
	}

	public static void main(String[] args) {

		System.out.println("자판기에 오신걸 환영합니다.");
		message("자판기오픈");
		menuSelect();
	}
}