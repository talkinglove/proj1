package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class TCPMulServer {
	
	ArrayList<DataOutputStream>list =new ArrayList<>();
	
	public TCPMulServer() {
		// TODO Auto-generated constructor stub
		Collections.synchronizedList(list);
		
		try {
			ServerSocket server = new ServerSocket(7777);
			
			System.out.println("���� ����");
			
			while(true)
			{
				Socket client = server.accept();
				new TCPMulSrvReceiver(client).start();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	class TCPMulSrvReceiver extends Thread
	{
		DataInputStream dis;
		DataOutputStream dos;
		/**
		 * @param dis
		 * @param dos
		 */
		public TCPMulSrvReceiver(Socket socket) {
			try {
				this.dis = new DataInputStream(socket.getInputStream());
				this.dos = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			String name=null;
			try {
				name=dis.readUTF();
				sendToAll("### "+name+" ����");
				list.add(dos);
				sendToAll("### ������ ��:"+list.size());
				//System.out.println("### "+name+" ����");
				//System.out.println("### ������ ��:"+list.size());
				while(dis!=null)
				{
					sendToAll(dis.readUTF());
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}finally{
				list.remove(dos);
				sendToAll("### "+name+" ����");
				sendToAll("### ������ ��:"+list.size());
				//System.out.println("### "+name+" ����");
				//System.out.println("### ������ ��:"+list.size());
			}
		}
		
	}
	
	void sendToAll(String msg)
	{
		
		for(DataOutputStream dos: list)
		{
			try {
				dos.writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TCPMulServer();
	}

}
