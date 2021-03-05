//UDPclient
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient{
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		//step1:create the socket object for carrying data
		DatagramSocket	ds=new DatagramSocket();
		
		InetAddress ip=InetAddress.getLocalHost();
		byte buf[]=null;
		//loop while user not enter bye
		while(true){
			
			String inp=sc.nextLine();
			//Convert the string input into byte array
			buf=inp.getBytes();
			
			//step2: create the datagrampaket fot sending the data
			DatagramPacket dpSend=new DatagramPacket(buf,buf.length,ip,1234);
			
			//step3:invoke the send call to actual send the data
			ds.send(dpSend);
			
			//create the loop if user enter "bye"
			if(inp.equals("bye"))
				break;
		}
	}
}