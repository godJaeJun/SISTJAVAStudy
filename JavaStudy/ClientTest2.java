import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest2 {
	public static void main(String[] args) {
		try {
			// ������ �����ϱ� ���� ��ü
			Socket client = new Socket("192.168.0.17", 9000);
			Scanner sc = new Scanner(System.in);
			// �����͸� �����ϱ� ���ؼ� outputstream ��ü ����
			PrintWriter pw = new PrintWriter(client.getOutputStream()); // client�� ���� - ������ �̿��ؼ� getOutputStream()�� ����
			
			while(true){
				String data = sc.nextLine(); // �� ������ �Է¹���
				
				// �����͸� �Ѱ���
				pw.println(data);
				pw.flush(); // ��� �Ѱ���
				
				if(data.equals("1")){ // 1�� ������ ����
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