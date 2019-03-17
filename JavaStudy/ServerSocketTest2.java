import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class VBoss {

 	public static void main(String[] args) {

		try {
			// 소켓 클래스를 선언한다.
			Socket socket = null;
			// 네트워크로 다른 클라이언트의 데이터를 받기위해서 객체를 생성
			ServerSocket server = new ServerSocket(9000); // 포트번호 9000번

 			// 받기 위한 준비
			System.out.println("일본라면집 BOSS MODE");
			// 클라이언트로부터 넘어온 소켓을 이용하여 데이터를 주고 받음
			socket = server.accept();

			System.out.println("자판기가 가동되었습니다.");

 			Scanner sc = new Scanner(socket.getInputStream()); // 소켓을 이용해서 getInputStream()을 만듬
			
			while(true){
				// 클라이언트로부터 데이터를 통해 넘어온 값을 읽어드림
				String data = sc.nextLine(); // 어떤게 넘어올지 모르므로 nextLine()이 적당
				System.out.println("자판기 : "+data);
			}

 		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
		}
	}
}
