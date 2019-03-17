import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class VBoss {

 	public static void main(String[] args) {

		try {
			// ���� Ŭ������ �����Ѵ�.
			Socket socket = null;
			// ��Ʈ��ũ�� �ٸ� Ŭ���̾�Ʈ�� �����͸� �ޱ����ؼ� ��ü�� ����
			ServerSocket server = new ServerSocket(9000); // ��Ʈ��ȣ 9000��

 			// �ޱ� ���� �غ�
			System.out.println("�Ϻ������ BOSS MODE");
			// Ŭ���̾�Ʈ�κ��� �Ѿ�� ������ �̿��Ͽ� �����͸� �ְ� ����
			socket = server.accept();

			System.out.println("���ǱⰡ �����Ǿ����ϴ�.");

 			Scanner sc = new Scanner(socket.getInputStream()); // ������ �̿��ؼ� getInputStream()�� ����
			
			while(true){
				// Ŭ���̾�Ʈ�κ��� �����͸� ���� �Ѿ�� ���� �о�帲
				String data = sc.nextLine(); // ��� �Ѿ���� �𸣹Ƿ� nextLine()�� ����
				System.out.println("���Ǳ� : "+data);
			}

 		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
		}
	}
}