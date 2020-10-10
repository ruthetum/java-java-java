package chapter16.Chatting;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static int PORT = 5000;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(PORT);

            System.out.println("Welcome");
            BufferedReader serverInput =  new BufferedReader(new InputStreamReader(System.in));

            Socket client = server.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            OutputStream output = client.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(output));

            Thread Receive = new Thread(new ReceiverC(client, in));
            Receive.start();

            try {
                while (true) {
                    String msg = serverInput.readLine();
                    System.out.println("[Server] : " + msg);
                    pw.println(msg);
                    pw.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ReceiverC implements Runnable {
    Socket socket;
    BufferedReader in;

    public ReceiverC(Socket socket, BufferedReader in) {
        this.socket = socket;
        this.in = in;
    }

    public synchronized void run() {
        try {
            while(true) {
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("[Client] : " + msg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}