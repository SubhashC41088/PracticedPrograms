package collectionsFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.net.Socket;
import java.net.*;

public class Client {
		public static void main(String[] args) throws IOException {
			
			Socket s = new Socket("localhost",4999);
			PrintWriter pr = new PrintWriter(s.getOutputStream());
					pr.println("is it working");
			pr.close();
			s.close();
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader bf = new BufferedReader(in);
			String str = bf.readLine();
			System.out.println("server: "+str);
			
		}
		

}
