import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest2 {
	public static void main(String[] args) {
		try {
			// 서버에 접속하기 위한 객체
			Socket client = new Socket("192.168.0.17", 9000);
			Scanner sc = new Scanner(System.in);
			// 데이터를 전송하기 위해서 outputstream 객체 생성
			PrintWriter pw = new PrintWriter(client.getOutputStream()); // client는 소켓 - 소켓을 이용해서 getOutputStream()을 만듬
			
			while(true){
				String data = sc.nextLine(); // 줄 단위로 입력받음
				
				// 데이터를 넘겨줌
				pw.println(data);
				pw.flush(); // 즉시 넘겨줌
				
				if(data.equals("1")){ // 1을 누르면 종료
					pw.close();
					break;
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}