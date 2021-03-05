//java Programm to illustrate server side
//implentation using DataGramSocket
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer{
	public static void main(String[] args) throws IOException{
		//step-1:create a socket to listen to port 1234
		DatagramSocket ds=new DatagramSocket(1234);
		byte[] receive=new byte[65535];
		DatagramPacket dpReceive=null;
		while(true){
			//step-2:create a DatagramPacket receive the data
			dpReceive=new DatagramPacket(receive,receive.length);
			//step-3: receive the data in byte buffer
			ds.receive(dpReceive);
			System.out.println("client: "+data(receive));
			//Exit the server if client sends"bye"
			if(data(receive).toString().equals("bye")){
				
				System.out.println("client send to existing ");
				break;
			}
			//clear the buffer after every message
			receive=new byte[65535];
		}
	}
	//A utility method to convert the byte array data into string representation
	public static StringBuilder data(byte[] a){
		if(a==null)
			return null;
		StringBuilder ret=new StringBuilder();
		int i=0;
		while(a[i]!=0){
			ret.append((char) a[i]);
			i++;
		}
		return ret;
	}
}