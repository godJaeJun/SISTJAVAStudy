import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.net.InetAddress;

public class ThreadServer{
    public static void main(String[] args) throws IOException{
        PrintWriter pw = null;
        BufferedReader br = null;
        Socket socket = null;
         
        try{
            //[1]�����غ�
            ServerSocket server =new ServerSocket(8000);
            //server ��ü�� ���� ���ְ� Ŭ���̾�Ʈ�� ������ ��ٸ��� ���
             
            //[2]���ϱ��ϱ�
            System.out.println("������ ��û�� ��ٸ��ϴ�.");
            socket = server.accept();                    //���⼭ Ŭ���̾�Ʈ�� ��ٸ�.
            //Socket�� ���ߴٴ� ���� ��Ŵ���� ��Ȯ�����ٴ� ��.
             
            //[3]Ŭ���̾�Ʈ IP���ϰ�
            InetAddress addr = socket.getInetAddress();    
            //���� �ȿ� �ִ� Ŭ���̾�Ʈ�� �����Ǹ� ���ü� �ִ�.
            String ip = addr.getHostAddress();
            System.out.println(ip + "�� Ŭ���̾�Ʈ�� �����߽��ϴ�.");
             
            //[4]in, out Stream���ϱ�    
            InputStream is = socket.getInputStream();����������������//Stream    ��
            InputStreamReader isr = new InputStreamReader(is);�� �� //char          ��
            br =new BufferedReader(isr); ����������������������������//String       ��
            //br.readLine()�� ����.
             
            OutputStream os = socket.getOutputStream(); ��������������//Stream    ��
            OutputStreamWriter osw = new OutputStreamWriter(os);����//char         ��
            pw = new PrintWriter(osw);��������������������������������//String       ��
            //pw.println()�� ����.
             
            //���������� Ŭ���̾�Ʈ�� ���� ���ڿ��� �о �״�� ������.
            String msg = null;
             
            //main�����尡 Ŭ���̾�Ʈ �ϳ�(�Ѱ��� ����)�� ���ؼ��� �ݺ�(while)�ϰ��ִ�.
            while((msg = br.readLine()) != null){      //main������.
                if(msg.equals("quit")) break;            //"quit"�Է½� ����.    
                 
                System.out.println(msg);
                pw.println(msg);
                pw.flush();
            }
             
             
             
        }catch(IOException e){
            System.out.println("������ �غ���� �ʾҽ��ϴ�." + e.getMessage());
        }finally{
            try{
                if(pw != null)pw.close();
                if(br != null)br.close();
                if(socket != null)socket.close();
            }catch(Exception e){}
        }
    }
}