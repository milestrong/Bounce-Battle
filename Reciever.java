import java.net.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Reciever implements Runnable {
	private Socket server;
    private String name;

    public Reciever(Socket server, String name){
        this.server = server;
        this.name = name;
    }

    public void run() {
        
        /* Read data from the ClientSocket */
        boolean flag = true;
            while(true){
                try{
                    DataInputStream in = new DataInputStream(server.getInputStream());
                    System.out.println(in.readUTF());
                    //if(in.readUTF() == "quit()") break;
                }catch(IOException e){
                }
            }
    }
}