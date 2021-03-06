import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Calendar;

public class VBoss {
	
	public static final String ADMIN_ID = "admin";		 // 미리 관리자의 ID를 지정.
	public static final String ADMIN_PASS = "admin1234"; // 미리 관리자의 PASS를 지정.
 	static boolean LOGIN;								 // LOGIN 여부 확인
	
	public static void date()
	{
		// Calendar 클래스 인스턴스 생성
		Calendar cal = Calendar.getInstance();

		int y,m,d,w;				//-- 연, 월, 일, 요일

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.printf("\t\t%tF %tA \n",cal,cal);
	}
	public static void main(String[] args) {
		
		// Scanner 인스턴스 생성
		Scanner s = new Scanner(System.in);

		// 사용자에게 입력받을 id와 pass
		String id,pass;
		
		// 초기 메세지 출력
		date();
		System.out.println("★일본라면 자판기 사장님 모드에 오신걸 환영합니다★\n");
		
		// 로그인 되어있지 않으면 계속 반복시킨다.
		while(!LOGIN)
		{
			// id와 pass를 입력받는다.
			System.out.print("관리자의 ID를 입력해주세요       : ");
			id = s.next();
			System.out.print("관리자의 PASSWORD를 입력해주세요 : ");
			pass = s.next();
			
			// id와 pass가 맞을 때 로그인.
			if(id.equals(ADMIN_ID)&&pass.equals(ADMIN_PASS))
			{
				System.out.println("\nLOGIN 되었습니다.\n");
				LOGIN = true;
			}
			else{
				// 실패시 안내메세지 출력.
				System.out.println("\n아이디 또는 비밀번호가 정확하지 않습니다.\n");
			}
		}

		try {
			// 소켓 클래스를 선언한다.
			Socket socket = null;

			// 네트워크로 다른 클라이언트의 데이터를 받기위해서 객체를 생성
			ServerSocket server = new ServerSocket(9000); // 포트번호 9000번

 			// 받기 위한 준비
			System.out.println("일본라면집 사장님 모드\n");
			System.out.println("자판기와 연결중입니다...\n");

			// 클라이언트로부터 넘어온 소켓을 이용하여 데이터를 주고 받음
			socket = server.accept();

			// 클라이언트가 접속 시 안내메세지 출력.
			System.out.println("자판기가 가동되었습니다.");

 			Scanner sc = new Scanner(socket.getInputStream()); // 소켓을 이용해서 getInputStream()을 만듬
			
			while(true){
				// 클라이언트로부터 데이터를 통해 넘어온 값을 읽어드림
				String data = sc.nextLine(); // 어떤게 넘어올지 모르므로 nextLine()이 적당
				System.out.println("자판기 : "+data);
				System.out.println();
			}
 		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
		}
	}
}
