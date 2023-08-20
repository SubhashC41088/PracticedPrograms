package collectionsFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(4999); 
		Socket s= ss.accept();
		System.out.println("client is connected");
		System.out.println("i was so exited to see my client and server connection between them...!");
	InputStreamReader in = new InputStreamReader(s.getInputStream());
	BufferedReader bf = new BufferedReader(in);
	String str = bf.readLine();
	System.out.println("client: "+str);
	PrintWriter pr = new PrintWriter(s.getOutputStream());
	pr.println("yes");
	pr.close();
	s.close();
	}

}
