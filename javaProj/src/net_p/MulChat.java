package net_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//// 센더 시작


public class MulSender extends Thread implements ActionListener {

	String name;
	String ip;
	int port, kind;
	ChatForm win;
	
	public MulSender (ChatForm win, int kind, String ip, int port)
	{
		try{
		
		this.win= win;
		this.kind= kind;
		this.ip= ip;
		this.port= port;
		
		name = "["+ InetAddress.getLocalHost()+ "]";
		
	}catch(Exception e)
		{
		e.printStackTrace();
		
		}
	}
		public void run(){
			try{
				
				win.tf.addActionListener(this);
			}catch(Exception e){
			e.printStackTrace();
		}
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				MulticastSocket ms = new MulticastSocket();
				String msg="바나나 부페";
				InetAddress is = InetAddress.getByName("230.0.0.1");
				DatagramPacket ds = new DatagramPacket(
						msg.getBytes(), 
						msg.getBytes().length,
						is,
						7777
						);
				ms.send(ds);
				ms.close();
			} catch (IOException ee) {
				// TODO Auto-generated catch block
				ee.printStackTrace();
			}
			
			
		}

			
		}
	
////센더 끝		
		
	//////////리시버 시작
		
		class MulChatReciever extends Thread {
			
			//////////
			
			int port;
			ChatForm win;
			
			
			/**
			 * @param win
			 * @param port
			 */
			public MulChatReciever(ChatForm win, int port) {
				this.win = win;
				this.port = port;
			}
			///////////////
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					DatagramSocket ds = new DatagramSocket(port);
				
					byte [] arr = new byte[1024];
					DatagramPacket data = new DatagramPacket(arr, arr.length);
					
					while(true)
					{
						
						ds.receive(data);
						win.ta.append("\n"+new String(arr).trim());
		                win.ta.setCaretPosition(win.ta.getDocument().getLength());
				
					}
					
				
				} catch (Exception eee) {
					// TODO Auto-generated catch block
					eee.printStackTrace();
				}
			}
		}
			
		
		/////////////리시버 끝	
	
			class ChatForm extends JFrame
			{
				String myIp;
			    public JTextArea ta;
			    public JTextField tf,portNum,ipNum ;
			    MulSender sender;
			    
			    public ChatForm(String name)
			    {
			    	
			        super(name);
			        
			        try {
						myIp = InetAddress.getLocalHost().getHostAddress();
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					myIp = myIp.substring(0,myIp.lastIndexOf(".")+1);
					
					
			        setBounds(100, 0, 300, 500);
			        ta= new JTextArea();
			        tf= new JTextField();
			        ipNum= new JTextField("029");
			        portNum= new JTextField("7777");
			        JPanel top = new JPanel();
			        
			        JRadioButton single=new JRadioButton("싱글", true);
			        JRadioButton board=new JRadioButton("벙글");
			        
			        ButtonGroup bg = new ButtonGroup();
			        
			        bg.add(single);
			        bg.add(board);
			        
			        
			        top.add(single);
			        top.add(new JLabel(myIp));
			        top.add(ipNum);
			        top.add(board);
			        top.add(portNum);
			        
			        /*single.addActionListener(new RadioListen(this, 0));
			        board.addActionListener(new RadioListen(this, 1));
			       */

			        JScrollPane jsp = new JScrollPane(ta);
			        
			       
			        add(top,"North");
			        add(tf,"South"); 
			        add(jsp,"Center");
			       
			        setVisible(true);
			        setDefaultCloseOperation(EXIT_ON_CLOSE);
			        
			    }
			}	
			
			
			public class MulChat{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			MulticastSocket ms = new MulticastSocket();
			String msg="라라랜드";
			InetAddress is = InetAddress.getByName("230.0.0.1");
			DatagramPacket ds = new DatagramPacket(
					msg.getBytes(), 
					msg.getBytes().length,
					is,
					7777
					);
			ms.send(ds);
			ms.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
			}
		
	
	


