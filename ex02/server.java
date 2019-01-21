import java.io.*;
import java.net.*;
/*
public class server {

	public static void main(String argv[]) throws Exception {

		String firstServerString = "Exercise 2. November 2017. Itamar Chuvali";
		String clientSentence;
		
		System.out.println(firstServerString);

		ServerSocket welcomeSocket = null;
		try{
			welcomeSocket = new ServerSocket(2017);
		} 
		catch (IOException e) {
			System.out.println(e);
		}
		
		while(true){
			try(Socket connectionSocket = welcomeSocket.accept()){
				BufferedReader inFromClient =
	                    new BufferedReader(new InputStreamReader
	                    		(connectionSocket.getInputStream()));
				clientSentence = inFromClient.readLine();
	            System.out.println(clientSentence);
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
*/
import java.io.*;
import java.net.*;

public class server
{
    public static void main(String argv[]) throws Exception
    {
        String clientSentence;

        ServerSocket welcomeSocket = new ServerSocket(2017);  // bind + listen

        System.out.println("Exercise 2. November 2017. Itamar Chuvali");
        
        while(true)
        {
            try(Socket connectionSocket = welcomeSocket.accept()) {
                BufferedReader inFromClient =
                        new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

                while(true)
                {
                    clientSentence = inFromClient.readLine();  //read
                    System.out.println(clientSentence);
                }

            } catch (SocketException e) {
            	System.out.println(e);
            }
        }
    }
}
