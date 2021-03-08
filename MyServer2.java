//client-server program(between two remote machine)
import java.io.*;
import java.net.*;
import java.net.InetAddress;

public class MyServer2{
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(3333,2,InetAddress.getByName("10.41.97.211"));
		
		Socket s =ss.accept();
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("stop")){
			
			str1=din.readUTF();
			System.out.println("Client says: "+str1);
			str2=br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		
		din.close();
		s.close();
		ss.close();
	}
}
		