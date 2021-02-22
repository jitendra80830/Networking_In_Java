//Example of URL class
import java.net.*;

public class URLclass{
	public static void main(String[] args){
		try{
			URL url=new URL("https://nptel.ac.in/cource.php");
			
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host Name: "+url.getHost());
			System.out.println("POrt Name: "+url.getPort());
			System.out.println("File Name: "+url.getFile());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}