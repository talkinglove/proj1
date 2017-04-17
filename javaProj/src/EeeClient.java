import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class EeeClient {
	JFrame f1;
	JLabel l1;
	JPanel p1;
	JButton b1;

	public class Eee extends JFrame implements ActionListener {
		
		
		public Eee(){
		
		f1=new JFrame("메시지 전송창");
		this.setBounds(100,100,400,500);

		l1 = new JLabel();

		l1.setFont(new Font("명조체",Font.BOLD,50));
		this.add(l1,BorderLayout.SOUTH);

		p1 = new JPanel();

		p1.setLayout(new GridLayout(2,2,1,1));
		p1.setBackground(Color.BLUE);
		this.add(p1);

		b1 = new JButton("확인");

		b1.setBounds(2,2,50,50);
		p1.add(b1);

		b1.addActionListener(this);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);


		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getActionCommand().equals(b1))
			{
		
				try{
					ServerSocket server = new ServerSocket(7777);
					System.out.println("서버 준비");
					
					while(true)
					{
						
						Socket client = server.accept();
						
						OutputStream os = client.getOutputStream();
						DataOutputStream fos = new DataOutputStream(os); 
					
							
						fos.close();
						os.close();
						client.close();
					}
				
				
				
				//l1.setText("하하하");
			}				
		}
		
		////
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			new EeeClient();
		

			try {
				Socket socket = new Socket("192.168.1.19", 7777);

				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);

				System.out.println(dis.readUTF());
				System.out.println("=========");
				

				dis.close();
				is.close();
				socket.close();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}
}
	

