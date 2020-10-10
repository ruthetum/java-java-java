package chapter16.Chatting;

import java.io.*;
import java.net.Socket;

public class Client {
    private static String IP_ADDRESS = "192.168.0.151";
    private static int PORT = 5000;
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(IP_ADDRESS, PORT);

            System.out.println("Welcome");
            BufferedReader clientInput =  new BufferedReader(new InputStreamReader(System.in));

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream output = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(output));

            Thread Receive = new Thread(new ReceiverS(socket, in));
            Receive.start();

            try {
                while (true) {
                    String msg = clientInput.readLine();
                    System.out.println("[Client] : " + msg);
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

class ReceiverS implements Runnable {
    Socket socket;
    BufferedReader in;

    public ReceiverS(Socket socket, BufferedReader in) {
        this.socket = socket;
        this.in = in;
    }

    public synchronized void run() {
        try {
            while(true) {
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println("[Server] : " + msg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
