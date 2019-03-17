import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Calendar;

public class VBoss {
	
	public static final String ADMIN_ID = "admin";		 // �̸� �������� ID�� ����.
	public static final String ADMIN_PASS = "admin1234"; // �̸� �������� PASS�� ����.
 	static boolean LOGIN;								 // LOGIN ���� Ȯ��
	
	public static void date()
	{
		// Calendar Ŭ���� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		int y,m,d,w;				//-- ��, ��, ��, ����

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.printf("\t\t%tF %tA \n",cal,cal);
	}
	public static void main(String[] args) {
		
		// Scanner �ν��Ͻ� ����
		Scanner s = new Scanner(System.in);

		// ����ڿ��� �Է¹��� id�� pass
		String id,pass;
		
		// �ʱ� �޼��� ���
		date();
		System.out.println("���Ϻ���� ���Ǳ� ����� ��忡 ���Ű� ȯ���մϴ١�\n");
		
		// �α��� �Ǿ����� ������ ��� �ݺ���Ų��.
		while(!LOGIN)
		{
			// id�� pass�� �Է¹޴´�.
			System.out.print("�������� ID�� �Է����ּ���       : ");
			id = s.next();
			System.out.print("�������� PASSWORD�� �Է����ּ��� : ");
			pass = s.next();
			
			// id�� pass�� ���� �� �α���.
			if(id.equals(ADMIN_ID)&&pass.equals(ADMIN_PASS))
			{
				System.out.println("\nLOGIN �Ǿ����ϴ�.\n");
				LOGIN = true;
			}
			else{
				// ���н� �ȳ��޼��� ���.
				System.out.println("\n���̵� �Ǵ� ��й�ȣ�� ��Ȯ���� �ʽ��ϴ�.\n");
			}
		}

		try {
			// ���� Ŭ������ �����Ѵ�.
			Socket socket = null;

			// ��Ʈ��ũ�� �ٸ� Ŭ���̾�Ʈ�� �����͸� �ޱ����ؼ� ��ü�� ����
			ServerSocket server = new ServerSocket(9000); // ��Ʈ��ȣ 9000��

 			// �ޱ� ���� �غ�
			System.out.println("�Ϻ������ ����� ���\n");
			System.out.println("���Ǳ�� �������Դϴ�...\n");

			// Ŭ���̾�Ʈ�κ��� �Ѿ�� ������ �̿��Ͽ� �����͸� �ְ� ����
			socket = server.accept();

			// Ŭ���̾�Ʈ�� ���� �� �ȳ��޼��� ���.
			System.out.println("���ǱⰡ �����Ǿ����ϴ�.");

 			Scanner sc = new Scanner(socket.getInputStream()); // ������ �̿��ؼ� getInputStream()�� ����
			
			while(true){
				// Ŭ���̾�Ʈ�κ��� �����͸� ���� �Ѿ�� ���� �о�帲
				String data = sc.nextLine(); // ��� �Ѿ���� �𸣹Ƿ� nextLine()�� ����
				System.out.println("���Ǳ� : "+data);
				System.out.println();
			}
 		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
		}
	}
}
