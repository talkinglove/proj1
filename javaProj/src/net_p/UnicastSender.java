package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UnicastSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DatagramSocket ds = new DatagramSocket();
			InetAddress addr = InetAddress.getLocalHost();
			
			String buf = "������ �����尡 �׸� �����?";
			DatagramPacket data ;
			Scanner sc = new Scanner(System.in);
			while(true)
			{
				System.out.print("�Է�:");
				buf = sc.nextLine();
				data = new DatagramPacket(
						buf.getBytes(), 
						buf.getBytes().length, 
						addr, 
						7777
					);
				ds.send(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
