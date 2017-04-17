import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.DataInputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class TCPSingleReceiver extends Thread
{
	DataInputStream dis;
	
    JFrame f1;
    JPanel p1;
    JLabel l1;
	
    public TCPSingleReceiver() {
    	
    	f1 = new JFrame("클라이 채팅");
    	f1.setBounds(100,100,500,600);
    	f1.setLayout(new GridLayout(4, 5));
    	
    	p1 = new JPanel();
    	p1.setBounds(0, 0, 300, 300);
    	p1.setLayout(new GridLayout(2, 2));
    	
    	l1 = new JLabel();
    	l1.setLayout(BorderLayout);
    	
    	
        f1.setVisible(true);
    	
    }
    
    
    
	
}



public class TCPSingleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		Socket socket = new Socket("172.20.10.4","7777");
				
				System.out.println("서버연결 성공");
		
	}

}
