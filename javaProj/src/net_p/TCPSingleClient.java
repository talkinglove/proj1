package net_p;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;



public class TCPSingleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket socket = new Socket("192.168.0.29", 7777);
			TCPSingleGUI win = new TCPSingleGUI("Ŭ���̾�Ʈ");
			//System.out.println("�������� ����");
			win.ta.setText("�������� ����");
			
			new TCPSingleReceiver(socket,win).start();
			new TCPSingleSender(socket,win).start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
