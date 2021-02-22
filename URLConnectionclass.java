//Example of URLConnection
import java.net.*;
import java.io.*;

public class URLConnectionclass{
	public static void main(String[] args){
		try{
			URL url=new URL("https://nptel.ac.in/cource.php");
			URLConnection urlcon=url.openConnection();
			InputStream stream = urlcon.getInputStream();
			
			int b;
			while((b=stream.read())!=-1){
				System.out.print((char) b);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}